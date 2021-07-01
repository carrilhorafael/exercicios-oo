package exercicio4;

public class Casa {
    String cor;
    Porta[] portas = new Porta[100];
    int numPortas = 0;

    void pintarCasa (String novaCor){
        cor = novaCor;
    }

    void adicionarPorta (Porta porta){
        portas[numPortas] = porta;
        numPortas++;
    }

    int quantasPortasAbertas (){
        int portasAbertas = 0;
        for (int i = 0; i < numPortas; i++ ){
            if (portas[i].estaAberta())
                portasAbertas++;
        }
        return portasAbertas;
    }
}
