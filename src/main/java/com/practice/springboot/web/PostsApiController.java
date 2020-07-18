package com.practice.springboot.web;

import com.practice.springboot.service.posts.PostsService;
import com.practice.springboot.web.dto.PostsResponseDto;
import com.practice.springboot.web.dto.PostsSaveRequestDto;
import com.practice.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts") //save
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}") //update
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id,requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")  //search
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}