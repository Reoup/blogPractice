package com.example.blog.mapper;

import com.example.blog.dto.CategoryBoardDTO;
import com.example.blog.dto.PersonBlogCategoryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryBoardMapper {
    List<CategoryBoardDTO> categoryBoardList(String category);
    CategoryBoardDTO getPersonBlogBoard(int idx);
    List<PersonBlogCategoryDTO> getPersonBlogCategory(String name);

    void updateHitCnt(int idx);

}
