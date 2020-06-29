package org.example.pojo.response;

import lombok.Data;
import org.example.constant.IResponseEnum;
import org.example.constant.enums.CommonResponseEnum;

/**
 * <p>基础返回结果</p>
 *
 * @author sprainkle
 * @date 2019/5/2
 */
@Data
public class BaseResponse {
    /**
     * 返回码
     */
    protected int code;
    /**
     * 返回消息
     */
    protected String message;

    public BaseResponse() {
        // 默认创建成功的回应
        this(CommonResponseEnum.SUCCESS);
    }

    public BaseResponse(IResponseEnum responseEnum) {
        this(responseEnum.getCode(), responseEnum.getMessage());
    }

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
