package exercicio7;

public class Pedido {
    public enum MetodoPagamento {
        CARTAO, CHEQUE, DINHEIRO
    }

    String cliente;
    Item[] itens = new Item[100];
    int numItens = 0;
    MetodoPagamento pagamento;

    Pedido (String cliente){
        this.cliente = cliente;
    }

    void adicionarItem (Produto produto, int quantidade){
        if (produto.estoque >= quantidade){
            boolean novoItem = true;
            for (int i = 0; i < numItens; i++){
                if (itens[i].produto.equals(produto)){
                    novoItem = false;
                    itens[i].quantidade = itens[i].quantidade + quantidade;
                }
            }
            if (novoItem){
                Item item = new Item(produto, quantidade);
                itens[numItens] = item;
                numItens++;
            }
            produto.estoque = produto.estoque - quantidade;
        }
    }

    void executarPagamento (MetodoPagamento pagamento){
        this.pagamento = pagamento; 
    }

    float subTotal (){
        float subtotal = 0;
        for (int i = 0; i < numItens; i++){
            subtotal = subtotal + itens[i].produto.preco;
        }
        return subtotal;
    }

    void imprimeCarrinho (){
        System.out.println("------------------------- CARRINHO -------------------------");
        System.out.println("Items: ");
        for (int i = 0; i < numItens; i++){
            System.out.println(itens[i].produto.nome + "| Quantidade: " + itens[i].quantidade + "| Preço Individual: " + itens[i].produto.preco);
        }
        System.out.println("Preço total: " + subTotal());
        System.out.println("Metodo de pagamento: " + pagamento);
    }
}
