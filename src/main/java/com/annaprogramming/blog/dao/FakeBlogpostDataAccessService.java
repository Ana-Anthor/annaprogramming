package src.main.java.com.annaprogramming.blog.dao;

import com.annaprogramming.blog.model.Blogpost;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao") //or @Component
@Slf4j
public class FakeBlogpostDataAccessService implements BlogpostDao {

    private static List<Blogpost> DB = new ArrayList<>();
    @Override
    public Blogpost insertBlogpost(UUID id, Blogpost blogpost) {
        DB.add(new Blogpost(id, blogpost.getTitle(), blogpost.getAuthor()));
        return blogpost;
    }

    @Override
    public Optional<Blogpost> selectBlogpostById(UUID id) {
        return DB.stream()
                .filter(blogpost -> blogpost.getId().equals(id))
                .findFirst();
    }

    @Override
    public Boolean deleteBlogpostById(UUID id) {
        Optional<Blogpost> blogpost = selectBlogpostById(id);
        if(blogpost.isEmpty()){
            return false;
        }
        DB.remove(blogpost.get());
        return true;
    }

    @Override
    public int updateBlogpostById(UUID id, Blogpost updatedBlogpost) {
        return selectBlogpostById(id)
                .map(blogpost -> {
                    int indexOfBlogpostToUpdate = DB.indexOf(blogpost);
                    if (indexOfBlogpostToUpdate >= 0 ) {
                        DB.set(indexOfBlogpostToUpdate, new Blogpost(id, updatedBlogpost.getTitle(), updatedBlogpost.getAuthor()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    @Override
    public List<Blogpost> selectAllBlogposts() {
        return DB;
    }
}
