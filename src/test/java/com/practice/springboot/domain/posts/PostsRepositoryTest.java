package com.practice.springboot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

//save, findAll test
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After //Junit에서 단위 테스트 끝날때마다 수행되는 메소드 지정(테스트간 데이터 침범 막으려고
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void getSave(){
        String title = " 테스트 게시글";
        String content = "본문";

        postsRepository.save(Posts.builder() //posts에 insert,update 쿼리를 실행
                .title(title)
                .content(content)
                .author("hb@nn.com")
                .build());

        List<Posts> postsList = postsRepository.findAll();

        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
