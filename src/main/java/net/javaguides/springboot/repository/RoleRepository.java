package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Collection<Role> findByName(String name);
}