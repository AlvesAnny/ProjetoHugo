import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity


public class Aeroporto {
	@Id
	private int id;
	private String nome;
	private String localização;
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
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
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
		Aeroporto other = (Aeroporto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Aeroporto(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Aeroporto [id=" + id + ", nome=" + nome + ", localização=" + localização + "]";
	}

	
}

