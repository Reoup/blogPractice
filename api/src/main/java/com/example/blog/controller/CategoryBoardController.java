package com.example.blog.controller;

import com.example.blog.dto.CategoryBoardDTO;
import com.example.blog.service.CategoryBoardService;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<CategoryBoardDTO> categoryBoardList(@RequestParam (value = "p_num", required = false) int page,
                                                        @PathVariable String category) {
        List<CategoryBoardDTO> result = categoryBoardService.categoryBoardList(category, page, 5);
        PageInfo<CategoryBoardDTO> pi = new PageInfo<CategoryBoardDTO>(result);
        return pi;
    }


}
