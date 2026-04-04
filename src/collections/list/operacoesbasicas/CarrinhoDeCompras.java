package collections.list.operacoesbasicas;

import java.util.List;

import java.util.ArrayList;

/*
adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
removerItem(String nome): Remove um item do carrinho com base no seu nome.
calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
*/
public class CarrinhoDeCompras {
    List<Item> itemList = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        if(!itemList.isEmpty()) {
            for(Item t : itemList) {
                if(t.getNome().equalsIgnoreCase(nome))
                    itensParaRemover.add(t);
            }
            itemList.removeAll(itensParaRemover);
        }
        else {
            System.out.println("A lista está vazia!");
        }       
    }

    public double calcularValorTotal() {
        double valorTotal = 0d; //Indica que é decimal, poderia ser 0.0

        if(!itemList.isEmpty()) {
            for(Item t : itemList) {
                double valorItem = t.getQuantidade() * t.getPreco();
                valorTotal += valorItem;
            }

            return valorTotal;
        }
        else {
            return valorTotal;
        }
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
