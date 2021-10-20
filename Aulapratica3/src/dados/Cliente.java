package dados;

public class Cliente {
	private int cpf;
	private String nome;
	private String endereco;
	private int telefone;
	private Reserva reservas[] = new Reserva[10];
	private int quantReservas = 0;
	
	public Cliente() {
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCpf() {
		return cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getTelefone() {
		return telefone;
	}
	public int getQuantReservas() {
		return quantReservas;
	}
	public Reserva[] getReservas() {
		return reservas;
	}
	public void reservarIda(Reserva reserva) {
		if(quantReservas < reservas.length) {
			reservas[quantReservas] = reserva;
			quantReservas++;
		}
		else {
			System.out.println("Lista está cheia.");
		}
	}
	public void reservarVolta(Reserva ida, Reserva volta) {
		if(quantReservas < reservas.length) {
			reservas[quantReservas] = volta;
			quantReservas++;
			ida.setVolta(volta);
		}
		else {
			System.out.println("Lista está cheia.");
		}
		
	}
	public String toString() {
		return "Nome: "+nome+" Endereco: "+endereco+ " CPF: " +cpf+ " Telefone: "+telefone;
	}
	public boolean equals(Object o) {
		if(o instanceof Cliente) {
			Cliente c = (Cliente) o;
			if(c.getCpf() == this.getCpf()) {
				return true;
			}
		}
		return false;
	}
	public boolean comparaClientes(Cliente c1, Cliente c2) {
		if(c1.equals(c2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
