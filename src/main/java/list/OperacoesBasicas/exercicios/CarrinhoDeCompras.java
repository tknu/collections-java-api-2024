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
        }
    }
}
