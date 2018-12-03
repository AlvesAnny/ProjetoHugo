import javax.persistence.Entity;
import javax.persistence.Id;



@Entity


public class Hotel implements Identificavel {
	@Id
	private Long id;
	private String nome;
	private int wifi;
	private int piscina_com;
	private int piscina_sem;
	private int localizacao;
	private int academia_com;
	private int academia_sem;
	private int estacionamento;
	
	
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
	public int getWifi() {
		return wifi;
	}
	public void setWifi(int wifi) {
		this.wifi = wifi;
	}
	public int getPiscina_com() {
		return piscina_com;
	}
	public void setPiscina_com(int piscina_com) {
		this.piscina_com = piscina_com;
	}
	public int getPiscina_sem() {
		return piscina_sem;
	}
	public void setPiscina_sem(int piscina_sem) {
		this.piscina_sem = piscina_sem;
	}
	public int getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}
	public int getAcademia_com() {
		return academia_com;
	}
	public void setAcademia_com(int academia_com) {
		this.academia_com = academia_com;
	}
	public int getAcademia_sem() {
		return academia_sem;
	}
	public void setAcademia_sem(int academia_sem) {
		this.academia_sem = academia_sem;
	}
	public int getEstacionamento() {
		return estacionamento;
	}
	public void setEstacionamento(int estacionamento) {
		this.estacionamento = estacionamento;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nome=" + nome + ", wifi=" + wifi + ", piscina_com=" + piscina_com
				+ ", piscina_sem=" + piscina_sem + ", localizacao=" + localizacao + ", academia_com=" + academia_com
				+ ", academia_sem=" + academia_sem + ", estacionamento=" + estacionamento + "]";
	}
	public Hotel(Long id, String nome, int wifi, int piscina_com, int piscina_sem, int localizacao, int academia_com,
			int academia_sem, int estacionamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.wifi = wifi;
		this.piscina_com = piscina_com;
		this.piscina_sem = piscina_sem;
		this.localizacao = localizacao;
		this.academia_com = academia_com;
		this.academia_sem = academia_sem;
		this.estacionamento = estacionamento;
	}
	
	

}


