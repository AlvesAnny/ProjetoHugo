
public class Post implements Identificavel {
	private Long id;
	private int largura;
    private int tamanho;
    private String arquivo;
    private String comentario;
    private String Usuario;
	
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
	public String toString() {
		return "Post [id=" + id + ", largura=" + largura + ", tamanho=" + tamanho + ", arquivo=" + arquivo
				+ ", comentario=" + comentario + ", Usuario=" + Usuario + "]";
	}
	public Post(Long id, int largura, int tamanho, String arquivo, String comentario, String usuario) {
		super();
		this.id = id;
		this.largura = largura;
		this.tamanho = tamanho;
		this.arquivo = arquivo;
		this.comentario = comentario;
		Usuario = usuario;
	}
	
    
}
