package com.qf.withmycar.exception;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = UnauthorizedException.class )
    public String defaultErrorHandler(HttpServletRequest req, Exception e){
        return "login";
    }
}
