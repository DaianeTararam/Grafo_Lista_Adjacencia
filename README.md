# Grafo com Lista de Adjacência

Este projeto implementa um **grafo não direcionado** utilizando listas de adjacência. Ele permite adicionar e remover arestas, bem como remover nós do grafo. O código é organizado de forma a demonstrar os métodos principais para manipulação de grafos.

## Estrutura do Projeto

O projeto é organizado em uma classe principal para manipulação de grafos e uma estrutura de grafo usando listas de adjacência.

---

## Funcionalidades

### 1. **Adicionar Aresta**
O método `adicionarAresta` permite adicionar uma conexão (aresta) entre dois nós. 

### 2. **Remover Aresta**
O método `removerAresta` remove a aresta entre dois nós no grafo. O código garante que a remoção seja feita em ambas as direções, já que o grafo é **não direcionado**.

#### Código:
```java
public void removerAresta(T origem, T destino) {
    if (!mapa.containsKey(origem) || !mapa.containsKey(destino)) return;
    
    mapa.get(origem).remove(destino);
    mapa.get(destino).remove(origem);
}
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
