package com.cathay.config.server.netty;

import com.cathay.config.common.protocol.RequestProto;
import io.netty.channel.SimpleChannelInboundHandler;

import io.netty.channel.ChannelHandlerContext;


public class ServerHandle extends SimpleChannelInboundHandler<RequestProto.ReqProtocol> {



    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {

    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {

    }


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RequestProto.ReqProtocol msg) throws Exception {


    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {


    }


}
