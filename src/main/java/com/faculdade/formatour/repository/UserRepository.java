package com.faculdade.formatour.repository;

import com.faculdade.formatour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
