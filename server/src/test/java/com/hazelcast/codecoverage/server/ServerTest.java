package com.hazelcast.codecoverage.server;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServerTest {

    @Test
    public void test() {
        Server server = new Server(5);
        assertEquals(5, server.getCounter());
    }
}
