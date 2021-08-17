package com.example.blog.mapper;

import com.example.blog.dto.CategoryBoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryBoardMapper {
    List<CategoryBoardDTO> categoryBoardList(String category);
    CategoryBoardDTO getPersonBlogBoard(String name, int idx);
    void updateHitCnt(int idx);

}
