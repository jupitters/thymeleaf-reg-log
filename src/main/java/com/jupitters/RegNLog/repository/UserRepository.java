package com.jupitters.RegNLog.repository;

import com.jupitters.RegNLog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
