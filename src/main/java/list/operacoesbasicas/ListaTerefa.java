package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTerefa {
    private final List<Tarefa> tarefaList;

    public ListaTerefa() {
        this.tarefaList = new ArrayList<>();
    }

    public static void main(String[] args) {
        ListaTerefa listaTerefa = new ListaTerefa();

        listaTerefa.adicionarTarefa("Tarefa1");


        System.out.println("Num elementos Lista: " + listaTerefa.numeroTotalTarefa());
        listaTerefa.obterDescricoesTarefa();

    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int numeroTotalTarefa() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefa() {
        System.out.println(tarefaList);
    }
}
