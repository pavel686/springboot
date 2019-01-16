package com.cblue.base.log;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestLogger {


    //private static final Logger logger = LoggerFactory.getLogger(TestLogger.class);

    @Test
    public void test01() {
        log.debug("debug...");
        log.info("info....");
        log.error("error....");

        String name = "zhangsan";
        String pass = "123";
        log.info("name=" + name + ",pass=" + pass);
        log.info("name={},pass={}", name, pass);
    }


}
