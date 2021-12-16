package dados;
import exceptions.*;
public abstract class Arquivo {
	private String nome;
	private String extensao;
	
	public Arquivo(String nome) throws NomeInvalidoException {
		this.nome = nome;
		char[] nomeEmArray = nome.toCharArray();
		for(int i=0; i<nome.length();i++) {
			if(nomeEmArray[i] == '\n'){
				throw new NomeInvalidoException("Nome invalido, não deve haver quebra de linhas no nome");
			}
			if(nomeEmArray[i] == '(' || nomeEmArray[i] == ')' || nomeEmArray[i] == '['|| nomeEmArray[i] == ']') {
				throw new NomeInvalidoException("Nome invalido, não pode haver colchetes ou paranteses no nome");
			}
			if(nomeEmArray[i] == '\'' || nomeEmArray[i] == '\"') {
				throw new NomeInvalidoException("Nome invalido, não pode haver aspas simples ou duplas no nome");
			}
			
		}
		int tamanhoString = nome.length();
		if(tamanhoString < 10) {
			throw new NomeInvalidoException("Nome invalido, o nome deve possuir no minimo 10 caracteres");
		}
		if(tamanhoString > 256) {
			throw new NomeInvalidoException("Nome invalido, o nome deve possuir no maximo 256 caracteres");
		}

		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getExtensao() {
		return extensao;
	}
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
	

}
