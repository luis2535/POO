package dados;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float massa;

    public Pessoa(){

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getMassa(){
        return massa;
    }
    public void setMassa(float massa){
        this.massa = massa;
    }
    public float calculaImc(){
        return this.massa / (this.altura * this.altura);
    }
    public String toString(){
        return "Nome: "+nome+"\nAltura: "+altura+"\nIdade: "+idade+"\nMassa: "+massa+"\nIMC: "+calculaImc();
    }
}
