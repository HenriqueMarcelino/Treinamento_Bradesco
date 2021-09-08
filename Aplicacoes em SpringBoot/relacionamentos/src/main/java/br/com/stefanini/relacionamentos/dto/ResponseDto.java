package br.com.stefanini.relacionamentos.dto;

public class ResponseDto {

	private String id;
	private String name;

	private Integer idMobile;
	private String nameMobile;
	private Double price;
	private String CustomerId;
	
	public ResponseDto() {
	}

	
	@Override
	public String toString() {
		return "ResponseDto [id=" + id + ", name=" + name + ", idMobile=" + idMobile + ", nameMobile=" + nameMobile
				+ ", price=" + price + ", CustomerId=" + CustomerId + "]";
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

	public Integer getIdMobile() {
		return idMobile;
	}

	public void setIdMobile(Integer idMobile) {
		this.idMobile = idMobile;
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

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

}
