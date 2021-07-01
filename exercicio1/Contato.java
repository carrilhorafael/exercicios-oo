package exercicio1;
class Contato {
    String nome;
    String numero;

    Contato (String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    void imprimirContato(){
        System.out.print("Nome: " + nome);
        System.out.println(" / Numero: " + numero);
    }
}
