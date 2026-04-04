package collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

/*
adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
 */

public class ListaTarefas {
    private List<Tarefa> tarefaLista;

    public ListaTarefas() {
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        if(!tarefaLista.isEmpty()) {
            for(Tarefa t : tarefaLista) {
                if(t.getDescricao().equalsIgnoreCase(descricao))
                    tarefasParaRemover.add(t);
            }

            tarefaLista.removeAll(tarefasParaRemover);
        } 
        else {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaLista.size();
    }

    public void obterDescricoesTarefas() {
        if(!tarefaLista.isEmpty()) {
            System.out.println(tarefaLista);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Trabalhar");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Estudar para o exame");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }
}
