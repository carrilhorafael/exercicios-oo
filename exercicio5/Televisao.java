package exercicio5;

class Televisao {
    int canal;
    int volume = 0;
    boolean modoSilencioso = false;
    boolean ligada = false;

    void ligar(){
        ligada = true;
        System.out.println("Televisão ligada");
    }
    void desligar(){
        ligada = false;
        System.out.println("Televisão desligada");
        
    }
    void aumentarVolume(){
        volume++;
        System.out.println("A televisão agora está com volume " + volume);

    }
    void diminuirVolume(){
        volume--;
        System.out.println("A televisão agora está com volume " + volume);
    }
    void mudarProximoCanal(){
        if(canal < 100){
            canal++;
            System.out.println("A televisão agora está no canal " + canal);
        }
    }
    void mudarCanalAnterior(){
        if(canal > 0){
            canal--;
            System.out.println("A televisão agora está no canal " + canal);
        }
    }
    void mudarCanalEspecifico(int novoCanal){
        if (novoCanal < 100 && novoCanal > 0){
            canal = novoCanal;
            System.out.println("A televisão agora está no canal " + canal);            
        }
    }
    
    void silenciar(){
        modoSilencioso = true;
        System.out.println("Televisão em modo silencioso");
        
    }
    void desmutar(){
        modoSilencioso = false;
        System.out.println("Televisão desmutada");
    }

    void imprimirEstado(){

        System.out.println("------------------- SAÍDA -------------------");
        System.out.println("A televisão atualmente está com os seguintes estados:");
        if (ligada)
            System.out.println("Ligada");
        else
            System.out.println("Desligada");
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        if (modoSilencioso){
            System.out.println("MUTE");
        }
        
    }


}
