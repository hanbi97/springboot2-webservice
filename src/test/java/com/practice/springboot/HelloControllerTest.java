package com.practice.springboot;

import com.practice.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class) //Spring boot test와 JUnit 사이 연결자 역할
@WebMvcTest(controllers = HelloController.class) //web에 집중하게 해줌
public class HelloControllerTest {

    @Autowired //spring이 관리하는 bean 주입
    private MockMvc mvc; //web API 테스트 시 사용,  MVC 테스트 시작점, get&post API 테스트

    @Test
    public void hello_return() throws Exception{
        String hello ="hello";

        mvc.perform(get("/hello")) // MockMvc로 /hello로 GET 요청
                .andExpect(status().isOk()) // http header status 체크(200인지)
                .andExpect(content().string(hello)); // return 된 내용이 맞는지 검증
    }

    @Test
    public void helloDto_return() throws Exception{
        String name ="hello";
        int amount = 1000;

        mvc.perform(get("/hello/dto").param("name",name).param("amount",String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name",is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));
    }
}
