package src.main.java.com.annaprogramming.blog.service.implementation;

import src.main.java.com.annaprogramming.blog.dao.BlogpostDao;
import com.annaprogramming.blog.model.Blogpost;
import com.annaprogramming.blog.service.BlogpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service //or @component
public class BlogpostServiceImpl implements BlogpostService {

    private final BlogpostDao blogpostDao;
    @Autowired
    //public BlogpostServiceImpl(@Qualifier("fakeDao") BlogpostDao blogpostDao) {
    public BlogpostServiceImpl(@Qualifier("postgres") BlogpostDao blogpostDao) {
        this.blogpostDao = blogpostDao;
    }

    @Override
    public Blogpost createBlogpost(Blogpost blogpost) {

        return blogpostDao.insertBlogpost(blogpost);
    }

    @Override
    public List<Blogpost> getAllBlogpost() {
        return blogpostDao.selectAllBlogposts();
    }

    @Override
    public Optional<Blogpost> getBlogpostById(UUID id) {
        return blogpostDao.selectBlogpostById(id);
    }

    @Override
    public Boolean deleteBlogpostById(UUID id) {
        return blogpostDao.deleteBlogpostById(id);
    }

    @Override
    public int updateBlogpostById(UUID id, Blogpost blogpost) {
        return blogpostDao.updateBlogpostById(id, blogpost);
    }
}
