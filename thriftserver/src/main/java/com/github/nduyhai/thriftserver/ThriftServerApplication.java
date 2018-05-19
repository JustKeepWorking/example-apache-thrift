package com.github.nduyhai.thriftserver;

import org.apache.thrift.transport.TTransportException;

public class ThriftServerApplication {
    public static void main(String[] args) throws TTransportException {
        final CrossPlatformServiceServer server = new CrossPlatformServiceServer();
        server.start();
    }
}
