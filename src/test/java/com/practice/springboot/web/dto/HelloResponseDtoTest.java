package com.practice.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lonbok_test(){
        String name ="test";
        int amount =1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name); // assertj라는 테스트 검증 라이브러리의 검증 메소드, 검증하고 싶은 대상을 인자로 받음
        assertThat(dto.getAmount()).isEqualTo(amount); // 값 비교해서 서로 같으면 성공 출력
    }
}
