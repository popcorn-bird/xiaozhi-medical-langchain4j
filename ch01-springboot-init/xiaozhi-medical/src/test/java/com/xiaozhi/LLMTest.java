package com.xiaozhi;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LLMTest {

    // 测试一：直接构建模型对象，使用官方免费 demo 接口
    @Test
    public void testDP() {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        String answer = model.chat("你好呀，你能提供什么信息给我？");
        System.out.println(answer);
    }

    // 测试二：通过 Spring 注入使用（需要 application.yml 配置）
    @Autowired
    private OpenAiChatModel openAiChatModel;

    @Test
    public void test2() {
        String answer = openAiChatModel.chat("我是谁？");
        System.out.println(answer);
    }
}