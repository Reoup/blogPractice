package com.example.blog.controller;

import com.example.blog.dto.CategoryBoardDTO;
import com.example.blog.service.CategoryBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins="*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class CategoryBoardController {

    @Autowired
    private CategoryBoardService categoryBoardService;

    @GetMapping("/category/{category}")
    public List<CategoryBoardDTO> categoryBoardList(@PathVariable String category) {
        System.out.println(categoryBoardService.categoryBoardList(category));
        return categoryBoardService.categoryBoardList(category);
    }


}
