package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import dados.Contato;
import exceptions.ContatoJaCadastradoException;
import exceptions.ContatoNaoCadastradoException;
import exceptions.DeleteException;
import exceptions.InsertException;
import exceptions.SelectException;

public class Apresentacao extends JFrame {
	public static void main(String[] args) {
		Apresentacao frame = new Apresentacao();
		frame.setVisible(true);
	}

	private JPanel painel = new JPanel();
	private JPanel painelEntrada = new JPanel();
	JLabel infoCaixaTexto = new JLabel("Escreva um Nome e Telefone:");
	private JTextField caixaNome = new JTextField();
	private JTextField caixaTelefone = new JTextField();
	private JButton botaoAdicionar = new JButton("adicionar");
	private JButton botaoRemover = new JButton("remover");
	private JScrollPane painelScrollTabelaContatos = new JScrollPane();
	private JTable tabelaContatos;
	private TabelaContatos contatos = new TabelaContatos();
	
	
	public Apresentacao() {
		setTitle("Lista de Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 300);
		setContentPane(painel);
		painel.setLayout(null);
		painelEntrada.setBounds(15,30,280,173);
		painelEntrada.setLayout(null);
		painel.add(painelEntrada);
		painel.add(painelEntrada);
		infoCaixaTexto.setBounds(30, 0, 200, 15);
		painelEntrada.add(infoCaixaTexto);
		caixaNome.setBounds(30, 20, 100, 20);
		painelEntrada.add(caixaNome);
		caixaTelefone.setBounds(140, 20, 100, 20);
		painelEntrada.add(caixaTelefone);
		botaoAdicionar.setBounds(77, 64, 117, 25);
		painelEntrada.add(botaoAdicionar);
		botaoRemover.setBounds(77,104,117,25);
		painelEntrada.add(botaoRemover);
		painelScrollTabelaContatos.setBounds(307,10,200,200);
		painel.add(painelScrollTabelaContatos);
		tabelaContatos = new JTable(contatos);
		painelScrollTabelaContatos.setViewportView(tabelaContatos);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {Contato contato = new Contato();
				contato.setNome(caixaNome.getText());
				contato.setTelefone(Integer.parseInt(caixaTelefone.getText()));
				contatos.adicionaContato(contato);
				caixaNome.setText("");
				caixaTelefone.setText("");
					
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Digite algum valor!","Erro ao inserir valor", JOptionPane.ERROR_MESSAGE);
				}catch (ContatoJaCadastradoException e1) {
					JOptionPane.showMessageDialog(null,e1.getMessage(),"Usuario ja cadastrado!",JOptionPane.ERROR_MESSAGE);
				} catch (InsertException e1) {
					JOptionPane.showMessageDialog(null,e1.getMessage(),"InsertException",JOptionPane.ERROR_MESSAGE);
				} catch (SelectException e1) {
					JOptionPane.showMessageDialog(null,e1.getMessage(),"SelectException",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		botaoRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contato contato = new Contato();
					contato.setNome(caixaNome.getText());
					contato.setTelefone(Integer.parseInt(caixaTelefone.getText()));
					contatos.removerContato(contato);
					caixaNome.setText("");
					caixaTelefone.setText("");
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Digite algum valor!","Erro ao inserir valor", JOptionPane.ERROR_MESSAGE);
				} catch (ContatoNaoCadastradoException e1) {
					JOptionPane.showMessageDialog(null,e1.getMessage(),"Esse contato não existe!",JOptionPane.ERROR_MESSAGE);

				} catch (DeleteException e1) {
					JOptionPane.showMessageDialog(null,e1.getMessage(),"DeleteException",JOptionPane.ERROR_MESSAGE);
				}					
			}
		});
	}
}
