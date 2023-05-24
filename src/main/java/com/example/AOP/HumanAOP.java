package com.example.AOP;

import lombok.Data;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
@Data
public class HumanAOP {

    @Before("execution(public void study())")
    public void wakeUp(JoinPoint joinPoint){
        System.out.println("Good Morning :" + joinPoint.getSignature());
    }

    @AfterReturning(value = "execution(* com.example.AOP.*.*(..))",returning = "student")
    public void printStudent(JoinPoint joinPoint,Student student){
        System.out.println("The value of student is" + student.toString());
    }

    @AfterThrowing(value = "execution(* com.example.AOP.*.*(..))",throwing = "e")
    public void throwException(JoinPoint joinPoint,Exception e){
        System.out.println("After method invoked exception::" + e.getMessage());
    }
}
