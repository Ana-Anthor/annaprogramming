package com.annaprogramming.blog.enumeration;

public enum BlogStatus {
    PUBLISHED("PUBLISHED"),
    DRAFT("DRAFT");

    private final String blogStatus;

    BlogStatus(String blogStatus) {
        this.blogStatus = blogStatus;
    }

    String getBlogStatus() {
        return blogStatus;
    }
}
