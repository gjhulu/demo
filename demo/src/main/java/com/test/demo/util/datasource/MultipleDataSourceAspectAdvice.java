package com.test.demo.util.datasource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//import com.yph.h5.wx.mapper.CouponInfoMapper;

/**
 * 数据源自动切换组件
 * @version v1.0
 * @author Administrator
 * @date 2018年1月1日
 */
@Component
@Aspect
public class MultipleDataSourceAspectAdvice {

	@Pointcut("execution(* com.yph.h5.wx.mapper.*.*(..))")
	public void aspectAdvice(){	}
	
    @Around("aspectAdvice()")
    public Object doAround(ProceedingJoinPoint jp) throws Throwable {
    	//暂时注掉
    	/*if (jp.getTarget() instanceof CouponInfoMapper) {
            MultipleDataSource.setDataSourceKey("wxDataSource");
        } else{
            MultipleDataSource.setDataSourceKey("h5DataSource");
        }*/
        return jp.proceed();
    }
}