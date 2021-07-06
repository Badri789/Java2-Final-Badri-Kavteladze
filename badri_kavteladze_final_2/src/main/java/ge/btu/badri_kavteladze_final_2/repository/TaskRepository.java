package ge.btu.badri_kavteladze_final_2.repository;

import ge.btu.badri_kavteladze_final_2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
