package dados;
import java.util.*;
import exceptions.*;

public class SistemaProcessos {
	private List<Juiz> juizes = new LinkedList<Juiz>();
	private List<Processo> processos = new LinkedList<Processo>();
	
	public void cadastrarProcessos(Processo processo) {
		processos.add(processo);
	}
	public void cadastrarJuiz(Juiz juiz) {
		juizes.add(juiz);
	}
	public void distribuirProcessos() throws PilhaCheiaException, ProcessoSemJuizException {
		int numJuizes = juizes.size();
		int numProcessos = processos.size();
		if(numJuizes!= 0 && numProcessos!=0) {
			if(numProcessos == 1) {
				Juiz j = juizes.get(0);
				j.cadastrarProcesso(processos.get(0));
			}else {
				numJuizes--;
				int indexJuiz = 0;
				Random rnd = new Random();
				List<Processo> lista = processos;
				while(numProcessos!=0) {
					int index = rnd.nextInt(numProcessos);
					Processo p = lista.get(index);
					Juiz j = juizes.get(indexJuiz);
					if(j.getLimite()>j.getTamanho()) {
						j.cadastrarProcesso(p);
						if(indexJuiz == numJuizes) {
							indexJuiz = 0;
						}else {
							indexJuiz ++;
						}
						lista.remove(index);
					}else {
						int indexAtual = indexJuiz;
						if(indexJuiz == numJuizes) {
							indexJuiz = 0;
						}else {
							indexJuiz ++;
						}
						int status = 0;
						while(indexAtual !=indexJuiz) {
							j = juizes.get(indexJuiz);
							if(j.getLimite()>j.getTamanho()) {
								j.cadastrarProcesso(p);
								if(indexJuiz == numJuizes) {
									indexJuiz = 0;
								}else {
									indexJuiz ++;
								}
								status = 1;
								lista.remove(index);
								break;
							}
							else {
								if(indexJuiz == numJuizes) {
									indexJuiz = 0;
								}else {
									indexJuiz ++;
								}
								}
							}
						if (status == 0) {
							throw new ProcessoSemJuizException("A Pilha de todos os juizes esta cheia, há processos sem juiz");
						}
					}
					numProcessos--;
					
				}
			}
		}
	}
	public List<Juiz> retornarLista(){
		return juizes;
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		for(Juiz j : juizes) {
			string.append(j+"\n");
		}
		return string.toString();
	}
}
