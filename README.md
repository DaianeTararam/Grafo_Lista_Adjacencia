# Grafo Lista em Java

Este projeto implementa um **Grafo** utilizando **listas de adjacência** em Java, permitindo a manipulação de nós e arestas. O projeto segue o padrão **MVC (Model-View-Controller)** para separar as responsabilidades de controle, visualização e dados.

---

## Estrutura do Projeto

O projeto é organizado em três pacotes principais:

1. **`view`**: Contém a classe principal, responsável por executar o programa.
2. **`controller`**: Controla as operações no grafo, manipulando as ações de adicionar/remover arestas.
3. **`model.estrutura.grafo`**: Contém a implementação do grafo usando listas de adjacência.

---

## Classes e Métodos

### 1. **`view.GrafoPrincipal`**

Classe principal que executa o programa.

- **Função principal `main`**:
  - Instancia o controlador do grafo (`GrafoListaController`).
  - Exemplo de execução:
    ```java
    try {
        String resultado = controller.teste();
        System.out.println("O resultado do grafo é: " + resultado);
    } catch (Exception e) {
        e.printStackTrace();
    }
    ```
  - **Uso do try-catch**:
    - Lida com possíveis erros durante a execução do programa, exibindo-os no console.

---

### 2. **`controller.GrafoListaController`**

Controla as operações realizadas no grafo.

- **Método `teste`**:
  - Cria um grafo e adiciona algumas arestas.
  - Exemplo de uso:
    ```java
    GrafoLista<Integer> g = new GrafoLista<Integer>();
    g.adicionarAresta(0, 1);
    g.adicionarAresta(1, 2);
    g.adicionarAresta(3, 4);
    return g.toString();
    ```
  - **Objetivo**:
    - Testa a funcionalidade de adição de arestas e impressão do grafo.

---

### 3. **`model.estrutura.grafo.GrafoLista`**

Classe principal que define a estrutura do grafo usando listas de adjacência.

#### Atributos:
- `Map<Integer, List<Integer>> adjacencia`: Representa o grafo com listas de adjacência, onde cada chave é um nó e o valor é uma lista dos nós adjacentes.

#### Métodos principais:
- **`adicionarAresta(int origem, int destino)`**:
  - Adiciona uma aresta entre dois nós.
  - Se os nós não existirem, eles são criados.
  - Exemplo:
    ```java
    adjacencia.computeIfAbsent(origem, k -> new ArrayList<>()).add(destino);
    adjacencia.computeIfAbsent(destino, k -> new ArrayList<>()).add(origem);
    ```

- **`removerAresta(int origem, int destino)`**:
  - Remove a aresta entre dois nós.
  - Verifica se os nós existem antes de tentar remover a aresta.
  - Exemplo:
    ```java
    if (adjacencia.containsKey(origem)) {
        adjacencia.get(origem).remove(Integer.valueOf(destino));
    }
    if (adjacencia.containsKey(destino)) {
        adjacencia.get(destino).remove(Integer.valueOf(origem));
    }
    ```

- **`toString()`**:
  - Exibe o grafo no formato de listas de adjacência.
  - Exemplo:
    ```java
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, List<Integer>> entry : adjacencia.entrySet()) {
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
    ```

---

### 4. **`model.estrutura.grafo.No`**

Representa os nós do grafo.

#### Atributos:
- `int valor`: Representa o valor armazenado no nó.

#### Métodos principais:
- **Construtor**:
  - Inicializa o nó com um valor inteiro.
  
---

## Fluxo de Execução

1. **Adição de Arestas**:
   - São criadas arestas entre nós, permitindo que o grafo se construa dinamicamente.
   
2. **Remoção de Arestas**:
   - Permite remover conexões entre os nós, alterando a estrutura do grafo.

3. **Exibição do Grafo**:
   - O grafo é impresso com suas listas de adjacência, mostrando quais nós estão conectados.

---

## Exemplo de Uso

### Entrada:
```java
GrafoLista<Integer> g = new GrafoLista<>();
g.adicionarAresta(0, 1);
g.adicionarAresta(1, 2);
g.adicionarAresta(3, 4);
System.out.println(g.toString());
g.removerAresta(1, 2);
System.out.println(g.toString());
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
