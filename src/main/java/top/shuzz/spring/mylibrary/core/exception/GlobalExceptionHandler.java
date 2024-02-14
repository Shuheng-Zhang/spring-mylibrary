package top.shuzz.spring.mylibrary.core.exception;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.shuzz.spring.mylibrary.core.response.DataResult;

/**
 * 全局异常处理器
 * @author heng
 * @since 2024/2/13
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    final private static Log LOGGER = LogFactory.get();

    final private static int DEFAULT_EXCEPTION_CODE = 500;


    /**
     * 业务异常处理器
     * @param exception 业务异常
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public DataResult businessExceptionHandler(final BusinessException exception) {
        return new DataResult(exception.getCode(), exception.getMessage(), null);
    }

    /**
     * 通用异常处理器
     * @param exception 其他未处理异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public DataResult generalExceptionHandler(final Exception exception) {
        LOGGER.error(exception, "Application Fatal Occurred");
        return new DataResult(DEFAULT_EXCEPTION_CODE, exception.getMessage(), null);
    }
}
