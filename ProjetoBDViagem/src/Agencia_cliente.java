import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Agencia_cliente implements Identificavel{
	private int id;
	private Agencia agencia;
	private Cliente Cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@ManyToMany
	@JoinTable(
			name = "agencia_cliente", 
			joinColumns = @JoinColumn(name = "agencia_id"), 
			inverseJoinColumns = @JoinColumn(name = "cliente_id"))
	
	private Set<Cliente> clientes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	
	
	}
	
	

