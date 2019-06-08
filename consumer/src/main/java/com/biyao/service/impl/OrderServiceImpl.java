package com.biyao.service.impl;

import com.biyao.bean.UserAddress;
import com.biyao.service.OrderService;
import com.biyao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private UserService userService;
	public List<UserAddress> initOrder(String userId) {

		System.out.println("用户id："+userId);

		//1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}
}
