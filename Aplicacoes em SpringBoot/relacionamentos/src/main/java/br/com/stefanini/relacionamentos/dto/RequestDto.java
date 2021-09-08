package br.com.stefanini.relacionamentos.dto;

public class RequestDto {

	private String id;

	private String name;

	private String nameMobile;

	private Double price;

	public RequestDto() {
	}

	public RequestDto(String id, String name, String nameMobile, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.nameMobile = nameMobile;
		this.price = price;
	}

	@Override
	public String toString() {
		return "RequestDto [id=" + id + ", name=" + name + ", nameMobile=" + nameMobile + ", price=" + price + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameMobile() {
		return nameMobile;
	}

	public void setNameMobile(String nameMobile) {
		this.nameMobile = nameMobile;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
