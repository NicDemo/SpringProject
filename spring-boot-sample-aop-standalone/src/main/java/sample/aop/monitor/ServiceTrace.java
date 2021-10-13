package sample.aop.monitor;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceTrace {
    @Before("execution (public * *(..))")
    public void Trace(){}
}
