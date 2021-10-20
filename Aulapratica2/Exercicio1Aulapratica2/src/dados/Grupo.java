package dados;

public class Grupo {
    private Pessoa[] pessoas;
    private int numeroPessoas = 0;

    public int getNumeroPessoas(){
        return numeroPessoas;
    }
    
    public Grupo(int tam){
        pessoas = new Pessoa[tam];

    }
    public void setPessoa(Pessoa p){
        if(this.numeroPessoas < pessoas.length){
            pessoas[numeroPessoas] = p;
            numeroPessoas++;
        }else{
            System.out.println("Não foi possivel adicionar a pessoa, pois o grupo está cheio");
        }
    }
    public Pessoa[] getPessoas(){
        return pessoas;
    }
    public void ordena(){
        for(int i = 0; i < this.numeroPessoas ; i++){
            for(int j = 0; j < this.numeroPessoas ; j++){
                if (this.pessoas[j].calculaImc() > this.pessoas[i].calculaImc()){
                    Pessoa aux = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = aux;
                }
            }
        }
    }
    
}
