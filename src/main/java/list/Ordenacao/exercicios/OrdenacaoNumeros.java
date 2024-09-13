package main.java.list.Ordenacao.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente () {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendentes() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()) {
            numerosAscendentes.sort(Collections.reverseOrder());
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if(!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenaçãoNumeros
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        // Adiciona números à lista
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(99);

        // Exibir a lista de números adicionados
        ordenacaoNumeros.exibirNumeros();

        // Ordenar e exibir em ordem ascendente
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        //Exibindo a lista
        ordenacaoNumeros.exibirNumeros();

        // Ordena e exibe em ordem descencente
        System.out.println(ordenacaoNumeros.ordenarDescendentes());
    }
}
