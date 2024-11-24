package controller;

import model.estrutura.grafo.GrafoLista;

public class GrafoListaController {
    public GrafoListaController() {
        super();
    }

    public String teste() throws Exception {
        GrafoLista<Integer> g = new GrafoLista<Integer>();
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 4);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(1, 3);
        g.adicionarAresta(1, 4);
        g.adicionarAresta(2, 3);
        g.adicionarAresta(3, 4);

        System.out.println("Grafo original:\n" + g);

        // Remover uma aresta
        g.removerAresta(1, 4);
        System.out.println("Grafo após remover a aresta entre 1 e 4:\n" + g);

        // Remover um nó
        g.removerNo(3);
        System.out.println("Grafo após remover o nó 3:\n" + g);

        return g.toString();
    }
}


//Este método controla o grafo e executa todas as operações de teste
//Como a adição de aresta entre nós
