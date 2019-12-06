/**
 * @(#)EchoService.java, 2019/12/05. 17:11
 * @Author: L.Wen
 * <p/>
 */
package com.funtl.apache.dubbo.provider.api;

/**
 * 服务提供方接口
 *
 * @Author: L.Wen
 * @created_at: 2019/12/05 17:11
 */
public interface EchoService {

    String echo(String string);

}
