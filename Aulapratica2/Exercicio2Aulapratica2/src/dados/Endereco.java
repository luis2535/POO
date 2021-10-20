package dados;

public class Endereco{
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	
	public Endereco() {
		
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getRua() {
		return rua;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getCep() {
		return cep;
	}
	
	public String toString() {
		return "Rua: "+rua+" Numero: "+numero+" Bairro: "+bairro+" Cidade: "+cidade+" Estado: "+estado+" CEP: "+cep;
	}	
}