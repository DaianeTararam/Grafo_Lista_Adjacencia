package model.estrutura.grafo;

import java.util.*;

public class GrafoLista<T> {
    // Este Map armazena cada nó como uma chave e suas conexões (vizinhos) como uma lista
    private Map<T, List<T>> mapa = new HashMap<>();

    // Método para adicionar um nó sem nenhuma aresta (conexão)
    // Exemplo: adicionar nó 'C'
    public void adicionarNo(T origem) {
        mapa.put(origem, new LinkedList<T>());
    }

    // Método para adicionar uma aresta (conexão) entre dois nós
    // Exemplo: adicionar aresta entre 'A' e 'C'
    public void adicionarAresta(T origem, T destino) {
        // Adiciona os nós caso não existam no grafo
        if (!mapa.containsKey(origem)) adicionarNo(origem);
        if (!mapa.containsKey(destino)) adicionarNo(destino);

        // Adiciona a conexão de origem para destino e vice-versa (grafo não-direcionado)
        mapa.get(origem).add(destino);
        mapa.get(destino).add(origem);
    }

    // Método para verificar se um nó existe no grafo
    public boolean temNo(T no) {
        return mapa.containsKey(no);
    }

    // Método para verificar se existe uma aresta entre dois nós
    public boolean temAresta(T origem, T destino) {
        return mapa.containsKey(origem) && mapa.get(origem).contains(destino);
    }

    // Método que retorna o número total de nós no grafo
    public int tamanho() {
        return mapa.keySet().size();
    }

    // Método para remover um nó e todas as arestas conectadas a ele
    public void removerNo(T no) {
        if (!mapa.containsKey(no)) {
        	System.out.println("O nó "+ no + " não existe!");
        	return;
        }
        
        // Remove as conexões com outros nós
        for (T vizinho : mapa.get(no)) {
            mapa.get(vizinho).remove(no);
        }

        // Remove o próprio nó do mapa
        mapa.remove(no);
        System.out.println("O nó "+ no + " foi removido.");
    }

    // Método para remover uma aresta (conexão) entre dois nós
    public void removerAresta(T origem, T destino) {
        if (!mapa.containsKey(origem) || !mapa.containsKey(destino)) return;
        mapa.get(origem).remove(destino);
        mapa.get(destino).remove(origem);
    }

    // Método que retorna uma String representando o grafo, com cada nó e suas conexões
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        // Percorre todos os nós no grafo
        for (T v : mapa.keySet()) {
            builder.append(v.toString() + ": ");
            // Para cada nó, adiciona as conexões (arestas)
            for (T w : mapa.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}


//Essa classe implementa a estrutura do grafo, utilizando um map
//O map é uma interface que representa uma coleção de pares chave-valor
