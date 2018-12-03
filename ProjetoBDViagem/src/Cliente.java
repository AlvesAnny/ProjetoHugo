import javax.persistence.Entity;
import javax.persistence.Id;


@Entity


public class Cliente implements Identificavel {
	@Id
	private Long id;
	private int cpf;
	private String nome;
	private String nacionalidade;
	private int data_nascimento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(int data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", nacionalidade=" + nacionalidade
				+ ", data_nascimento=" + data_nascimento + "]";
	}
	public Cliente(Long id, int cpf, String nome, String nacionalidade, int data_nascimento) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.data_nascimento = data_nascimento;
	}
	
	

}

