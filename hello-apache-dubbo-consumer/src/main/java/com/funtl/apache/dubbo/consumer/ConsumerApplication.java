/**
 * @(#)ConsumerApplication.java, 2019/12/06. 17:35
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.apache.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务消费方
 *
 * @Author: L.Wen
 * @created_at: 2019/12/06 17:35
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
