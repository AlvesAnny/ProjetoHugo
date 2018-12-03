import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Agencia implements Identificavel {
	@Id
	private Long id;
	private String nome;
	private String viagem;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String toString() {
		return "Agencia [id=" + id + ", nome=" + nome + ", viagem=" + viagem + "]";
	}
	public Agencia(Long id, String nome, String viagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.viagem = viagem;
	}
	
	
}

