package demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class CompraEditora {
	@Id
	@GeneratedValue
	private Integer id;

	@ManyToMany
	private List<Livro> compraLivro;

	private String nomeEditora;
	private String cep;
	private Double valorProduto;

	public CompraEditora() {
		super();
	}


	public CompraEditora(Integer id, List<Livro> compraLivro, String nomeEditora, String cep, Double valorProduto) {
		super();
		this.id = id;
		this.compraLivro = compraLivro;
		this.nomeEditora = nomeEditora;
		this.cep = cep;
		this.valorProduto = valorProduto;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompraEditora other = (CompraEditora) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Livro> getCompraLivro() {
		return compraLivro;
	}
	public void setCompraLivro(List<Livro> compraLivro) {
		this.compraLivro = compraLivro;
	}
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}




}
