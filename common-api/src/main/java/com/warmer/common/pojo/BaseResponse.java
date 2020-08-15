package com.warmer.common.pojo;

import com.google.gson.Gson;

/**
 * @ClassNameBaseResponse
 * @Description TODO
 * @Author wanghai
 * @Date2020/8/15 10:58 AM
 * @Version V1.0
 **/
public class BaseResponse {

    /**
     * 请求响应码
     */
    private int code ;

    /**
     * 错误代码
     */
    private String errorCode ;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应数据
     */
    private Gson data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Gson getData() {
        return data;
    }

    public void setData(Gson data) {
        this.data = data;
    }
}
