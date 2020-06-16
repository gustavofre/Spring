package projeto.biblioteca.emprestimos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.biblioteca.emprestimos.Repository.EmprestimoRepository;
import projeto.biblioteca.emprestimos.model.Emprestimo;

@RestController
@RequestMapping("/emprestimo")
@CrossOrigin("*")

public class EmprestimoController {
	
	@Autowired
	private EmprestimoRepository repository;
	
	public ResponseEntity<List<Emprestimo>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
}
