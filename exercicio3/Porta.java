package exercicio3;

class Porta {
    boolean aberta;
    String cor;
    double altura;
    double largura;


    boolean estaAberta(){
        return aberta;
    }

    void pintarPorta(String novaCor){
        cor = novaCor;
    }

    void abrirPorta(){
        aberta = true;
    }

    void fecharPorta(){
        aberta = false;
    }

    void modificarDimensoes(double novaAltura, double novaLargura){
        altura = novaAltura;
        largura = novaLargura;
    }
    
}
