package com.annaprogramming.blog.dao;

import com.annaprogramming.blog.model.Blogpost;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("postgres")
public class BlogpostDataAccessService implements BlogpostDao {
    @Override
    public Blogpost insertBlogpost(UUID id, Blogpost blogpost) {
        return null;
    }

    @Override
    public Optional<Blogpost> selectBlogpostById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Boolean deleteBlogpostById(UUID id) {
        return null;
    }

    @Override
    public int updateBlogpostById(UUID id, Blogpost blogpost) {
        return 0;
    }

    @Override
    public List<Blogpost> selectAllBlogposts() {
        return List.of(new Blogpost(UUID.randomUUID(), "FROM POSTGRESS DB", "FROM POSTGRESS DB"));
    }
}
