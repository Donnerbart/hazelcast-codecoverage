package com.hazelcast.codecoverage.client;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void testClient() {
        Client client = new Client();
        assertEquals(0, client.getCounter());

        client.increment();
        assertEquals(1, client.getCounter());
    }
}
