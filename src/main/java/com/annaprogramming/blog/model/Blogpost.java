package com.annaprogramming.blog.model;

import com.annaprogramming.blog.enumeration.BlogStatus;

import java.util.UUID;

public class Blogpost {

    public UUID idNumber;
    private BlogStatus blogStatus;

    private String author; //TODO: change to class Author
    private String createdDate; //TODO: change datatype to Date
    private String publishedDate; //TODO: change datatype to Date
    private String lastUpdatedDate; //TODO: change datatype to Date
    //TODO: title
    //TODO: text
    //TODO: coverimage
    //TODO: images

    //constructor
    public Blogpost() {
        idNumber = UUID.randomUUID();
        blogStatus = BlogStatus.DRAFT;
    }

    public boolean publishPost(){
        if (blogStatus == BlogStatus.DRAFT) {
            blogStatus = BlogStatus.PUBLISHED;
            return true;
        } return false;
    }

    public boolean unPublishPost(){
        if (blogStatus == BlogStatus.PUBLISHED) {
            blogStatus = BlogStatus.DRAFT;
            return true;
        } return false;
    }


}
