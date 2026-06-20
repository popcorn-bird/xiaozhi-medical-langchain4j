package com.xiaozhi;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XiaozhiAppTests {

    // 测试一：直接构建模型对象，使用官方免费 demo 接口
    @Test
    void testDP() {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        String answer = model.chat("你好呀，你能提供什么信息给我？");
        System.out.println(answer);
    }

    // 测试二：通过 Spring 注入使用
    @Autowired
    private OpenAiChatModel openAiChatModel;

    @Test
    void test2() {
        String answer = openAiChatModel.chat("我是谁？");
        System.out.println(answer);
    }

    // 测试四：阿里百炼 Qwen 模型
    @Autowired
    private dev.langchain4j.community.model.dashscope.QwenChatModel qwenChatModel;

    @Test
    void testQwen() {
        System.out.println("====== 阿里百炼 Qwen 测试 ======");
        String answer = qwenChatModel.chat("你好，用一句话介绍你自己。");
        System.out.println("Qwen 回答：" + answer);
    }
}