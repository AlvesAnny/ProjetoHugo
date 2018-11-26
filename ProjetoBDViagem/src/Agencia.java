import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

	@Entity
	public class Agencia {

	@Id
	private Long id;
	private String nome;
	
	@OneToMany(mappedBy="agencia")
	private Set<Cliente> clientes;

public class Agencia {
	private int id;
	private String nome;
	private String viagem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getViagem() {
		return viagem;
	}
	public void setViagem(String viagem) {
		this.viagem = viagem;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Agencia other = (Agencia) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Agencia(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Agencia [id=" + id + ", nome=" + nome + ", viagem=" + viagem + "]";
	}
	
	

}

