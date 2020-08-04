package com.practice.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //annotation 생성 위치 지정, PRAMETER: 메소드 파라미터로 선언된 객체에서 사용가능
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser { //annotation 생성
}
