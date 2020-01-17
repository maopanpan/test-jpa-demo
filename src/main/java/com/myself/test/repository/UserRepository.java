package com.myself.test.repository;

import com.myself.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 类名称：UserRepository<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
