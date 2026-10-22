package demo.Security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.Security.entity.Task;

public interface TaskRepo extends JpaRepository<Task, Integer> {

}
