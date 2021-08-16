package com.example.blog.service;

import com.example.blog.dto.CategoryBoardDTO;

import java.util.List;

public interface CategoryBoardService {
    List<CategoryBoardDTO> categoryBoardList(String category, int page, int pageSize);
}
