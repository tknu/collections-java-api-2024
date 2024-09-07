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
        // Criando uma instancia da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        //Exibindo o nº total de tarefas na lista
        System.out.println("O total de tarefas é " + listaTarefa.obterNumeroTotalTarefas());

        //Exibindo as decrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();

        //removendo uma tarefa da lista
        listaTarefa.removerTarefa("Estudar para o exame");

        // Exibindo o total de tarefas após a remoção
        System.out.println("Agora o total de tarefas é de " + listaTarefa.obterNumeroTotalTarefas());

        // Exibindo as descrições das tarefas atualizadas
        listaTarefa.obterDescricoesTarefas();
    }
}
