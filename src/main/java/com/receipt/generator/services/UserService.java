package com.receipt.generator.services;

import com.receipt.generator.dao.UserDAO;
import com.receipt.generator.dto.UserRequest;
import com.receipt.generator.entities.User;
import com.receipt.generator.utilities.JwtUtility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    @Autowired
    JwtUtility jwtUtility;

    public ResponseEntity<?> saveUser(User user){
        String msg = userDAO.saveUser(user);
        return ResponseEntity.ok(msg);
    }

    public ResponseEntity<?> login(UserRequest userRequest) {
        Boolean success = userDAO.login(userRequest);
        if(success) {
            String authToken = jwtUtility.generateToken(userRequest.getEmail());
           return  ResponseEntity.ok(new LoginResponse(HttpStatus.ACCEPTED.value(), "Login successful",authToken));
        } else {
            return ResponseEntity.badRequest().body(new LoginResponse(HttpStatus.FAILED_DEPENDENCY.value(), "Failed to login!", ""));
        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class LoginResponse {
    private int status;
    private String msg;
    private String authToken;
}

