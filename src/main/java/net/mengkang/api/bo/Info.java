package net.mengkang.api.bo;

/**
 * Created by zhoumengkang on 30/12/15.
 */
public class Info {
    private boolean success;
    private int error;
    private String errorMessage;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getError() {
        return error;
    }

    public Info setError(int error) {
        this.error = error;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
