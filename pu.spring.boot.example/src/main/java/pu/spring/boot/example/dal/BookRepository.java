package pu.spring.boot.example.dal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pu.spring.boot.example.bo.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
List<Book> findByTitle(String title);
}