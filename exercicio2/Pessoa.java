package exercicio2;

class Pessoa {
    int idade;
    String nome;

    void fazerAniversario(){
        idade++;
    }

    void falarIdade(){
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos");
    }
}
