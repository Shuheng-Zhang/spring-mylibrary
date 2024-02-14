package top.shuzz.spring.mylibrary.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author heng
 * @since 2024/2/13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataResult implements Serializable {

    private int code;
    private String msg;
    private Object data;


    public DataResult(final BaseResponse responseEnum, final Object data) {
        this.code = responseEnum.code();
        this.msg = responseEnum.msg();
        this.data = data;
    }

    public static DataResult success() {
        return new DataResult(SuccessResponseEnum.OK, null);
    }

    public static DataResult success(final Object data) {
        return new DataResult(SuccessResponseEnum.OK, data);
    }


    public static DataResult fatal(final FatalResponseEnum fatalEnum) {
        return new DataResult(fatalEnum, null);
    }
}
