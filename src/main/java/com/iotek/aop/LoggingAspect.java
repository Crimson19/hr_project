package com.iotek.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    @Around(value = "execution(* com.iotek.dao.*(..))")
    public  Object  aroundLogging(){
        return  null;
    }
}
