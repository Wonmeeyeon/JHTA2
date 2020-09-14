package kr.co.jhta.dao;

import java.util.List;

import kr.co.jhta.vo.Blog;

public interface BlogDao {
	
	
	Blog getBlogByNo(int blogNo);
	
    List<Blog> getBlogs();
    
    List<Blog> getBlogsByWriter(String writer);
    
    void insertBlog(Blog blog);
    
    void deleteBlogsByWriter(String writer);
    
    void updateBlog(Blog blog);
    
    void deleteBlogsByNo(int blogNo);

}
