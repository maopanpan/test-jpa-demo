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

    public void sayHello(String msg) {
        System.out.println("test:".concat(msg));
    }

    public void sayHello111(String msg) {
        System.out.println("test111:".concat(msg));
    }
}
