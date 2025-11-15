package com.sahinsiraj.ecom.service;

import com.sahinsiraj.ecom.apiResponses.AuthenticationResult;
import com.sahinsiraj.ecom.apiResponses.UserResponse;
import com.sahinsiraj.ecom.security.request.LoginRequest;
import com.sahinsiraj.ecom.security.request.SignupRequest;
import com.sahinsiraj.ecom.security.response.MessageResponse;
import com.sahinsiraj.ecom.security.response.UserInfoResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface AuthService {

    AuthenticationResult login(LoginRequest loginRequest);

    ResponseEntity<MessageResponse> register(SignupRequest signUpRequest);

    UserInfoResponse getCurrentUserDetails(Authentication authentication);

    ResponseCookie logoutUser();

    UserResponse getAllSellers(Pageable pageable);
}
