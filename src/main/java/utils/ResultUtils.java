package utils;

import model.Result;
import status.Status;

public class ResultUtils {

    public static <T> Result<T> success(T data){
        return new Result<T>(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), data);
    }

    public static <T> Result<T> success(){
        return new Result<T>(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg());
    }

    public static <T> Result<T> error(Integer code, String msg){
        return new Result<T>(code, msg);
    }

    public static <T> Result<T> error(String msg){
        return new Result<T>(Status.ERROR.getCode(), msg);
    }



}
