package com.myself.test.repository;

import com.myself.test.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 类名称：RoleRepository<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
