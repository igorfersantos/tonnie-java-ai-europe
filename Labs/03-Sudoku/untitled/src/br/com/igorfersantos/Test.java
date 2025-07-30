package br.com.igorfersantos;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o número de tarefas
        int n = Integer.parseInt(sc.nextLine());

        // TODO: Crie uma lista para armazenar as tarefas como pares (nome, prioridade):
        Map<Tarefa, Integer> tarefas = new TreeMap<>((t1,t2) -> Integer.compare(t1.prioridade, t2.prioridade));

        // TODO: Leia cada linha, separada por nome e prioridade e adiciona à lista:
        for (int i = 0; i <= n-1; i++) {
            String[] line = sc.nextLine().split(",");
            Tarefa tarefa = new Tarefa(line[0], Integer.parseInt(line[1].trim()));
            tarefas.put(tarefa, tarefa.prioridade);
        }

        // TODO: Ordene a lista pela prioridade crescente:


        // Imprime a lista ordenada no formato "tarefa - prioridade":
        for (Tarefa t : tarefas.keySet()) {
            System.out.println(t.nome + " - " + t.prioridade);
        }

        sc.close();
    }

    // Classe auxiliar para armazenar nome e prioridade:
    static class Tarefa {
        String nome;
        int prioridade;

        public Tarefa(String nome, int prioridade) {
            this.nome = nome;
            this.prioridade = prioridade;
        }
    }
}