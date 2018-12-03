import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Hotel_quartos implements Identificavel {

	private Long id;
	private Quartos quartos;
	
	@ManyToOne
	@JoinColumn(name = "id_quartos")
	private Quartos quarto;
	
	@ManyToMany
	@JoinTable(
			name = "hotel_quartos", 
			joinColumns = @JoinColumn(name = "hotel_id"), 
			inverseJoinColumns = @JoinColumn(name = "quartos_id"))
	
	private Set<Quartos> quartoss;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Quartos getQuartos() {
		return quartos;
	}

	public void setQuartos(Quartos quartos) {
		this.quartos = quartos;
	}

	public Quartos getQuarto() {
		return quarto;
	}

	public void setQuarto(Quartos quarto) {
		this.quarto = quarto;
	}

	public Set<Quartos> getQuartoss() {
		return quartoss;
	}

	public void setQuartoss(Set<Quartos> quartoss) {
		this.quartoss = quartoss;
	}

	
	
	
	
}
