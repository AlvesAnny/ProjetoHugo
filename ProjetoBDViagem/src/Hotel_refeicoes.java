import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Hotel_refeicoes implements Identificavel {
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_refeicoes")
	private Refeicoes Refeicao;
	
	@ManyToMany
	@JoinTable(
			name = "hotel_refeicoes", 
			joinColumns = @JoinColumn(name = "hotel_id"), 
			inverseJoinColumns = @JoinColumn(name = "refeicao_id"))
	
	private Set<Refeicoes> refeicoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Refeicoes getRefeicao() {
		return Refeicao;
	}

	public void setRefeicao(Refeicoes refeicao) {
		Refeicao = refeicao;
	}

	public Set<Refeicoes> getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(Set<Refeicoes> refeicoes) {
		this.refeicoes = refeicoes;
	}


	
	
	
}
