package org.java.studentreceiptshbm.util.security.dao;

import org.java.studentreceiptshbm.util.security.admin.LoginRequest;
import org.java.studentreceiptshbm.util.security.admin.User;

public interface LoginDao {
  //This is login method.
  User getUserData(LoginRequest loginRequest);
}
