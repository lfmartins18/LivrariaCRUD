package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Livro;

@Repository
public interface LivrariaRepository extends JpaRepository<Livro, Integer>{

}
