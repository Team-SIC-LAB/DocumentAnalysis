package com.lab.document_analysis.Originaltext;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OriginaltextRepositoryTest {

    @Autowired
    OriginaltextRepository originaltextRepository;

    @After
    public void cleanup() {
        originaltextRepository.deleteAll();
    }

    @Test
    public void 원본텍스트저장_불러오기() {
        //given
        String text = "테스트텍스트";

        originaltextRepository.save(Originaltext.builder()
                .text(text)
                .build());
        //when
        List<Originaltext> originaltextList = originaltextRepository.findAll();
        //then
        Originaltext originaltext = originaltextList.get(0);
        assertThat(originaltext.getText()).isEqualTo(text);
    }


}