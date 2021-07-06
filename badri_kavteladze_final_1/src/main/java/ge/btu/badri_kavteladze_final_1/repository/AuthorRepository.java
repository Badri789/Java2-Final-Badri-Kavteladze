package ge.btu.badri_kavteladze_final_1.repository;

import ge.btu.badri_kavteladze_final_1.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
