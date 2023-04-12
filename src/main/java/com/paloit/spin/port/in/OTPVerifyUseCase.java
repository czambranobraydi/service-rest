package com.paloit.spin.port.in;

import com.paloit.spin.domain.OTPVerifyRequest;

public interface OTPVerifyUseCase {

  String verifyOTP(OTPVerifyRequest otpVerifyRequest);

}
