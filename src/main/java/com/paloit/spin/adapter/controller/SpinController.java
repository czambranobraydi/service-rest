package com.paloit.spin.adapter.controller;

import com.paloit.spin.domain.OTPVerifyRequest;
import com.paloit.spin.port.in.OTPVerifyUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/spin/otp")
@RequiredArgsConstructor
public class SpinController {

  private final OTPVerifyUseCase otpVerifyUseCase;

  @PostMapping("/verify")
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public String verifyOTP( @RequestBody OTPVerifyRequest otpVerifyRequest ) {
    return otpVerifyUseCase.verifyOTP(otpVerifyRequest);
  }

}
