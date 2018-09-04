package demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Livro;
import demo.repositories.LivrariaRepository;

@RestController
@RequestMapping("api/livro")
public class LivrariaResource{

	@Autowired
	LivrariaRepository livrariaRepository;

	@GetMapping
	public List<Livro> get(){
		return livrariaRepository.findAll();
	}

	@GetMapping("{id}")
	public Livro get(@PathVariable("id") Integer id) {
		return livrariaRepository.getOne(id);
	}

	@PostMapping
	public Livro save(@RequestBody Livro livro) {
		return livrariaRepository.save(livro);
	}

	@PutMapping
	public Livro update(@RequestBody Livro livro) {
		return livrariaRepository.save(livro);

	}

}