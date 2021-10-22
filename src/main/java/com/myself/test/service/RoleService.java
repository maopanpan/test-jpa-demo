package com.myself.test.service;

import org.springframework.stereotype.Service;

/**
 * 类名称：RoleService<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Service
public class RoleService {

    public void sayHello2(String msg) {
        System.out.println("test2:".concat(msg));
    }

    public void sayHello222(String msg) {
        System.out.println("test222:".concat(msg));
    }

    public void helloInfo(String msg) {
        System.out.println("helloInfo:".concat(msg));
    }
}
