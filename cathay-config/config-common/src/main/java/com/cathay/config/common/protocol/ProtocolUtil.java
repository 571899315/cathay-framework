package com.cathay.config.common.protocol;

import com.google.protobuf.InvalidProtocolBufferException;


public class ProtocolUtil {


    /**
     * 编码
     *
     * @param protocol
     * @return
     */
    public static byte[] encode(RequestProto.ReqProtocol protocol) {
        return protocol.toByteArray();
    }

    /**
     * 解码
     *
     * @param bytes
     * @return
     * @throws InvalidProtocolBufferException
     */
    public static RequestProto.ReqProtocol decode(byte[] bytes) throws InvalidProtocolBufferException {
        return RequestProto.ReqProtocol.parseFrom(bytes);
    }
}
