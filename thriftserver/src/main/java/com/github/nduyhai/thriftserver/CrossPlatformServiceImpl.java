package com.github.nduyhai.thriftserver;


import com.github.nduyhai.thriftservice.CrossPlatformException;
import com.github.nduyhai.thriftservice.CrossPlatformMessage;
import com.github.nduyhai.thriftservice.CrossPlatformService;

public class CrossPlatformServiceImpl implements CrossPlatformService.Iface {

    public void onReceive(CrossPlatformMessage message) throws CrossPlatformException, org.apache.thrift.TException {

    }

    public void send(CrossPlatformMessage message) throws CrossPlatformException, org.apache.thrift.TException {

    }

    public boolean ping() throws CrossPlatformException, org.apache.thrift.TException {
        return false;
    }
}
