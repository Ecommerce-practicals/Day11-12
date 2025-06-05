package fas.ict.app.model;

public class ErrorResponce {
	private int statusCode;
	private String errorMessage;
	public ErrorResponce() {
		this.errorMessage = errorMessage;
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
