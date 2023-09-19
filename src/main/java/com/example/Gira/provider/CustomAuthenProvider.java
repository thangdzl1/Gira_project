package com.example.Gira.provider;

import com.example.Gira.entity.PermissionGroupEntity;
import com.example.Gira.entity.UserEntity;
import com.example.Gira.repository.PermissionGroupRepository;
import com.example.Gira.repository.UserRepository;
import com.example.Gira.service.Imp.PermissionGroupServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomAuthenProvider implements AuthenticationProvider {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    @Lazy
    private PasswordEncoder passwordEncoder;

    @Autowired
    private PermissionGroupRepository permissionGroupRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        //Lấy username người dùng truyền vào
        String username = authentication.getName();
        //Lấy password người dùng truyền vào
        String password = authentication.getCredentials().toString();
        UserEntity user = userRepository.findByUsername(username);
        if (user!=null && passwordEncoder.matches(password,user.getPassword())){
            //Đăng nhập thành công
            //Tạo collection authorities
            ArrayList<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(((user.getPermissionGroup()).getName())));
            return new UsernamePasswordAuthenticationToken(username,user.getPassword(),authorities);
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {

        //khai báo loại chứng thực cho AuthenProvider sử dụng để so sánh
        return authentication.equals(UsernamePasswordAuthenticationToken.class);

    }
}
