package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Livro;

public class LivrariaRepository {

	@Repository
	public interface PessoaRepository extends JpaRepository<Livro, Integer>{

	}

}