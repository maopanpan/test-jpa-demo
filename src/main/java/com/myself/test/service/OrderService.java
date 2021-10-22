package com.myself.test.service;

import com.myself.test.entity.SysOrder;
import com.myself.test.entity.User;
import com.myself.test.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

/**
 * 类名称：OrderService<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserService userService;

    public OrderService(OrderRepository orderRepository, UserService userService) {
        this.orderRepository = orderRepository;
        this.userService = userService;
    }

    public SysOrder testTrans(SysOrder sysOrder) {
        return save(sysOrder);
    }

    /**
     * PROPAGATION_MANDATORY
     * 如果已经存在一个事务，支持当前事务。如果没有一个活动的事务，则抛出异常。
     *
     * @param order
     * @return
     */
    @Transactional(propagation = Propagation.MANDATORY)
    public SysOrder save(SysOrder order) {
        return orderRepository.save(order);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void methodA(SysOrder order) {
        methodB();
        orderRepository.save(order);
        throw new RuntimeException("Test Propagation.REQUIRES_NEW");
    }

    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    public void methodB() {
        userService.methodB();
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void methodC(SysOrder order) {
        orderRepository.save(order);
        userService.methodD();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void methodC1(SysOrder order) {
        orderRepository.save(order);
        userService.methodD();
    }

}
