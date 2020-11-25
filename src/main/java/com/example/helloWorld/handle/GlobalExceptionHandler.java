package com.example.helloWorld.handle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author ：louzhengjie
 * @date ：Created in 2020/11/20 10:32 上午
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(Exception.class)
    @ExceptionHandler(RuntimeException.class)
    public void exceptionHandler(Exception e){
        log.error("chadaole");
    }

//    /**
//     * 处理RunTimeException异常
//     */
//    @ExceptionHandler(RuntimeException.class)
//    public void runtimeExceptionHandler(RuntimeException ex) {
//        log.error("超时了");
//    }

}
