package org.bluebridge.server.session;

/**
 * 会话工厂
 *
 * @author lingwh
 * @date 2025/10/16 16:25
 */
public abstract class SessionFactory {

    private static Session session = new SessionMemoryImpl();

    public static Session getSession() {
        return session;
    }
}
