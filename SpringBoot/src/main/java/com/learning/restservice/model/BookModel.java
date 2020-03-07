package com.learning.restservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

//@Getter
//@Setter
@Document(collection = "Book")
public class BookModel {

    @Id
    public String id;
    private String bookName;
    private int authorId;
    private float rating;
    private String publisherName;
    private String datePublished;

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public float getRating() {
        return rating;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getDatePublished() {
        return datePublished;
    }
}
