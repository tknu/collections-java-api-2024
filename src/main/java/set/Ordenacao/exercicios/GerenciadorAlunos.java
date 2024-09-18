package main.java.set.Ordenacao.exercicios;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // Atributos
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if(!alunoSet.isEmpty()) {
            for (Aluno aluno: alunoSet) {
                if(aluno.getMatricula() == matricula) {
                    alunoParaRemover = aluno;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("Conjunto Vazio");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()) {
            return alunosPorNome;
        } else {
            throw new RuntimeException("Conjunto Vazio");
        }
    }

    public Set<Aluno> exibirAlunosPorNota () {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;
        } else {
            throw new RuntimeException("Conjunto Vazio");
        }
    }

    public Set<Aluno> exibirAlunosPorMatricula() {
        Set<Aluno> alunosPorMatricula = new TreeSet<>(new ComparatorPorMatricula());
        if(!alunoSet.isEmpty()) {
            alunosPorMatricula.addAll(alunoSet);
            return alunosPorMatricula;
        } else {
            throw new RuntimeException("Conjunto Vazio");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos
        gerenciadorAlunos.adicionarAluno("Juliana", 2L, 10d);
        gerenciadorAlunos.adicionarAluno("Ryu", 3L, 7d);
        gerenciadorAlunos.adicionarAluno("Laura", 4L, 8.5d);
        gerenciadorAlunos.adicionarAluno("Carlos", 5L, 4d);
        gerenciadorAlunos.adicionarAluno("Thiago", 1L, 9d);

        // Exibir todos os alunos
        System.out.println(gerenciadorAlunos.alunoSet);

        // Removendo um aluno pela matricula
        gerenciadorAlunos.removerAluno(5L);
        System.out.println(gerenciadorAlunos.alunoSet);

        // Exibindo alunos por nome
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Exibindo alunos por nota
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
