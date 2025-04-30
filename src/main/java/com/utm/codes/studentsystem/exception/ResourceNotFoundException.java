package com.utm.codes.studentsystem.exception;

public class ResourceNotFoundException extends RuntimeException{
    private  static final  long serialVersionUID=1L;
     String errMsg;

    public ResourceNotFoundException(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
