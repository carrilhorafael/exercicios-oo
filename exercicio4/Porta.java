package exercicio4;

class Porta {
    boolean aberta;
    String cor;

    boolean estaAberta(){
        return aberta;
    }

    void abrirPorta(){
        aberta = true;
    }

    void fecharPorta(){
        aberta = false;
    }
    void pintarPorta(String novaCor){
        cor = novaCor;
    }
}
