package persistencia;
import java.util.*;
import java.io.*;

public class EditorTexto {
	public List<String> leTexto(String caminho){
		List<String> dados = new LinkedList<String>();
		FileReader arq;
		BufferedReader lerArq;
		try {
			arq = new FileReader(caminho);
			lerArq = new BufferedReader(arq);
			String s = lerArq.readLine();
			while(s!=null) {
				dados.add(s);
				s = lerArq.readLine();
			}
			arq.close();
		}catch(Exception e) {
			System.err.println("Erro ao manipular o arquivo");
			System.exit(0);
		}
		return dados;
		
	}
	public void gravaTexto(String caminho, List<String>dados) {
		FileWriter arq;
		try {
			arq = new FileWriter(caminho);
			for(int i = 0; i< dados.size();i++) {
				arq.write(dados.get(i) +"\n");
			}
			arq.close();
		}catch(Exception e) {
			System.out.println("Erro ao manipular o arquivo");
			System.exit(0);
		}
		
	}

}
