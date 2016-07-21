package sk.test.da.mysql.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import sk.test.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
