package projeto.biblioteca.emprestimos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_emprestimo1")
public class Emprestimo {
	
	@Column(name = "cd_emprestimo")
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (name = "dt_emprestimo", nullable = false)
	@Temporal (TemporalType.TIMESTAMP)
	private Date dataEmprestimo  = new java.sql.Date(System.currentTimeMillis());
	
	@Column (name = "dt_prevista_devolucao", nullable = false)
	@Temporal (TemporalType.TIMESTAMP)
	private Date dataPrevista;
	
	@Column (name = "dt_devolucao")
	@Temporal (TemporalType.TIMESTAMP)
	private Date dataDevolucao = new java.sql.Date(System.currentTimeMillis());
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateEmprestimo() {
		return dataEmprestimo;
	}
	public void setDateEmprestimo(Date dateEmprestimo) {
		this.dataEmprestimo = dateEmprestimo;
	}
	public Date getDatePrevista() {
		return dataPrevista;
	}
	public void setDatePrevista(Date datePrevista) {
		this.dataPrevista = datePrevista;
	}
	public Date getDateDevolucao() {
		return dataDevolucao;
	}
	public void setDateDevolucao(Date dateDevolucao) {
		this.dataDevolucao = dateDevolucao;
	}
	
	
	
}
