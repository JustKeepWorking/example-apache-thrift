package com.github.nduyhai.thriftclient;

public class ThriftClientApplication {
    public static void main(String[] args) {
        final CrossPlatformServiceClient crossPlatformServiceClient = new CrossPlatformServiceClient();
        crossPlatformServiceClient.ping();
    }
}
