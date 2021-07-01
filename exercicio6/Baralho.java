package exercicio6;

public class Baralho {
    
    Carta[] cartas = new Carta[52];
    int numCartas = 0;

    void adicionarCarta (Carta carta){
        cartas[numCartas] = carta;
        numCartas++;
    }
    
    void imprimirBaralho (){
        System.out.println("Esse baralho tem as seguintes cartas:");
        for (int i = 0; i < 52; i++){
            System.out.println(cartas[i].valor + " de " + cartas[i].naipe);
        }
    }
}
