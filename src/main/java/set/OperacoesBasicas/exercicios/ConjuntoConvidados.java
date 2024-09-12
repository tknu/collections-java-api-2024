package main.java.set.OperacoesBasicas.exercicios;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if(!convidadoSet.isEmpty()) {
            for( Convidado remover: convidadoSet) {
                if(remover.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = remover;
                    break;
                }
            }
            convidadoSet.remove((convidadoParaRemover));
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1237);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() +
                " dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() +
                " dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
