package top.shuzz.spring.mylibrary.core.exception;

import top.shuzz.springmylibrary.core.response.FatalResponseEnum;

/**
 * @author heng
 * @since 2024/2/13
 */
public class BusinessException extends RuntimeException {

    final private int code;

    public BusinessException(final FatalResponseEnum fatalEnum) {
        super(fatalEnum.msg());
        this.code = fatalEnum.code();
    }

    public int getCode() {
        return code;
    }
}
