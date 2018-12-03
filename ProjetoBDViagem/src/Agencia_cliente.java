import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Agencia_cliente implements Identificavel{
	private Long id;
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

	@Override
	public String toString() {
		return "Agencia_cliente [id=" + id + ", agencia=" + agencia + ", Cliente=" + Cliente + ", cliente=" + cliente
				+ ", clientes=" + clientes + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Agencia_cliente(Long id, Agencia agencia, Cliente cliente, Cliente cliente2, Set<Cliente> clientes) {
		super();
		this.id = id;
		this.agencia = agencia;
		Cliente = cliente;
		cliente = cliente2;
		this.clientes = clientes;
	}

	
	
	}
	
	

