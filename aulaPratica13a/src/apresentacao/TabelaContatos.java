package apresentacao;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import dados.Contato;
import exceptions.ContatoJaCadastradoException;
import exceptions.ContatoNaoCadastradoException;
import exceptions.DeleteException;
import exceptions.InsertException;
import exceptions.SelectException;
import negocio.ListaTelefonica;

public class TabelaContatos extends AbstractTableModel {
	private String[] colunas = {"Nome","Telefone"};
	private ListaTelefonica lista = ListaTelefonica.getInstance();
	
	public String getColumnName(int column) {
		return colunas[column];
	}
	@Override
	public int getRowCount() {
		int tamanho=0;
		for(char i = 'A'; i< 'Z'; i++) {
			try {
				tamanho+=lista.buscarContatos(i).size();
			} catch (SelectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return tamanho;
	}

	@Override
	public int getColumnCount() {		
		return colunas.length;
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		List<Contato> listaContato = new LinkedList<Contato>();
		for(char i = 'A'; i< 'Z'; i++) {
			try {
				for(Contato c : lista.buscarContatos(i)) {
					listaContato.add(c);
				}
			} catch (SelectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(listaContato.size()!=0) {
			switch(coluna) {
			case 0:
				return listaContato.get(linha).getNome();
			case 1:
				return listaContato.get(linha).getTelefone();
			}
		}else {
			return ("-");
		}
		return null;
		
	}
	public void adicionaContato(Contato contato) throws ContatoJaCadastradoException, InsertException, SelectException {
		lista.adicionarContato(contato);
		fireTableStructureChanged();	
	}
	public void removerContato(Contato contato) throws ContatoNaoCadastradoException, DeleteException {
		lista.removerContato(contato);
		fireTableStructureChanged();
	}
	

}
