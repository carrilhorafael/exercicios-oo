package exercicio7;

import exercicio7.Pedido.MetodoPagamento;

public class Main {
    public static void main(String[] args) {
        Produto laranja = new Produto("Laranja", 3, 150);
        Produto pera = new Produto("Pera", 4, 320);
        Produto banana = new Produto("Banana", 2, 15);        
        Produto uva = new Produto("Uva", 1, 40);

        Pedido pedidoRafael = new Pedido("Rafael");

        pedidoRafael.adicionarItem(pera, 30);
        pedidoRafael.adicionarItem(pera, 30);
        pedidoRafael.adicionarItem(banana, 10);
        pedidoRafael.adicionarItem(laranja, 10);

        pedidoRafael.executarPagamento(MetodoPagamento.CARTAO);

        pedidoRafael.imprimeCarrinho();
    }
}
