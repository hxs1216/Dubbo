package com.biyao.service;
import com.biyao.bean.UserAddress;
import java.util.List;

/**
 * @Author:hxs
 * @Description:订单服务
 */
public interface OrderService {
	
	//初始化订单
	List<UserAddress> initOrder(String userId);

}
