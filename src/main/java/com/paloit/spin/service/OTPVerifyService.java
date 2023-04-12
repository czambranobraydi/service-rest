package com.paloit.spin.service;

import com.paloit.spin.domain.OTPVerifyRequest;
import com.paloit.spin.port.in.OTPVerifyUseCase;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OTPVerifyService implements OTPVerifyUseCase {

  @Override
  public String verifyOTP(OTPVerifyRequest otpVerifyRequest) {
    return UUID.randomUUID().toString();
  }
}
