package com.cblue.springboot.demo13;

import com.cblue.springboot.demo12.Member;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
public class MemberController {

    @ApiOperation(value = "获取指定编号的人员信息", notes = "只需要设置mid的信息就可以获取Member的完整内容")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mid", value = "用户编号", required = true, paramType="path", dataType = "long")})
    @RequestMapping(value = "/member/get/{mid}")
    public Member get(@PathVariable("mid") long mid) {
        Member vo = new Member();
        vo.setMid(mid);
        vo.setName("studyjava - " + mid);
        vo.setBirthday(new Date());
        vo.setSalary(99999.99);
        vo.setAge(16);
        return vo;
    }

    @ApiOperation(value = "实现人员信息的添加处理", notes = "添加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "member", value = "用户描述的详细实体信息", required = true, dataType = "MemberClass")})
    @PostMapping(value = "/member/add")
    public Object add(@RequestBody Member member) {    // 表示当前的配置可以直接将参数变为VO对象
       // Member member = new Member(mid,name);
        System.err.println("【MemberController.add()接收对象】" + member);
        return true;
    }

}
