package top.shuzz.spring.mylibrary.core.response;

/**
 * @author heng
 * @since 2024/2/13
 */
public enum SuccessResponseEnum implements BaseResponse{


    OK(0, "OK")

    ;

    SuccessResponseEnum(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    final private int code;
    final private String msg;

    @Override
    public int code() {
        return code;
    }

    @Override
    public String msg() {
        return msg;
    }
}
