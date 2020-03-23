package com.learn.rcp.server;

import java.io.IOException;

/**
 * @program: java
 * @description:
 * @author: clark
 * @create: 2020-03-20 10:31
 */
public interface Server {
    void stop();

    void start() throws IOException;

    void register(Class serviceInterface, Class impl);

    boolean isRunning();

    int getPort();
}
