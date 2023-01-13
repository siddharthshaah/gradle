package com.bj.bean;

import java.security.SecureRandom;

public class AccountService {
	public double getBalance(String accountNo) {
		return new SecureRandom().nextDouble() * 1000;
	}
}
