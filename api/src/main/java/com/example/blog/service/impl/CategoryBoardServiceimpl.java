package com.example.blog.service.impl;

import com.example.blog.dto.CategoryBoardDTO;
import com.example.blog.mapper.CategoryBoardMapper;
import com.example.blog.service.CategoryBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryBoardService")
public class CategoryBoardServiceimpl implements CategoryBoardService {
    @Autowired
    CategoryBoardMapper categoryBoardMapper;

    @Override
    public List<CategoryBoardDTO> categoryBoardList(String category) {
        List<CategoryBoardDTO> result = null;
        try{
            result = categoryBoardMapper.categoryBoardList(category);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
