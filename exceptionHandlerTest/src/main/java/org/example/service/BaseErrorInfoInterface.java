package org.example.service;

/**
 * @author YueZhiMing
 * @create 2020-06-28 15:24
 */
public interface BaseErrorInfoInterface {

    /** 错误码*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();
}
