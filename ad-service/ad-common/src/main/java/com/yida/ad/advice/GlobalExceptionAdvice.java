package com.yida.ad.advice;

import com.alibaba.fastjson.JSON;
import com.yida.ad.exception.AdException;
import com.yida.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest request, AdException ex) {
        CommonResponse<String> response = new CommonResponse<>(-1, "AdException error");
        Map<String, Object> map = new HashMap<>();
        map.put("exception", ex.getMessage());
        map.put("request", request);
        //map转字符串
        String jsonString = JSON.toJSONString(map);
        response.setData(jsonString);
        return response;
    }
}
