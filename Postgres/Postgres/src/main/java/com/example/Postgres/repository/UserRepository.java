package com.example.Postgres.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Postgres.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

