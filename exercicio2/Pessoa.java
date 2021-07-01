package exercicio2;

class Pessoa {
    int idade;
    String nome;

    Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void fazerAniversario(){
        idade++;
    }

    void falarIdade(){
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos");
    }
}
