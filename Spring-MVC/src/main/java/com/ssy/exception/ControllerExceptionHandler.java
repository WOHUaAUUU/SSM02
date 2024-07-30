package com.ssy.exception;

import com.ssy.util.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R handleArithmeticException(ArithmeticException e){
        return R.error(null, e.getMessage());
    }
}
