package status;

public enum Status {
    SUCCESS(200,"SUCCESS"),
    ERROR(400, "FAIL");

    private Integer code;
    private String msg;

    Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
