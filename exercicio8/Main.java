package exercicio8;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        Celular celular = new Celular(bateria);
        
        celular.enviarMensagem("Oi, meu nome é Rafael");
        celular.enviarMensagem("Qual o seu nome?");
        celular.enviarMensagem("Me responde...");
        celular.enviarMensagem("Já disse que meu nome é Rafael?");
        celular.enviarMensagem("Como você está?");
        celular.enviarMensagem("Porque você não me responde?");

        celular.efetuarLigacao(200);
    }
}
