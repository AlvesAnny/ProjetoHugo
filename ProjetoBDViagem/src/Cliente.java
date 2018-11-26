import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

		@Entity
		public class Cliente {

		@Id
		private Long id;
		private String nome;

		@OneToMany(mappedBy="cliente")
		private Set<Agencia> agencias;


public class Cliente {
	private int id;
	private int cpf;
	private String nome;
	private String nacionalidade;
	private int data_nascimento;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf != other.cpf)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public Cliente(int id, int cpf) {
		super();
		this.id = id;
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", nacionalidade=" + nacionalidade
				+ ", data_nascimento=" + data_nascimento + "]";
	}
	
	

}

