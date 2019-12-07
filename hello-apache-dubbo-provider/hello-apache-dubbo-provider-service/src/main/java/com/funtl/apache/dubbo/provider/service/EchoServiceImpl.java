/**
 * @(#)EchoServiceImpl.java, 2019/12/05. 17:17
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.apache.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.funtl.apache.dubbo.provider.api.EchoService;

/**
 * 服务提供方接口实现
 *
 * @Author: L.Wen
 * @created_at: 2019/12/05 17:17
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echo(String string) {
        return "Echo Hello Dubbo " + string + ", i am from port: " + port;
    }
}