package demo.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id
	@GeneratedValue
	private Integer id;

	private BigDecimal valor;
	private String genero;
	private String titulo;
	private String editora;
	private String isbn;
	private java.util.Date anoLancamento = new java.util.Date();
	private Integer quantidade;


	public Livro() {
		super();
	}

	public Livro(Integer id, BigDecimal valor, String genero, String titulo, String editora, String isbn,
			Date anoLancamento, Integer quantidade) {
		super();
		this.id = id;
		this.valor = valor;
		this.genero = genero;
		this.titulo = titulo;
		this.editora = editora;
		this.isbn = isbn;
		this.anoLancamento = anoLancamento;
		this.quantidade = quantidade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public java.util.Date getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(java.util.Date anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
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
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



}
