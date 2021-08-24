package br.com.stefanini.projetoRelacionamento.dto.response;

public class ResponseException {

	// Quando acontecer um erro o que eu quero que saia

	private String status;
	private String value;

	public ResponseException() {
	}

	@Override
	public String toString() {
		return "ResponseUserException [status=" + status + ", value=" + value + "]";
	}

	public ResponseException(String status, String value) {
		super();
		this.status = status;
		this.value = value;
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
