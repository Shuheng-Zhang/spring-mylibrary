package top.shuzz.spring.mylibrary.core.response;

/**
 * @author heng
 * @since 2024/2/13
 */
public enum FatalResponseEnum implements BaseResponse {

    BAD_REQUEST(4400, "BAD_REQUEST"),
    PARAMS_INVALID(4401, "PARAMS_INVALID"),

    FILE_OBJECT_NOT_EXISTED(5501, "FILE_OBJECT_NOT_EXISTED"),
    ;

    final private int code;
    final private String msg;

    FatalResponseEnum(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String msg() {
        return msg;
    }
}
