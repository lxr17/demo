package com.demo.entity;

import java.io.Serializable;

/**
 * Created by lanxingren on 2019-07-22.
 */
public class BaseResponse<T> implements Serializable {
    private Integer code;
    private T data;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return 200 == code;
    }
}
