package org.example.exception.assertion;

import org.example.constant.IResponseEnum;
import org.example.exception.BaseException;
import org.example.exception.BusinessException;

import java.text.MessageFormat;

/**
 * @author YueZhiMing
 * @create 2020-06-30 16:39
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg, t);
    }

}
