package fas.ict.app.model;

public class ErrorResponse {
	private int statusCode;
	private String errorMessage;
	public ErrorResponse(int statusCode,String errotMessage) {
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
