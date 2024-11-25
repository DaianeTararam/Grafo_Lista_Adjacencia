# Grafo com Lista de Adjacência

Este projeto implementa um **grafo não direcionado** utilizando listas de adjacência. Ele oferece métodos para adicionar e remover arestas, bem como remover nós do grafo. O código é organizado de forma modular para manipulação do grafo.

## Estrutura do Projeto

O projeto contém uma classe principal para manipulação do grafo e uma estrutura que representa o grafo utilizando listas de adjacência. As operações de adicionar e remover arestas e nós são feitas através de métodos específicos.

### Classes

- **GrafoLista**: Representa o grafo utilizando listas de adjacência.
- **GrafoListaController**: Controlador para manipular o grafo.
- **Main**: Classe para testar e demonstrar a utilização do grafo.

---

## Funcionalidades

### 1. **Adicionar Aresta**
O método `adicionarAresta` permite adicionar uma aresta entre dois nós no grafo.

#### Código:
```java
public void adicionarAresta(T origem, T destino) {
    if (!mapa.containsKey(origem)) {
        mapa.put(origem, new LinkedList<T>());
    }
    if (!mapa.containsKey(destino)) {
        mapa.put(destino, new LinkedList<T>());
    }

    mapa.get(origem).add(destino);
    mapa.get(destino).add(origem);
}
```

### 2. **Remover Aresta**
O método removerAresta permite remover uma aresta entre dois nós do grafo.

#### Código:
```java
public void removerAresta(T origem, T destino) {
    if (!mapa.containsKey(origem) || !mapa.containsKey(destino)) return;
    
    mapa.get(origem).remove(destino);
    mapa.get(destino).remove(origem);
}
```
### 3. **Remover Nó**
O método removerNo remove um nó específico do grafo, juntamente com todas as arestas conectadas a ele.

#### Código:
```java
public void removerNo(T no) {
    if (!mapa.containsKey(no)) {
        System.out.println("O nó " + no + " não existe!");
        return;
    }

    // Remove as conexões com outros nós
    for (T vizinho : mapa.get(no)) {
        mapa.get(vizinho).remove(no);
    }

    // Remove o nó do mapa
    mapa.remove(no);
    System.out.println("O nó " + no + " foi removido.");
}
```

## Fluxo de Execução
**Adicionar Aresta:** Para adicionar uma aresta, o método adicionarAresta é chamado, que insere um novo nó nas listas de adjacência de ambos os nós fornecidos.

**Remover Aresta:** O método removerAresta é utilizado para remover a aresta entre dois nós. As listas de adjacência de ambos os nós são atualizadas removendo a referência um ao outro.

**Remover Nó:** O método removerNo é utilizado para remover um nó, além de excluir todas as arestas associadas a esse nó.

#### **Exemplo de Uso**
#### **Entrada:**
```java
GrafoLista<Integer> grafo = new GrafoLista<>();

// Adicionando arestas
grafo.adicionarAresta(0, 1);
grafo.adicionarAresta(0, 4);
grafo.adicionarAresta(1, 2);
grafo.adicionarAresta(1, 3);
grafo.adicionarAresta(1, 4);
grafo.adicionarAresta(2, 3);
grafo.adicionarAresta(3, 4);

// Removendo aresta
grafo.removerAresta(1, 4);

// Removendo nó
grafo.removerNo(3);
```
#### **Saída Esperada:**
```
Grafo original:
0: 1 4 
1: 0 2 3 4 
2: 1 3 
3: 1 2 4 
4: 0 1 3 

Grafo após remover a aresta entre 1 e 4:
0: 1 4 
1: 0 2 3 
2: 1 3 
3: 1 2 4 
4: 0 3 

Grafo após remover o nó 3:
0: 1 4 
1: 0 2 
2: 1 
4: 0
```

## Criadora

**Nome:** Daiane Tararam  
**Email:** daalkmim@gmail.com
🌐 **GitHub**: [Daiane Tararam](https://github.com/DaianeTararam)  


## Tecnologias Utilizadas

- **Java:** Linguagem de programação usada para o desenvolvimento das funcionalidades.
- **Eclipse:** IDE usada para o desenvolvimento do projeto.
- **Git e GitHub:** Ferramentas usadas para controle de versão e gerenciamento de código.
- **Sistema Operacional:** Windows 11*.
