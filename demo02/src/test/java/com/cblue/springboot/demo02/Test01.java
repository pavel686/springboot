package com.cblue.springboot.demo02;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01 {


    @Test
    public void test01(){
        String str = "111";
        System.out.println(str);
       // Assert.assertEquals(str,"111");
        //Assert.assertNotEquals(str,"111");
       Assert.assertNull(str);
    }


}
