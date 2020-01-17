package com.myself.test.repository;

import com.myself.test.entity.SysOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 类名称：OrderRepository<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public interface OrderRepository extends JpaRepository<SysOrder, Integer> {
}
