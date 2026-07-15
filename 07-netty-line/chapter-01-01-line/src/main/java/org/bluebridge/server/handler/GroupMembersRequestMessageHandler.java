package org.bluebridge.server.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.bluebridge.message.GroupMembersRequestMessage;
import org.bluebridge.message.GroupMembersResponseMessage;
import org.bluebridge.server.session.GroupSessionFactory;

import java.util.Set;

/**
 * 查看群成员请求消息处理器
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
@ChannelHandler.Sharable
public class GroupMembersRequestMessageHandler extends SimpleChannelInboundHandler<GroupMembersRequestMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupMembersRequestMessage msg) throws Exception {
        Set<String> members = GroupSessionFactory.getGroupSession()
                .getMembers(msg.getGroupName());
        ctx.writeAndFlush(new GroupMembersResponseMessage(members));
    }
}
