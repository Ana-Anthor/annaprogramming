package com.annaprogramming.blog.model;

import com.annaprogramming.blog.enumeration.BlogStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;
@Entity
public class Blogpost {
    @Id
    public UUID id;
    private BlogStatus blogStatus;
    @NotBlank(message = "You have to set a Tile for your blogpost")
    private String title;
    @NotBlank(message = "You have select a author for your blogpost")
    private String author; //TODO: change to class Author
    private Date createdDate; //TODO: check if createdDate is correct
    private Date publishedDate; //TODO: change datatype to Date


    public Blogpost() {
    }

    public Blogpost(@JsonProperty("id") UUID id,
                    @JsonProperty("title") String title,
                    @JsonProperty("author") String author) {
        this.id = id;
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

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public UUID getId(){
        return id;
    }


}
