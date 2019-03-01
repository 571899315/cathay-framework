package com.cathay.config.common.protocol;

import com.google.protobuf.InvalidProtocolBufferException;


public class ProtocolUtil {


    /**
     * 编码
     *
     * @param protocol
     * @return
     */
    public static byte[] encode(RequestProto.CIMReqProtocol protocol) {
        return protocol.toByteArray();
    }

    /**
     * 解码
     *
     * @param bytes
     * @return
     * @throws InvalidProtocolBufferException
     */
    public static RequestProto.CIMReqProtocol decode(byte[] bytes) throws InvalidProtocolBufferException {
        return RequestProto.CIMReqProtocol.parseFrom(bytes);
    }
}
