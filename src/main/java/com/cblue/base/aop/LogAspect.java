package com.cblue.base.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LogAspect {

    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.cblue.base.aop.AOPController.*(..))")
    public void cut() {
    }


    @Before("cut()")//在调用上面 @Pointcut标注的方法前执行以下方法
    public void doBefore(JoinPoint joinPoint) {//用于获取类方法
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url ={}", request.getRequestURI());//url
        logger.info("method={}", request.getMethod());   //method
        logger.info("ip={}", request.getRemoteAddr());  //ip
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + '.' +
                joinPoint.getSignature().getName()); //类方法获取类名及类方法
        logger.info("args={}", joinPoint.getArgs()); //参数
    }

    @After("cut()")//无论Controller中调用方法以何种方式结束，都会执行
    public void doAfter() {
        logger.info("----doAfter-----------");
    }

    @AfterReturning(returning = "obj", pointcut = "cut()")//在调用上面  @Pointcut标注的方法后执行。用于获取返回值
    public void doAfterReturning(Object obj) {
        logger.info("response={}", obj.toString());
    }

    @AfterThrowing("cut()")
    public void afterThrowingMethod() {
        System.out.println("目标方法抛出异常之后调用,正常返回时不调用。。。");
    }

    //环绕通知
    @Around("cut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕在目标方法之前。。。");
        // 访问目标方法名称
        String methodName = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        // 访问目标方法的参数
        Object[] paramsArr = joinPoint.getArgs();
        // 执行目标方法
        Object returnObj = joinPoint.proceed(paramsArr);
        System.out.println("执行的方法:" + methodName);
        System.out.println("环绕在目标方法之后。。。");
        return returnObj;
    }
}
