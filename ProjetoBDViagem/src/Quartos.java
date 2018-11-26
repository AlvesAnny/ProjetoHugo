import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class Quartos {
	@Id
	private int id;
	private String standard;
	private String suíte_exclusiva;
	private String suíte_master;
	private String suíte_confort;
	private String superior_com_hidro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSuíte_exclusiva() {
		return suíte_exclusiva;
	}
	public void setSuíte_exclusiva(String suíte_exclusiva) {
		this.suíte_exclusiva = suíte_exclusiva;
	}
	public String getSuíte_master() {
		return suíte_master;
	}
	public void setSuíte_master(String suíte_master) {
		this.suíte_master = suíte_master;
	}
	public String getSuíte_confort() {
		return suíte_confort;
	}
	public void setSuíte_confort(String suíte_confort) {
		this.suíte_confort = suíte_confort;
	}
	public String getSuperior_com_hidro() {
		return superior_com_hidro;
	}
	public void setSuperior_com_hidro(String superior_com_hidro) {
		this.superior_com_hidro = superior_com_hidro;
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
		Quartos other = (Quartos) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Quartos(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Quartos [id=" + id + ", standard=" + standard + ", suíte_exclusiva=" + suíte_exclusiva
				+ ", suíte_master=" + suíte_master + ", suíte_confort=" + suíte_confort + ", superior_com_hidro="
				+ superior_com_hidro + "]";
	}

	
}

