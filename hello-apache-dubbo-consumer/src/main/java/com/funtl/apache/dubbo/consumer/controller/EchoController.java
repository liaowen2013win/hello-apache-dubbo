/**
 * @(#)EchoController.java, 2019/12/06. 17:37
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.apache.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.funtl.apache.dubbo.provider.api.EchoService;

/**
 * @Author: L.Wen
 * @created_at: 2019/12/06 17:37
 */
//配置动态刷新
@RefreshScope
@RestController
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @Value("${user.name}")
    private String username;


    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string) + ", " + username;
    }
}
