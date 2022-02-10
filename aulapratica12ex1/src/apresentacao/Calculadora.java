package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	public static void main(String[] args) {
		Calculadora frame = new Calculadora();
		frame.setVisible(true);
	}
	
	private JPanel painel = new JPanel();
	private JPanel painelEntrada = new JPanel();
	JLabel infoCaixaTexto = new JLabel("Digite um valor:");
	private JTextField caixaTexto = new JTextField();
	private JButton botaoAdicionar = new JButton("adicionar");
	private JButton botaoLimpar = new JButton("limpar");
	private JScrollPane painelScrollTabelaResultados = new JScrollPane();
	private JTable tabelaResultados;
	private TabelaResultados resultados = new TabelaResultados();
	private JScrollPane paineScrollTabelaValores = new JScrollPane();
	private JTable tabelaValores;
	private TabelaValores valores = new TabelaValores();
	
	private JPanel painel2 = new JPanel();
	JLabel infoCaixaTexto2 = new JLabel("Gerar Valores:");
	private JTextField caixaTexto2 = new JTextField();
	private JButton botaoNaturais = new JButton("naturais");
	private JButton botaoPrimos = new JButton("primos");
	private JButton botaoFibonacci = new JButton("fibonacci");
	
	
	
	
	public Calculadora() {
		setTitle("Calculadora Estatistica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 300);
		setContentPane(painel);
		painel.setLayout(null);
		painelEntrada.setBounds(15, 80, 280, 173);
		painelEntrada.setLayout(null);
		painel.add(painelEntrada);
		infoCaixaTexto.setBounds(30, 30, 200, 15);
		painelEntrada.add(infoCaixaTexto);
		caixaTexto.setBounds(30, 50, 200, 20);
		painelEntrada.add(caixaTexto);
		botaoAdicionar.setBounds(77, 94, 117, 25);
		painelEntrada.add(botaoAdicionar);
		botaoLimpar.setBounds(77, 136, 117, 25);
		painelEntrada.add(botaoLimpar);
		painelScrollTabelaResultados.setBounds(10,10,880,50);
		painel.add(painelScrollTabelaResultados);
		tabelaResultados = new JTable(resultados);
		painelScrollTabelaResultados.setViewportView(tabelaResultados);
		paineScrollTabelaValores.setBounds(307, 80, 173, 173);
		painel.add(paineScrollTabelaValores);
		tabelaValores = new JTable(valores);
		paineScrollTabelaValores.setViewportView(tabelaValores);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valores.adicionaValor(Integer.parseInt(caixaTexto.getText()));
				resultados.atualizar();
				caixaTexto.setText("");	
			}
		});
		botaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valores.limpar();
				resultados.atualizar();
			}
		});
		
		painel2.setBounds(300, 80, 800, 173);
		painel2.setLayout(null);
		infoCaixaTexto2.setBounds(300, 20, 200, 15);
		painel.add(painel2);
		painel2.add(infoCaixaTexto2);
		caixaTexto2.setBounds(300, 45, 200, 20);
		painel2.add(caixaTexto2);
		botaoNaturais.setBounds(350, 70, 117, 25);
		painel2.add(botaoNaturais);
		botaoPrimos.setBounds(350, 105, 117, 25);
		painel2.add(botaoPrimos);
		botaoFibonacci.setBounds(350, 140, 117, 25);
		painel2.add(botaoFibonacci);
		botaoNaturais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(caixaTexto2.getText());
				for(int i = 1; i <= n; i++) {
					valores.adicionaValor(i);
					resultados.atualizar();
				}
				caixaTexto2.setText("");	
			}
		});
		botaoPrimos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(caixaTexto2.getText());
				int quant = 0;
				int num = 2;
				do {
					int cont = 0;
					for(int i = 1; i <= num; i++) {
						if(num%i == 0) {
							cont++;
						}
					}
					if(cont == 2) {
						valores.adicionaValor(num);
						resultados.atualizar();
						quant++;
					}
					num++;
				}while(quant<n);
				caixaTexto2.setText("");	
			}
		});
		botaoFibonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(caixaTexto2.getText());
				int f0 = 1;
				int aux;
				int f1 = 1;
				for(int i=0;i<n;i++) {
					if(i==0) {
						valores.adicionaValor(f0);
						resultados.atualizar();
					}else if(i==1) {
						valores.adicionaValor(f1);
						resultados.atualizar();
					}else {
						aux = f1;
						f1 = f1+f0;
						f0 = aux;
						valores.adicionaValor(f1);
						resultados.atualizar();
					}
				}
				caixaTexto2.setText("");	
			}
		});
		
		
	}
	
	

}
