package exercicio1;
class Agenda {
    int numContatos = 0;
    Contato dono;
    Contato[] contatos = new Contato[100];

    void adicionarContato (Contato contato){
        boolean novoContato = true;
        for (int i = 0; i < numContatos; i++){
            if (contato.equals(contatos[i])){
                novoContato = false;
            }
        }
        if (novoContato){
            contatos[numContatos] = contato;
            numContatos++;
            System.out.println("Contato " + contato.nome + " adicionado");
        }else{
            System.out.println("O contato " + contato.nome + " já existe");
        }
    }

    void imprimirAgenda (){
        System.out.println("O usuário " + dono.nome + " tem os seguintes contatos adicionados: ");
        for(int i = 0; i < numContatos; i++){
            contatos[i].imprimirContato();
        }
    }

    

}
