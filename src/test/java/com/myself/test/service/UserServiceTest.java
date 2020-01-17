package com.myself.test.service;

import com.myself.test.BaseTestCase;
import com.myself.test.entity.Department;
import com.myself.test.entity.IdInfo;
import com.myself.test.entity.Role;
import com.myself.test.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * 类名称：UserServiceTest<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class UserServiceTest extends BaseTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void findById() {
        User user = userService.findById(1);
        IdInfo idInfo = user.getIdInfo();
        Set<Role> roles = user.getRoles();
        Department department = user.getDepartment();
        System.out.println(department.getDeptName());
        assert user != null;
    }

    @Test
    public void save() {
        User user = new User();
        user.setUserName("wangli");
        user.setPass("123456");
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user.setCreateBy(1);

        Role role = new Role();
        role.setRoleCode("test");
        role.setRoleCode("测试");
        role.setCreateTime(new Timestamp(System.currentTimeMillis()));
        role.setCreateBy(1);

        Set<Role> roles = new HashSet<>();
        roles.add(role);

//        user.setRoles(roles);

        User newUser = userService.save(user);
        assert newUser != null;
    }
}
