package com.cblue.springboot.demo11;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMail {


    @Resource
    private JavaMailSender javaMailSender ;
    @Test
    public void testSendMail() {
        SimpleMailMessage message = new SimpleMailMessage() ;    // 要发送的消息内容
        message.setFrom("2715310362@qq.com");
        message.setTo("pavel686@163.com");
        message.setSubject("测试邮件）");
        message.setText("好好学习，天天向上");
        this.javaMailSender.send(message);
    }
}
