import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class Quartos implements Identificavel {
	@Id
	private Long id;
	private String standard;
	private String su�te_exclusiva;
	private String su�te_master;
	private String su�te_confort;
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
	public String getSu�te_exclusiva() {
		return su�te_exclusiva;
	}
	public void setSu�te_exclusiva(String su�te_exclusiva) {
		this.su�te_exclusiva = su�te_exclusiva;
	}
	public String getSu�te_master() {
		return su�te_master;
	}
	public void setSu�te_master(String su�te_master) {
		this.su�te_master = su�te_master;
	}
	public String getSu�te_confort() {
		return su�te_confort;
	}
	public void setSu�te_confort(String su�te_confort) {
		this.su�te_confort = su�te_confort;
	}
	public String getSuperior_com_hidro() {
		return superior_com_hidro;
	}
	public void setSuperior_com_hidro(String superior_com_hidro) {
		this.superior_com_hidro = superior_com_hidro;
	}
	@Override
	public String toString() {
		return "Quartos [id=" + id + ", standard=" + standard + ", su�te_exclusiva=" + su�te_exclusiva
				+ ", su�te_master=" + su�te_master + ", su�te_confort=" + su�te_confort + ", superior_com_hidro="
				+ superior_com_hidro + "]";
	}
	public Quartos(Long id, String standard, String su�te_exclusiva, String su�te_master, String su�te_confort,
			String superior_com_hidro) {
		super();
		this.id = id;
		this.standard = standard;
		this.su�te_exclusiva = su�te_exclusiva;
		this.su�te_master = su�te_master;
		this.su�te_confort = su�te_confort;
		this.superior_com_hidro = superior_com_hidro;
	}
	
	
}

