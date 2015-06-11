package com.hazelcast.codecoverage.client;

import com.hazelcast.codecoverage.server.Server;

public class Client {

    private final Server server = new Server(0);

    public Client() {
    }

    public int getCounter() {
        return server.getCounter();
    }

    public void increment() {
        server.increment();
    }
}
