package com.example.homeservicespringmvc.repository;

import com.example.homeservicespringmvc.entity.capability.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token,Long> {

  Optional<Token> findByTokenValue(String tokenValue);
}
