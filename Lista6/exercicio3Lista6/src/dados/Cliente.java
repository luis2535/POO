package dados;

import java.util.LinkedList;
import java.util.List;

public class Cliente implements Observador {

	private List<String> mensagens = new LinkedList<String>();
	
	public void atualizar(Object objeto) {
		mensagens.add((String) objeto);
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		int i = 0;
		for(String a : mensagens) {
			i++;
			string.append(i+" - "+a+"\n");
		}
		return string.toString();
	}
}
