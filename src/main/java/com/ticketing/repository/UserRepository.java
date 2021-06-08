package com.ticketing.repository;



import com.ticketing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String description);

    @Transactional
    void deleteByUserName(String username);
}
