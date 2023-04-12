package com.paloit.spin.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OTPVerifyRequest {
  String phone;
  String otpCode;
  String deviceId;
  String deliveryTarget;
}
