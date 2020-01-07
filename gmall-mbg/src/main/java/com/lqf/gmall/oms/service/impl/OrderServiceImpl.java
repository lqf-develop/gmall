package com.lqf.gmall.oms.service.impl;

import com.lqf.gmall.oms.entity.Order;
import com.lqf.gmall.oms.mapper.OrderMapper;
import com.lqf.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lqf
 * @since 2019-12-29
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
