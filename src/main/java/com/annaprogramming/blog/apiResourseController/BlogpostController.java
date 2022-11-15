package com.annaprogramming.blog.apiResourseController;

import com.annaprogramming.blog.model.Blogpost;
import com.annaprogramming.blog.service.BlogpostService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/blogpost")
@RestController
public class BlogpostController {

    private final BlogpostService blogpostService;

    @Autowired
    public BlogpostController(BlogpostService blogpostService) {
        this.blogpostService = blogpostService;
    }

    @PostMapping
    public void createBlogpost(@Valid @NonNull @RequestBody Blogpost blogpost) {
        blogpostService.createBlogpost(blogpost);
    }

    @GetMapping
    public List<Blogpost> getAllBlogpost() {
        return blogpostService.getAllBlogpost();
    }

    @GetMapping(path = "{id}")
    public Blogpost getBlogpostById(@PathVariable("id") UUID id) {
        return blogpostService.getBlogpostById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public Boolean deleteBlogpostById(@PathVariable("id") UUID id) {
        return blogpostService.deleteBlogpostById(id);
    }

    @PutMapping(path = "{id}")
    public int updateBlogpostById(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Blogpost blogpost) {
        return blogpostService.updateBlogpostById(id, blogpost);
    }
}
