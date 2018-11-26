import java.util.ArrayList;

public interface Mamae {
	
	public Post postar(Agencia agencia, Foto foto);
	// 
	public void curtir(Cliente cliente, Post post);
	// 
	public void comenta(Cliente cliente, Post post, String comentario);
	// 
	public ArrayList<Hotel> pesquisa (String termo);
	// 
	public ArrayList<Agencia> procurar (String termo);
	// 
	public ArrayList<Quartos> pesquisar (String termo);
	//
	public void conversa(Cliente cliente, Agencia agencia);
	// 

}