package com.practice.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //GET method 생성
@RequiredArgsConstructor // final 포함된 생성자 만듦, final 없는 필드는 생성자에 포함되지 않음

public class HelloResponseDto {
    private final String name;
    private final int amount;
}
