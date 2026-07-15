package org.bluebridge.server.session;

/**
 * 聊天组会话工厂
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
public abstract class GroupSessionFactory {

    private static GroupSession session = new GroupSessionMemoryImpl();

    public static GroupSession getGroupSession() {
        return session;
    }
}
