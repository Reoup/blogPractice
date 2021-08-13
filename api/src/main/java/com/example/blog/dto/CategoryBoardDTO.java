package com.example.blog.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryBoardDTO {
    int idx;
    String category;
    String name;
    String title;
    String content;
    LocalDateTime reg_dt;
    String img_url;
    int hit;
}
