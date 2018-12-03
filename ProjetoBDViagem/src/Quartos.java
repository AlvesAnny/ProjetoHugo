import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class Quartos implements Identificavel {
	@Id
	private Long id;
	private String standard;
	private String suíte_exclusiva;
	private String suíte_master;
	private String suíte_confort;
	private String superior_com_hidro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String toString() {
		return "Quartos [id=" + id + ", standard=" + standard + ", suíte_exclusiva=" + suíte_exclusiva
				+ ", suíte_master=" + suíte_master + ", suíte_confort=" + suíte_confort + ", superior_com_hidro="
				+ superior_com_hidro + "]";
	}
	public Quartos(Long id, String standard, String suíte_exclusiva, String suíte_master, String suíte_confort,
			String superior_com_hidro) {
		super();
		this.id = id;
		this.standard = standard;
		this.suíte_exclusiva = suíte_exclusiva;
		this.suíte_master = suíte_master;
		this.suíte_confort = suíte_confort;
		this.superior_com_hidro = superior_com_hidro;
	}
	
	
}

