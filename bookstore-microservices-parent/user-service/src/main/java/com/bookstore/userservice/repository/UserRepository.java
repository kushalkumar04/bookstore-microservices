/*
 * User Repository
 * Handles database operations for User entity
 */

package com.bookstore.userservice.repository;

import com.bookstore.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}