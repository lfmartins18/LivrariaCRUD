package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Compra {

	@Id
	@GeneratedValue
	private Integer id;

	@OneToMany
	private List<CadastroCliente> cliente;

	@ManyToMany
	private List<Livro> livro;


	public Compra() {
		super();
	}


	public Compra(Integer id, List<CadastroCliente> cliente, List<Livro> livro) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.livro = livro;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<CadastroCliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<CadastroCliente> cliente) {
		this.cliente = cliente;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}



}
