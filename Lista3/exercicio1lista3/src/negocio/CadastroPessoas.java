package negocio;
import dados.Pessoa;
import java.util.*;
public class CadastroPessoas {
	Map<Character, List<Pessoa>> cadastroPessoas = new HashMap<Character,List<Pessoa>>();
	
	public CadastroPessoas() {
		List<Pessoa> pessoas; 
		for(char i = 'A';i <'Z' ;i++ ) {
			pessoas = new LinkedList<Pessoa>(); 
			cadastroPessoas.put(i,pessoas);
		}
	}
	
	public void adicionarPessoas(Pessoa pessoa) {
		char[] primeiraLetra = pessoa.getNome().toCharArray();
		char letraUpper = Character.toUpperCase(primeiraLetra[0]);
		List<Pessoa> pessoaTemp = cadastroPessoas.get(letraUpper);
		if(pessoaCadastrada(pessoa)) {
			System.out.println("CPF ja cadastrado");
		}else {
			pessoaTemp.add(pessoa);
		}
	}
	public Map<String, List<Pessoa>> criarLista() {
		Map<String, List<Pessoa>> ordenacaoIdade = new LinkedHashMap<String, List<Pessoa>>();
		String str1 = "1 até 12: criança";
		String str2 = "13 até 18: adolescente";
		String str3 = "19 até 25: jovem";
		String str4 = "26 até 59: adulto";
		String str5 = "60 ou mais: idoso";	
		List<Pessoa> pessoas1 = new LinkedList<Pessoa>();
		ordenacaoIdade.put(str1, pessoas1);
		List<Pessoa> pessoas2 = new LinkedList<Pessoa>();
		ordenacaoIdade.put(str2, pessoas2);
		List<Pessoa> pessoas3 = new LinkedList<Pessoa>();
		ordenacaoIdade.put(str3, pessoas3);
		List<Pessoa> pessoas4 = new LinkedList<Pessoa>();
		ordenacaoIdade.put(str4, pessoas4);
		List<Pessoa> pessoas5 = new LinkedList<Pessoa>();
		ordenacaoIdade.put(str5, pessoas5);
		for(Map.Entry<Character, List<Pessoa>> pair : cadastroPessoas.entrySet()) {
			List<Pessoa> value = pair.getValue();
			for(Pessoa p : value) {
				if(p.getIdade()>=1 && p.getIdade()<=12) {
					List<Pessoa> temp = new LinkedList<Pessoa>();
					temp = ordenacaoIdade.get(str1);
					temp.add(p);
				}else if(p.getIdade()>=13 && p.getIdade()<=18) {
					List<Pessoa> temp = new LinkedList<Pessoa>();
					temp = ordenacaoIdade.get(str2);
					temp.add(p);
				}else if(p.getIdade()>=19 && p.getIdade()<=25) {
					List<Pessoa> temp = new LinkedList<Pessoa>();
					temp = ordenacaoIdade.get(str3);
					temp.add(p);
				}else if(p.getIdade()>=26 && p.getIdade()<=59) {
					List<Pessoa> temp = new LinkedList<Pessoa>();
					temp = ordenacaoIdade.get(str4);
					temp.add(p);
				}else if(p.getIdade()>=60) {
					List<Pessoa> temp = new LinkedList<Pessoa>();
					temp = ordenacaoIdade.get(str5);
					temp.add(p);
				}
			}	
		}
		return ordenacaoIdade;
	}
	
	private boolean pessoaCadastrada(Pessoa pessoa) {
		for(Map.Entry<Character, List<Pessoa>> pair : cadastroPessoas.entrySet() ) {
			List<Pessoa> value = pair.getValue();
			for(Pessoa p : value) {
				if(p.equals(pessoa)) {
					return true;
				}
			}
		}
		return false;
	}
}
