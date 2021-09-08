package br.com.stefanini.relaciona.response;

public class UsersError {

	private String status;

	private String value;

	public UsersError() {
	}

	public UsersError(String status, String value) {
		super();
		this.status = status;
		this.value = value;
	}

	@Override
	public String toString() {
		return "UsersError [status=" + status + ", value=" + value + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
