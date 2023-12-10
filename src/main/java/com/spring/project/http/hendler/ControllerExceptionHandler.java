package com.spring.project.http.hendler;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler /* extends ResponseEntityExceptionHandler */ {

    @ExceptionHandler({Exception.class})
    public String handleExceptions(Exception exception, HttpServletRequest request){
        log.error("Fail to return response",exception);
        return "error/error500";
    }

}