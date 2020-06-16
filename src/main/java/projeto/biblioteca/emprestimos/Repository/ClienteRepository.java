package projeto.biblioteca.emprestimos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.biblioteca.emprestimos.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{

	public List <Cliente> findAllByNomeClienteContainingIgnoreCase (String nomeCliente);
}
