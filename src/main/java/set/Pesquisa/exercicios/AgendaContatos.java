package main.java.set.Pesquisa.exercicios;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()) {
            for(Contato contato: contatoSet) {
                if(contato.getNome().startsWith(nome)) {
                    contatosPorNome.add(contato);
                }
            }
            return contatosPorNome;
        } else {
            throw new RuntimeException("Conjunto Vazio");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if(!contatoSet.isEmpty()) {
            for(Contato contato: contatoSet) {
                if(contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(novoNumero);
                    contatoAtualizado = contato;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // exibindo contatos do conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos na agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        //Exibindo contato da agenda
        agendaContatos.exibirContatos();

        // Pesquisando contato pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // Atualizando numero de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 987321654);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibir contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização");
        agendaContatos.exibirContatos();
    }

}
