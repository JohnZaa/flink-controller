package org.apache.flink;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类名：${NAME}.
 * 描述：TODO 描述类的作用
 *
 * <p>详细说明（可选）：可以补充更多信息。</p>
 * <p>
 * 示例：
 * <pre>{@code
 * ${NAME} instance = new ${NAME}();
 * instance.doSomething();
 * }</pre>
 *
 * @author zhangjh
 * @version 1.0
 * @date 2025/5/26
 * @since 2025/5/26
 */

@SpringBootApplication
@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("-------------");
        log.info("-------------");
        log.debug("-------------");
        log.info("-------------");
        log.info("------Hello-------");
        SpringApplication.run(Main.class, args);
    }}
