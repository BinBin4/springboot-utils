package model;


import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1554257824560361213L;

    private Integer code;

    private String msg;

    private T data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
