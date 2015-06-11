package com.hazelcast.codecoverage.server;

public class Server {

    private volatile int counter;

    public Server(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }
}
