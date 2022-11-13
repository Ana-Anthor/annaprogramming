package com.annaprogramming.blog.model;

import com.annaprogramming.blog.enumeration.BlogStatus;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;
@Entity
public class Blogpost {
    @Id
    public UUID idNumber;
    private BlogStatus blogStatus;
    @NotNull(message = "You have to set a Tile for your blogpost")
    private String title;
    @NotNull(message = "You have select a author for your blogpost")
    private String author; //TODO: change to class Author
    private Date createdDate; //TODO: check if createdDate is correct
    private Date publishedDate; //TODO: change datatype to Date


    public Blogpost() {
    }

    public Blogpost(String title, String author) { //TODO: is this constructor correct or is empty constructor correct?
        this.idNumber = UUID.randomUUID();
        this.blogStatus = BlogStatus.DRAFT;
        this.title = title;
        this.author = author;
        this.createdDate = new Date();
    }

    //TODO: is method necessary?
    public boolean publishPost(){
        if (blogStatus == BlogStatus.DRAFT) {
            blogStatus = BlogStatus.PUBLISHED;
            this.publishedDate = new Date();
            return true;
        } return false;
    }
    //TODO: is method necessary?
    public boolean unPublishPost(){
        if (blogStatus == BlogStatus.PUBLISHED) {
            blogStatus = BlogStatus.DRAFT;
            return true;
        } return false;
    }
    //TODO: is method necessary?
    public Date getCreatedDate() {
        return this.createdDate;
    }
    //TODO: is method necessary?
    public Date getPublishedDate() {
        if (blogStatus == BlogStatus.PUBLISHED){
            return this.publishedDate;
        }
        return null; //TODO: create error-message
    }


}
