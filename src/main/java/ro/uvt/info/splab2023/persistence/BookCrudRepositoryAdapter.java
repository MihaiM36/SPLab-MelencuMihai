package ro.uvt.info.splab2023.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import ro.uvt.info.splab2023.models.Book;
import ro.uvt.info.splab2023.persistence.BooksRepository;

import java.util.Optional;

@Service
public class BookCrudRepositoryAdapter implements BookCrudRepository {

    private final BooksRepository booksRepository;

    @Autowired
    public BookCrudRepositoryAdapter(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }


    @Override
    public <S extends Book> S save(@NonNull S entity) {
        return booksRepository.save(entity);
    }

    @Override
    public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
        return booksRepository.saveAll(entities);
    }



    @Override
    public Optional<Book> findById(Long aLong) {
        return booksRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Book> findAll() {
        return null;
    }

    @Override
    public Iterable<Book> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Book entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Book> entities) {

    }

    @Override
    public void deleteAll() {

    }

}