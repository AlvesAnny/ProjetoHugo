
public class Foto implements Identificavel{
	private int id;
	private int largura;
    private int tamanho;
    private int datadafoto;
    private String localsalvo;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + datadafoto;
		result = prime * result + id;
		result = prime * result + largura;
		result = prime * result + ((localsalvo == null) ? 0 : localsalvo.hashCode());
		result = prime * result + tamanho;
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
		Foto other = (Foto) obj;
		if (datadafoto != other.datadafoto)
			return false;
		if (id != other.id)
			return false;
		if (largura != other.largura)
			return false;
		if (localsalvo == null) {
			if (other.localsalvo != null)
				return false;
		} else if (!localsalvo.equals(other.localsalvo))
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Foto [id=" + id + ", largura=" + largura + ", tamanho=" + tamanho + ", datadafoto=" + datadafoto
				+ ", localsalvo=" + localsalvo + "]";
	}
    
    
    
    
}
