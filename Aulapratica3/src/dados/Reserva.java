package dados;

public class Reserva{
	private int numReserva;
	private String dataVoo;
	private String horaVoo;
	private float preco;
	private String classeVoo;
	private boolean idaEvolta = false;
	private int poltrona;
	private Reserva volta;
	private Cidade origem;
	private Cidade destino;
	
	public Reserva() {
		
	}
	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}
	public int getNumReserva() {
		return numReserva;
	}
	public void setDataVoo(String dataVoo) {
		this.dataVoo = dataVoo;
	}
	public String getDataVoo() {
		return dataVoo;
	}
	public void setHoraVoo(String horaVoo) {
		this.horaVoo = horaVoo;
	}
	public String getHoraVoo() {
		return horaVoo;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPreco() {
		return preco;
	}
	public void setClasseVoo(String classeVoo) {
		this.classeVoo = classeVoo;
	}
	public String getClasseVoo() {
		return classeVoo;
	}
	public boolean isIdaEvolta() {
		return idaEvolta;
	}
	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}
	public int poltrona() {
		return poltrona;
	}
	public void setVolta(Reserva volta) {
		this.volta = volta;
		this.idaEvolta = true;
	}
	public Reserva getVolta() {
		return volta;
	}
	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}
	public Cidade getOrigem() {
		return origem;
	}
	public void setDestino(Cidade destino) {
		this.destino = destino;
	}
	public Cidade getDestino() {
		return destino;
	}
	public String toString() {
		return "Numero: "+numReserva+ " Data: "+dataVoo+ " Horario: "+horaVoo+ " Preco: " +preco+ " Classe: " +classeVoo+" Poltrona: "+poltrona+ "\nCidade Origem:\n"+origem+ "\nCidade Destino:\n"+destino+"\n";
	}
	
}