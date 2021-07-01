package exercicio4;
class Main{
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.pintarCasa("Vermelho");

        Porta portaDaSala = new Porta();
        portaDaSala.pintarPorta("Preto");
        Porta portaDaCozinha = new Porta();
        portaDaCozinha.pintarPorta("Vermelho");
        Porta portaDoQuarto = new Porta();
        portaDoQuarto.pintarPorta("Vermelho");
        
        portaDaSala.abrirPorta();
        portaDaCozinha.fecharPorta();
        portaDoQuarto.abrirPorta();

        System.out.println(casa.quantasPortasAbertas());

    }
}
