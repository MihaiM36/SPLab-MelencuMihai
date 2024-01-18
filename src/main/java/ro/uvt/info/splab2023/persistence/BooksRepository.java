package ro.uvt.info.splab2023.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splab2023.models.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}
