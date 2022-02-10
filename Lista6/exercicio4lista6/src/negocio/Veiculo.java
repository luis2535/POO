package negocio;

import dados.CorLataria;
import dados.PotenciaMotor;
import dados.TipoVentilacao;

public class Veiculo {
	private double valorInicial;
	private CorLataria corLataria;
	private PotenciaMotor potenciaMotor;
	private TipoVentilacao tipoVentilacao;
	
	public Veiculo(double valorInicial, CorLataria corLataria, PotenciaMotor potenciaMotor, TipoVentilacao tipoVentilacao) {
		this.valorInicial = valorInicial;
		this.corLataria = corLataria;
		this.potenciaMotor = potenciaMotor;
		this.tipoVentilacao = tipoVentilacao;		
	}
	public Veiculo() {
		
	}
	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public CorLataria getCorLataria() {
		return corLataria;
	}

	public void setCorLataria(CorLataria corLataria) {
		this.corLataria = corLataria;
	}

	public PotenciaMotor getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(PotenciaMotor potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public TipoVentilacao getTipoVentilacao() {
		return tipoVentilacao;
	}

	public void setTipoVentilacao(TipoVentilacao tipoVentilacao) {
		this.tipoVentilacao = tipoVentilacao;
	}
	
	public double calculaValorCor() {
		return corLataria.getCor().calculaValorCor();
	}
	public double calculaFatorMotor() {
		return valorInicial*potenciaMotor.getMotor().calculaFatorMotor();
	}
	public double calculaValorVentilacao() {
		return tipoVentilacao.getTipo().calculaValorVentilacao();
	}
	public double calculaTotal() {
		return valorInicial + calculaFatorMotor() + calculaValorCor() + calculaValorVentilacao();
	}

}
