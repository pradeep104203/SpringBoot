pradeeppackage com.pradeep.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
