package com.cblue.springboot.demo14;

import com.cblue.springboot.demo12.Member;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class MemberConsumerController {

    @Resource
    private RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/get", method = RequestMethod.GET)
    public Object getMember(long mid, Model model) {
        System.out.println("222");
        Member member = this.restTemplate.getForObject(
                "http://localhost:8080/member/get/" + mid, Member.class);
        return member;
    }


    @RequestMapping(value = "/consumer/add", method = RequestMethod.GET)
    public Object addMember(Member member) {
        System.out.println("111");
        Boolean flag = this.restTemplate.postForObject(
                "http://localhost:8080/member/add", member, Boolean.class);
        return flag;
    }


}
