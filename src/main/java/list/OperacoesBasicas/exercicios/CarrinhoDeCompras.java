package main.java.list.OperacoesBasicas.exercicios;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Atributo
    private List<Item> itemList;

    public CarrinhoDeCompras() {this.itemList = new ArrayList<>();}

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!this.itemList.isEmpty()) {
            for (Item item : itemList) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public int calcularTotalItens() {
        int itemTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item: itemList) {
                int quantidadeItem = item.getQuantidade();
                itemTotal += quantidadeItem;
            }
            return itemTotal;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(itemList);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instancia da classe CarrinhoDeCompra
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens à lista
        carrinhoDeCompras.adicionarItem("Leite", 5.5d, 3);
        carrinhoDeCompras.adicionarItem("Carne", 32.5d, 5);
        carrinhoDeCompras.adicionarItem("Frango", 18.9d, 2);

        //Exibindo os itens do carrinho
        carrinhoDeCompras.exibirItens();

        //Remove um item do carrinho
        carrinhoDeCompras.removerItem("Frango");

        // Exibir lista atualizada dos itens do carrinho
        carrinhoDeCompras.exibirItens();

        // Exibe o valor total do carrinho
        System.out.println("Total de itens: " + carrinhoDeCompras.calcularTotalItens());
        System.out.println("Valor Total: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
