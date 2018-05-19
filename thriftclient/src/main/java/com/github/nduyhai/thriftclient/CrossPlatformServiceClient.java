package com.github.nduyhai.thriftclient;

import com.github.nduyhai.thriftservice.CrossPlatformService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class CrossPlatformServiceClient {

    public boolean ping() {
        try {
            final TTransport transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            CrossPlatformService.Client client = new CrossPlatformService.Client(protocol);

            System.out.println("Calling remote method...");

            boolean result = client.ping();

            System.out.println("done.");

            transport.close();

            return result;
        } catch (TException e) {
            System.err.println(e);
        }

        return false;
    }
}
