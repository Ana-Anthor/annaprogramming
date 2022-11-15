package com.annaprogramming.blog.service;

import com.annaprogramming.blog.model.Blogpost;

import java.util.Collection;
import java.util.UUID;

public interface BlogpostService {
    Blogpost create(Blogpost blogpost);
    Collection<Blogpost> list();
    Blogpost get(UUID id);
    Blogpost update(Blogpost blogpost);
    Boolean delete(UUID id);
}