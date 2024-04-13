/**
 * *********************************************
 * Date         Name                         
 * *********************************************
 * 11-Dec-2019   Sachin Patil aka JavaPatil  
 */

package org.java.studentreceiptshbm.util.security.admin.impl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.java.studentreceiptshbm.util.security.admin.LoginRequest;
import org.java.studentreceiptshbm.util.security.admin.LoginResponse;
import org.java.studentreceiptshbm.util.security.admin.LoginService;
import org.java.studentreceiptshbm.util.security.admin.SessionHandler;
import org.java.studentreceiptshbm.util.security.admin.SignupRequest;
import org.java.studentreceiptshbm.util.security.admin.User;
import org.java.studentreceiptshbm.util.security.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {
	
    private final Log logger= LogFactory.getLog(this.getClass());
	//@Autowired
    private LoginDao loginDao;

    @Autowired
    private SessionHandler sessionHandler;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void signup(SignupRequest signupRequest) {
   //     HospitalDatabaseManager hospitalDatabaseManager = new HospitalDatabaseManagerImpl();
   //    signupRequest.setPassword(bCryptPasswordEncoder.encode(signupRequest.getPassword()));
   //    hospitalDatabaseManager.signup(signupRequest);
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
//       LoginDatabaseManager loginDatabaseManager = new LoginJDBCDatabaseManager();
//        User user = loginDatabaseManager.login(loginRequest.getUserName());
//
//       User user=new User();       
//       user.setUserName("Sachin");
//        user.setOrganizationId(1);
//        user.setOrganizationName("Org1");
//        user.setPass(bCryptPasswordEncoder.encode("MyPass"));
//        user.setStatus("Active");
//        user.setEmailId("sachinpatilcpc@gmail.com");
//        user.setMobileNo("9921558775");
//       user.setRoleName("Admin");
//        
//        if (bCryptPasswordEncoder.matches(loginRequest.getPassword(), user.getPass())) {
//       	
//           if (user.getStatus().equals("Active")) {
//                String sessionToken = sessionHandler.createSession(user);        
//               LoginResponse loginResponse = new LoginResponse(sessionToken,user.getRoleName(),user.getOrganizationName(),user.getUserName());
//              return loginResponse;
//            }
//            else {
//                throw new BadValueException("user_name", user.getStatus());
//           }
//
//        }
//        else {
//            throw new BadValueException("password", "INVALID");
//        }
//    	
    	
        User user=loginDao.getUserData(loginRequest);
    	
        String sessionToken = sessionHandler.createSession(user);        
        LoginResponse loginResponse = new LoginResponse(sessionToken,user.getRoleName(),user.getOrganizationName(),user.getUserName());
        return loginResponse;

    	
    }

    @Override
    public void validateOTP(String otp, String mobileNo) {
//        OTPDatabaseManager otpDatabaseManager = new OTPDatabaseJdbcManager();
//       otpDatabaseManager.validateOTP(otp, mobileNo);
    }

}
