package main.java.list.OperacoesBasicas.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
            for (Tarefa tarefa : tarefaList) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(tarefa);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O nº total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O nº total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O nº total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
