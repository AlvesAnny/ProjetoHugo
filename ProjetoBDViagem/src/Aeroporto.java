import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity


public class Aeroporto implements Identificavel{
	@Id
	private Long id;
	private String nome;
	private String localiza��o;
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
	public String getLocaliza��o() {
		return localiza��o;
	}
	public void setLocaliza��o(String localiza��o) {
		this.localiza��o = localiza��o;
	}
	@Override
	public String toString() {
		return "Aeroporto [id=" + id + ", nome=" + nome + ", localiza��o=" + localiza��o + "]";
	}
	public Aeroporto(Long id, String nome, String localiza��o) {
		super();
		this.id = id;
		this.nome = nome;
		this.localiza��o = localiza��o;
	}
	
	
	
	
	
}

