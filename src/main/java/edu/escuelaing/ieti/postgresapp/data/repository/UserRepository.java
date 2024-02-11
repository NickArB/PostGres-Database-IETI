package edu.escuelaing.ieti.postgresapp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.escuelaing.ieti.postgresapp.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}


