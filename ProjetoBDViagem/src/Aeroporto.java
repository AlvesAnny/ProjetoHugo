import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity


public class Aeroporto implements Identificavel{
	@Id
	private Long id;
	private String nome;
	private String localização;
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
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
	}
	@Override
	public String toString() {
		return "Aeroporto [id=" + id + ", nome=" + nome + ", localização=" + localização + "]";
	}
	public Aeroporto(Long id, String nome, String localização) {
		super();
		this.id = id;
		this.nome = nome;
		this.localização = localização;
	}
	
	
	
	
	
}

