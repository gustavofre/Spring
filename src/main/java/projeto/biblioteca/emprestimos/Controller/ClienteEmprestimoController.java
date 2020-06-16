package projeto.biblioteca.emprestimos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.biblioteca.emprestimos.Repository.ClienteRepository;
import projeto.biblioteca.emprestimos.model.Cliente;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")

public class ClienteEmprestimoController {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/titulo/{nomeCliente}")
	public ResponseEntity<List<Cliente>> GetBynomeCliente(@PathVariable String nomeCliente){
		return ResponseEntity.ok(repository.findAllByNomeClienteContainingIgnoreCase(nomeCliente));
	}

	@PostMapping
	public ResponseEntity<Cliente> post (@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
	}
	
	@PutMapping
	public ResponseEntity<Cliente> put (@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(cliente));
	}

	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}


}

