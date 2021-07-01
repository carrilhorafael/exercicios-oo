package exercicio3;


class Main {
    public static void main(String[] args) {
        Porta porta = new Porta();

        
        porta.abrirPorta();
        porta.fecharPorta();
        porta.modificarDimensoes(2.4, 0.7);
        porta.modificarDimensoes(2.7, 0.9);
        
        porta.pintarPorta("Azul");
        porta.pintarPorta("Amarelo");
        porta.pintarPorta("Vermelho");
        porta.pintarPorta("Verde");

        if (porta.estaAberta())
            System.out.println("A porta está aberta");
        else
            System.out.println("A porta está fechada");

    }
}
