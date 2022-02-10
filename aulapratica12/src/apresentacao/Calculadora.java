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
	}
	
	

}
