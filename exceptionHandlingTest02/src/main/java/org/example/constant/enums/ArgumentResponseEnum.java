package org.example.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.exception.assertion.CommonExceptionAssert;

/**
 * <p>参数校验异常返回结果</p>
 *
 * @author sprainkle
 * @date 2019/5/2
 */
@Getter
@AllArgsConstructor
public enum ArgumentResponseEnum implements CommonExceptionAssert {
    /**
     * 绑定参数校验异常
     */
    VALID_ERROR(6000, "参数校验异常"),

    ;

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;

}