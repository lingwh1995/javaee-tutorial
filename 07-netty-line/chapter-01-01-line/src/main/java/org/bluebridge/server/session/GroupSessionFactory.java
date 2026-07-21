package org.bluebridge.server.session;

/**
 * 聊天组会话工厂
 *
 * @author lingwh
 * @date 2025/10/16 16:30
 */
public abstract class GroupSessionFactory {

    private static GroupSession session = new GroupSessionMemoryImpl();

    public static GroupSession getGroupSession() {
        return session;
    }
}
