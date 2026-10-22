package demo.Security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.Security.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
