package ge.btu.badri_kavteladze_final_1.repository;

import ge.btu.badri_kavteladze_final_1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
