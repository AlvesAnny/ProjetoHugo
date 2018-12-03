import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Hotel_quartos implements Identificavel {

	private int id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Quartos getQuarto() {
		return quarto;
	}

	public void setQuarto(Quartos quarto) {
		this.quarto = quarto;
	}
	
	
	
}
