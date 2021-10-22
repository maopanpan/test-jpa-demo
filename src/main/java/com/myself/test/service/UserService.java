package com.myself.test.service;

import com.myself.test.entity.User;
import com.myself.test.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * 类名称：UserService<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        return new User();
    }

    public User save(User user) {
        return userRepository.saveAndFlush(user);
    }


    @Transactional(propagation = Propagation.NESTED)
    public void methodD() {
        User user = new User();
        user.setUserName("wa111111");
        user.setPass("123456");
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user.setCreateBy(1);
        userRepository.save(user);
        throw new RuntimeException("Test Propagation.NESTED");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void methodB() {
        User user = new User();
        user.setUserName("wa111111");
        user.setPass("123456");
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user.setCreateBy(1);
        userRepository.save(user);
    }

    public void sayHello() {
        System.out.println("测试点二");
    }

    public void sayHello1() {
        System.out.println("测试点二");
    }

    public void sayHello2() {
        System.out.println("测试点二");
    }
}
