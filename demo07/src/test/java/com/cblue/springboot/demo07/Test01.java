package com.cblue.springboot.demo07;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Test01 {

   /* private  final Logger logger  = LoggerFactory.getLogger(Test01.class);
    @Test
    public void test01() throws Exception {
        logger.debug("debug...");
        logger.info("info....");
        logger.error("error....");
    }*/

    @Test
    public void test02() throws Exception {
        log.debug("debug...");
        log.info("info....");
        log.error("error....");
    }


    @Test
    public void test03(){
        String name ="zhangsan";
        String pass ="123";
        log.info("name="+name+",pass="+pass);
        log.info("name={},pass={}",name,pass);
    }





}
