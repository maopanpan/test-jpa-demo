package com.myself.test.service;

import com.myself.test.BaseTestCase;
import com.myself.test.entity.SysOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 类名称：OrderServiceTest<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class OrderServiceTest extends BaseTestCase {

    @Autowired
    private OrderService orderService;


    @Test
    public void save(){
        SysOrder o = new SysOrder();
        o.setProductId(1L);
        o.setProductPrice(new BigDecimal(1.1));
        o.setCreateTime(new Timestamp(System.currentTimeMillis()));
        o.setCreateBy(1L);
        //SysOrder order = orderService.save(o);
        //SysOrder order = orderService.testTrans(o);
        try {
            orderService.methodA(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
