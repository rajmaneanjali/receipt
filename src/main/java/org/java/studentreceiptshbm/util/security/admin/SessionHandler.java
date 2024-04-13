package org.java.studentreceiptshbm.util.security.admin;

public interface SessionHandler {

    String createSession(User user);

    User validateToken(String token);
}
