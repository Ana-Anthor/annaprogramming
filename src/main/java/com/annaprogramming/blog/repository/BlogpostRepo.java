package com.annaprogramming.blog.repository;

import com.annaprogramming.blog.model.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlogpostRepo extends JpaRepository<Blogpost, UUID> {
}