namespace java com.github.nduyhai.thriftservice

exception CrossPlatformException {
    1: i32 code,
    2: string description
}

struct CrossPlatformMessage {
    1: i32 id,
    2: string name,
    3: optional string salutation
}

service CrossPlatformService {

    void onReceive(1:CrossPlatformMessage message) throws (1:CrossPlatformException e),

    void send(1:CrossPlatformMessage message) throws (1:CrossPlatformException e),

    bool ping() throws (1:CrossPlatformException e)
}