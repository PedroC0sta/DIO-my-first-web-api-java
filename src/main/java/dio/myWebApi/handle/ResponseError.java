package dio.myWebApi.handle;

import java.util.Date;

public class ResponseError {
    private Date timestemp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;


    public Date getTimestemp() {
        return timestemp;
    }

    public void setTimestemp(Date timestemp) {
        this.timestemp = timestemp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
