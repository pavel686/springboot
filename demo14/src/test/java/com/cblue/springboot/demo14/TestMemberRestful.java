package com.cblue.springboot.demo14;


import com.cblue.springboot.demo12.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberRestful {

    @Resource
    private RestTemplate restTemplate;
    @Test
    public void testAdd() {
        Boolean flag = this.restTemplate.getForObject(
                "http://localhost:8080/member/add?mid=110&name=SMITH&age=10",
                Boolean.class);
        System.out.println("【ConsumerTest.add()】" + flag);
    }
    @Test
    public void testGet() {
        // 通过远程的Rest服务中的信息将其自动转换为Member对象实例
        Member member = this.restTemplate.getForObject(
                "http://localhost:8080/member/get?mid=110", Member.class);
        System.out.println("【ConsumerTest.get()】" + member);
    }



}
