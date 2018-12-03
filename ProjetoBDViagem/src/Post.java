
public class Post implements Identificavel {
	private int id;
	private int largura;
    private int tamanho;
    private String arquivo;
    private String comentario;
    private String Usuario;
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
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Usuario == null) ? 0 : Usuario.hashCode());
		result = prime * result + ((arquivo == null) ? 0 : arquivo.hashCode());
		result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + id;
		result = prime * result + largura;
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
		Post other = (Post) obj;
		if (Usuario == null) {
			if (other.Usuario != null)
				return false;
		} else if (!Usuario.equals(other.Usuario))
			return false;
		if (arquivo == null) {
			if (other.arquivo != null)
				return false;
		} else if (!arquivo.equals(other.arquivo))
			return false;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (id != other.id)
			return false;
		if (largura != other.largura)
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", largura=" + largura + ", tamanho=" + tamanho + ", arquivo=" + arquivo
				+ ", comentario=" + comentario + ", Usuario=" + Usuario + "]";
	}
	public Post(int id, int largura, int tamanho, String arquivo, String comentario, String usuario) {
		super();
		this.id = id;
		this.largura = largura;
		this.tamanho = tamanho;
		this.arquivo = arquivo;
		this.comentario = comentario;
		Usuario = usuario;
	}
    
    
}
