package br.com.stefanini.entity;

public class ItemProduto {
	
	private Long IdItem;
	private Produto produto;
	private Integer quantidade;
	
	public Long getIdItem() {
		return IdItem;
	}
	public void setIdItem(Long idItem) {
		IdItem = idItem;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
