
public class Foto implements Identificavel{
	private Long id;
	private int largura;
    private int tamanho;
    private int datadafoto;
    private String localsalvo;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getDatadafoto() {
		return datadafoto;
	}
	public void setDatadafoto(int datadafoto) {
		this.datadafoto = datadafoto;
	}
	public String getLocalsalvo() {
		return localsalvo;
	}
	public void setLocalsalvo(String localsalvo) {
		this.localsalvo = localsalvo;
	}
	@Override
	public String toString() {
		return "Foto [id=" + id + ", largura=" + largura + ", tamanho=" + tamanho + ", datadafoto=" + datadafoto
				+ ", localsalvo=" + localsalvo + "]";
	}
	public Foto(Long id, int largura, int tamanho, int datadafoto, String localsalvo) {
		super();
		this.id = id;
		this.largura = largura;
		this.tamanho = tamanho;
		this.datadafoto = datadafoto;
		this.localsalvo = localsalvo;
	}
	
	
}
