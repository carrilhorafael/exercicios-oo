package exercicio1;

class Main {
    public static void main (String[] args) {
        // Criar contato Rafael (dono da agenda)
        Contato rafael = new Contato();
        rafael.nome = "Rafael";
        rafael.numero = "21999999999";
        
        // Criar contato Debora (entrará na agenda)
        Contato debora = new Contato();
        debora.nome = "Débora";
        debora.numero = "21999999999";
        
        // Criar contato Ricardo (entrará na agenda)
        Contato ricardo = new Contato();
        ricardo.nome = "Ricardo";
        ricardo.numero = "21999999999";
        
        // Criar contato Jorge (não entrará na agenda)
        Contato jorge = new Contato();
        jorge.nome = "Jorge";
        jorge.numero = "21999999999";
        
        // Criar contato Paula (não entrará na agenda)
        Contato paula = new Contato();
        paula.nome = "Paula";
        paula.numero = "21999999999";
        
        // Criar agenda para o Rafael
        Agenda agendaRafael = new Agenda();
        agendaRafael.dono = rafael;

        // Adiciona Debora
        agendaRafael.adicionarContato(debora);
        
        // Adiciona Ricardo
        agendaRafael.adicionarContato(ricardo);

        // Tenta adicionar Debora novamente
        agendaRafael.adicionarContato(debora);

        agendaRafael.imprimirAgenda();
    } 
    
}