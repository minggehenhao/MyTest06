package org.example.pojo.response;



import lombok.Data;
import org.example.constant.IResponseEnum;
import org.example.enmu.CommonResponseEnum;

/**
 * <p>基础返回结果</p>
 * @author YueZhiMing
 * @create 2020-06-30 16:54
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
