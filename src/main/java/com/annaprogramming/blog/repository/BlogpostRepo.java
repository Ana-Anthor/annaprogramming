//package com.annaprogramming.blog.repository;
//
//import com.annaprogramming.blog.model.Blogpost;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//public interface BlogpostRepo extends JpaRepository<Blogpost, UUID>
//{
//    Blogpost insertBlogpost(UUID id, Blogpost blogpost);
//
//    default Blogpost insertBlogpost(Blogpost blogpost){
//        UUID id = UUID.randomUUID();
//        return insertBlogpost(id, blogpost);
//    }
//
//    List<Blogpost> selectAllBlogpost();
//
//    Optional<Blogpost> findBlogpostById(UUID id);
//
//    int deleteBlogpostById(UUID id);
//
//    int updateBlogpost(UUID id, Blogpost newBlogpost);
//}
