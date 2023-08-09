package com.example.Gira.repository;

import com.example.Gira.entity.AcctStatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcctStatRepository extends JpaRepository<AcctStatEntity, Integer> {
    AcctStatEntity findById(int id);
}
