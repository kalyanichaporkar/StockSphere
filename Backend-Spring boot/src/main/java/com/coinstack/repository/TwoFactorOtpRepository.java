package com.coinstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coinstack.model.TwoFactorOTP;

public interface TwoFactorOtpRepository extends JpaRepository<TwoFactorOTP, String> {

	TwoFactorOTP findByUserId(Long userId);
}
