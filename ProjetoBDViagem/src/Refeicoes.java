import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class Refeicoes implements Identificavel{
	@Id
	private int id;
	private String pensao_completa;
    private String meia_pensao;
    private String cafe_da_manha;
    private String sem_refeicao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPensao_completa() {
		return pensao_completa;
	}
	public void setPensao_completa(String pensao_completa) {
		this.pensao_completa = pensao_completa;
	}
	public String getMeia_pensao() {
		return meia_pensao;
	}
	public void setMeia_pensao(String meia_pensao) {
		this.meia_pensao = meia_pensao;
	}
	public String getCafe_da_manha() {
		return cafe_da_manha;
	}
	public void setCafe_da_manha(String cafe_da_manha) {
		this.cafe_da_manha = cafe_da_manha;
	}
	public String getSem_refeicao() {
		return sem_refeicao;
	}
	public void setSem_refeicao(String sem_refeicao) {
		this.sem_refeicao = sem_refeicao;
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
		Refeicoes other = (Refeicoes) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Refeicoes(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Refeicoes [id=" + id + ", pensao_completa=" + pensao_completa + ", meia_pensao=" + meia_pensao
				+ ", cafe_da_manha=" + cafe_da_manha + ", sem_refeicao=" + sem_refeicao + "]";
	}
    
    
}

