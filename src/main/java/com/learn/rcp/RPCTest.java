package com.learn.rcp;

import com.learn.rcp.client.RPCClient;
import com.learn.rcp.provider.HelloService;
import com.learn.rcp.provider.HelloServiceImpl;
import com.learn.rcp.server.Server;
import com.learn.rcp.server.ServiceCenter;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @program: java:RPCTest
 * @description:
 * @author: clark
 * @create: 2020-03-20 11:14
 **/
public class RPCTest {
    public static void main(String[] args) {
        new Thread(
                () -> {
                    try {
                        Server serviceServer = new ServiceCenter(8088);
                        serviceServer.register(HelloService.class, HelloServiceImpl.class);
                        serviceServer.start();
                    } catch (IOException e) {

                        e.printStackTrace();

                    }

                }
        ).start();

        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test"));
    }
}
