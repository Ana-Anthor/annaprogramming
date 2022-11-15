package com.annaprogramming.blog.service;

import com.annaprogramming.blog.model.Blogpost;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BlogpostService {
    Blogpost createBlogpost(Blogpost blogpost);
    List<Blogpost> getAllBlogpost();
    Optional<Blogpost> getBlogpostById(UUID id);
    Boolean deleteBlogpostById(UUID id);
    int updateBlogpostById(UUID id, Blogpost blogpost);

}