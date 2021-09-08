package br.com.stefanini.relacionamento.response;

public class ErrorMessage {

	private String name;
	private String value;

	public ErrorMessage() {
	}

	public ErrorMessage(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "ErrorMessage [name=" + name + ", value=" + value + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
