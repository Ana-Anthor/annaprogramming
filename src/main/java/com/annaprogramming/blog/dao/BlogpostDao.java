package com.annaprogramming.blog.dao;

import com.annaprogramming.blog.model.Blogpost;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BlogpostDao {

    Blogpost insertBlogpost(UUID id, Blogpost blogpost);

    default Blogpost insertBlogpost(Blogpost blogpost){
        UUID id = UUID.randomUUID();
        return insertBlogpost(id, blogpost);
    }

    Optional<Blogpost> selectBlogpostById(UUID id);

    Boolean deleteBlogpostById(UUID id);

    int updateBlogpostById(UUID id, Blogpost blogpost);

    List<Blogpost> selectAllBlogposts();

}

