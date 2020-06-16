package projeto.biblioteca.emprestimos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	
	@Column (name = "cd_cliente")
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column (name = "nm_cliente", nullable = false, length = 100)
	@NotNull
	@Size (min = 3, max = 100)
	private String  nomeCliente;
	
	
	@Column (name = "nm_endereco", nullable = false, length = 255)
	@NotNull
	@Size (min = 3, max = 255)	
	private String endereco;
	
	@Column (name= "dc_cliente", nullable = false, length = 30)
	@NotNull
	@Size (min = 10, max = 30)
	private int documento;
	
	@Column (name = " nm_email", nullable = false , length = 100)
	@NotNull
	@Size (min= 5, max = 100)
	private String email;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
