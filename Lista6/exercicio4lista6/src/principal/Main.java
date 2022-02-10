package principal;

import dados.CorLataria;
import dados.PotenciaMotor;
import dados.TipoVentilacao;
import negocio.Veiculo;

public class Main {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo(40000,CorLataria.VERMELHO,PotenciaMotor.MOTOR20,TipoVentilacao.AR_CONDICIONADO);
		System.out.println("Valor veiculo 1: R$"+v1.calculaTotal());
		
		Veiculo v2 = new Veiculo(40000,CorLataria.BRANCO,PotenciaMotor.MOTOR10,TipoVentilacao.NATURAL);
		System.out.println("\n\nValor veiculo 2: R$"+v2.calculaTotal());
		
		Veiculo v3 = new Veiculo(40000,CorLataria.PRATA,PotenciaMotor.MOTOR14,TipoVentilacao.NATURAL);
		System.out.println("\n\nValor veiculo 3: R$"+v3.calculaTotal());
		
		Veiculo v4 = new Veiculo(40000,CorLataria.PRETO,PotenciaMotor.MOTOR18,TipoVentilacao.AR_CONDICIONADO);
		System.out.println("\n\nValor veiculo 4: R$"+v4.calculaTotal());
		
		Veiculo v5 = new Veiculo();
		v5.setValorInicial(40000);
		v5.setCorLataria(CorLataria.AZUL);
		v5.setPotenciaMotor(PotenciaMotor.MOTOR12);
		v5.setTipoVentilacao(TipoVentilacao.AR_CONDICIONADO);
		System.out.println("\n\nValor veiculo 5: R$"+v5.calculaTotal());
	}

}
