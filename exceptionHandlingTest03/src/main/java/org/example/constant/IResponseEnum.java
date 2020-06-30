package org.example.constant;

/**
 * 异常返回码枚举接口
 * @author YueZhiMing
 * @create 2020-06-30 16:35
 */
public interface  IResponseEnum {
    /**
     * 获取返回码
     * @return 返回码
     */
    int getCode();

    /**
     * 获取返回信息
     * @return 返回信息
     */
    String getMessage();
}
