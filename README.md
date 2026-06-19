# 小智医疗 · LangChain4J 大模型应用实战

> 参考博客：https://www.cnblogs.com/yuyuyu313/p/19911626
> 基于 LangChain4J + Spring Boot 3 实现医疗智能客服系统

## 技术栈

- Java 21 + Spring Boot 3.2.6
- LangChain4J 1.0.0-beta3
- Ollama + DeepSeek-R1:1.5b（本地大模型）
- 阿里云百炼平台（Qwen / 通义万相）
- MongoDB（聊天记忆持久化）
- MySQL + MyBatis-Plus（预约业务）
- Pinecone（云端向量数据库）
- Knife4j（接口文档）

## 项目结构

| 目录 | 章节 | 内容 | 负责人 |
|---|---|---|---|
| `ch01-springboot-init/` | 章节一 | 创建 Spring Boot 项目 | 成员1 |
| `ch02-llm-integration/` | 章节二 | 接入大模型（OpenAI标准接口） | 成员1 |
| `ch03-ollama-deepseek/` | 章节三 | 接入 Ollama + DeepSeek 本地模型 | 成员1 |
| `ch04-aliyun-bailian/` | 章节四 | 接入阿里百炼平台（Qwen/通义万相） | 成员1 |
| `ch05-ch08-ai-service/` | 章节五～八 | AIService / 聊天记忆 / 持久化 / 提示词 | 成员2 |
| `ch09-ch11-xiaozhi/` | 章节九～十一 | 硅谷小智实战 / Function Calling / MySQL预约 | 成员3 |
| `ch12-ch13-rag/` | 章节十二～十三 | RAG 检索增强生成 / 本地RAG整合 | 成员2 |
| `ch14-ch15-vector/` | 章节十四～十五 | 向量模型 / Pinecone 云端向量库 | 成员3 |
| `ch16-ch17-stream/` | 章节十六～十七 | 流式输出 / 前端工程 | 成员2 |
| `final-project/` | 最终整合 | 小智医疗完整项目 | 全员 |
| `docs/` | - | 报告文档 | 成员1 |

## 快速开始

### 环境要求

- JDK 21+
- Maven 3.8+
- Ollama（章节三需要）
- MongoDB（章节七需要）
- MySQL 8.0+（章节十一需要）

### 克隆项目

```bash
git clone git@github.com:popcorn-bird/xiaozhi-medical-langchain4j.git
cd xiaozhi-medical-langchain4j
```

### 环境变量配置

```bash
# 阿里云百炼平台 API Key（章节四开始需要）
export DASH_SCOPE_API_KEY=your_api_key_here
```

### Ollama 本地部署（章节三）

```bash
# 安装 Ollama 后执行
ollama run deepseek-r1:1.5b
```

## 分支规范

- `main`：稳定版本
- `feature/成员名-章节描述`：个人开发分支

```bash
git checkout -b feature/ethan-ch01
git push origin feature/ethan-ch01
```

## 成员分工

| 成员 | 负责章节 | 说明 |
|---|---|---|
| 成员1 | 章节一～四 + 报告撰写 | 项目基础搭建、多模型接入 |
| 成员2 | 章节五～八、十二～十三、十六～十七 | AIService、记忆、RAG、流式输出 |
| 成员3 | 章节九～十一、十四～十五 | 小智实战、Function Calling、向量库 |
