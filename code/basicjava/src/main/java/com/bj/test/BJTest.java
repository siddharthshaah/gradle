package com.bj.test;

import com.bj.bean.AccountService;

public class BJTest {
	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		double balance = accountService.getBalance("a93");
		System.out.println("balance: " + balance);
	}
}
