import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class Quartos {
	@Id
	private int id;
	private String standard;
	private String su�te_exclusiva;
	private String su�te_master;
	private String su�te_confort;
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
		return "Quartos [id=" + id + ", standard=" + standard + ", su�te_exclusiva=" + su�te_exclusiva
				+ ", su�te_master=" + su�te_master + ", su�te_confort=" + su�te_confort + ", superior_com_hidro="
				+ superior_com_hidro + "]";
	}

	
}

