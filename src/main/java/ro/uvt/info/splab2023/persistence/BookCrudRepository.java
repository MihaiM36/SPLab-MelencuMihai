package ro.uvt.info.splab2023.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splab2023.models.Book;


@Repository
public interface BookCrudRepository extends CrudRepository<Book, Long> {

}