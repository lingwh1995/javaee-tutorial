package org.bluebridge.server.session;

/**
 * 会话工厂
 *
 * @author lingwh
 * @date 2026/7/10 10:58
 */
public abstract class SessionFactory {

    private static Session session = new SessionMemoryImpl();

    public static Session getSession() {
        return session;
    }
}
