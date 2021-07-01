package exercicio6;

public class Main {
    static char[] valores = new char[]{'A', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K'}; 
    static String[] naipes = new String[]{"Ouros", "Copas", "Paus", "Espadas"};

    public static void main(String[] args){
        Baralho baralho = new Baralho();
        for (String naipe : naipes){
            for (char valor : valores){
                Carta carta = new Carta(naipe, valor);
                baralho.adicionarCarta(carta);
            }
        }
        baralho.imprimirBaralho();
    }
}
