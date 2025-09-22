package com.aula;

import com.aula.classe.FilaEncadeada;
import com.aula.classe.Jogos;
import com.aula.classe.ListaEncadeadaSimples;
import com.aula.iClasse.Fila;

public class Main {

    public static void main(String[] args) {
        // novos objetos instanciados
        Jogos jogo1 = new Jogos(1, "Valorant", "FPS");
        Jogos jogo2 = new Jogos(2, "CSGO", "FPS");
        Jogos jogo3 = new Jogos(3, "Minecraft", "Aventura");
        Jogos jogo4 = new Jogos(4, "Outlast", "Terror");

        // inserir na lista
        ListaEncadeadaSimples<Jogos> lista = new ListaEncadeadaSimples<>();
        lista.inserirInicio(jogo1);
        lista.inserirInicio(jogo2);
        lista.inserirInicio(jogo3);
        lista.inserirInicio(jogo4);

        // remover elemento do fim
        lista.removerFim();

        // buscar pelo ID e imprimir (exemplo: posição 1)
        System.out.println("Busca na lista (posição 1): " + lista.get(1));

        // imprimir lista inteira
        System.out.println("Lista de Jogos:");
        lista.printLista();  // assumindo que seu printLista já percorre e dá System.out.println

        // inserir na fila
        Fila<Jogos> fila = new FilaEncadeada<>();
        fila.enfileirar(jogo1);
        fila.enfileirar(jogo2);
        fila.enfileirar(jogo3);
        fila.enfileirar(jogo4);

        // remover elemento da fila
        fila.desenfileirar();

        // buscar pelo primeiro da fila e imprimir
        System.out.println("Primeiro da fila: " + fila.primeiro());

        // tempo de execução
        Long elapsedTime = System.nanoTime();
        System.out.println("Tempo gasto para as execuções no sistema foi de " + elapsedTime + " Nano segundos!");
    }
}
