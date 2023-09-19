package com.example.Gira.filter;

import com.example.Gira.repository.UserRepository;
import com.example.Gira.utils.JwtHelper;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
//Tất cả request đều phải chạy vào filter
public class JwtFilter extends OncePerRequestFilter {
    /**
     * Nhận được token truyền trên header
     * Giải mã token
     * Nếu giải mã thành công thì hợp lệ
     * Tạo chứng thực và cho phép đi vào link người dùng gọi
     */

    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private UserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
//      Lấy header có key là authorization
            String header = request.getHeader("Authorization");
            if (header.startsWith("Bearer ")) {
                String token = header.substring(7);
                Claims claims = jwtHelper.decodeToken(token);
                if (claims != null) {
                    //Tạo chứng thực cho Spring Security

                    //lấy username từ token
                    String username = claims.getSubject();
                    String role = ((userRepository.findByUsername(username)).getPermissionGroup()).getName();

                    // Create a list of authorities based on user roles/authorities
                    List<GrantedAuthority> authorities = new ArrayList<>();
                    authorities.add(new SimpleGrantedAuthority(role));

                    // Set the authentication token in the SecurityContext
                    SecurityContext securityContext = SecurityContextHolder.getContext();
                    UsernamePasswordAuthenticationToken user = new UsernamePasswordAuthenticationToken(username, null, authorities);
                    securityContext.setAuthentication(user);
                }
            }
        }catch (Exception e) {

        }
        filterChain.doFilter(request,response);
    }
}
