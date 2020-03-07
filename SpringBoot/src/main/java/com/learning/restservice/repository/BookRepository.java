package com.learning.restservice.repository;

import com.learning.restservice.model.BookModel;
import org.springframework.data.repository.CrudRepository;

//It is a interface which extends CRUDRepository, first param is model Class and second param is datatype of Id
public interface BookRepository extends CrudRepository<BookModel, String> {

}
