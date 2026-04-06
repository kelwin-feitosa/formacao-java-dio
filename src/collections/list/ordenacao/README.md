# ⚖️ Módulo: Ordenação em List

Este diretório contém exercícios focados em organizar elementos dentro de uma `List` utilizando diferentes critérios e ferramentas da linguagem Java.

## 🛠️ Atividades Desenvolvidas

### 1. Ordenação de Pessoas
Neste desafio, trabalhamos com objetos complexos (`Pessoa`) que possuem múltiplos atributos: **nome**, **idade** e **altura**.
- **Ordenação por Idade:** Implementada como a "Ordem Natural" da classe através da interface `Comparable`.
- **Ordenação por Altura:** Implementada como uma "Ordem Personalizada" através de uma classe `Comparator` específica.

### 2. Ordenação de Números
Prática de manipulação de listas de inteiros utilizando a classe utilitária do Java.
- **Ordem Ascendente:** Uso do método padrão `Collections.sort()`.
- **Ordem Descendente:** Uso do `Collections.sort()` combinado com `Collections.reverseOrder()`.

---

## 🧠 Conceitos de Ordenação Praticados:

- **Interface `Comparable`:** Utilizada para definir a regra de comparação padrão (natural) dentro da própria classe do objeto.
- **Interface `Comparator`:** Utilizada para criar regras de ordenação externas e flexíveis, sem modificar a classe original.
- **Imutabilidade e Segurança:** Implementação da técnica de **Cópia de Lista** (`new ArrayList<>(listaOriginal)`). Isso permite que a lista original mantenha a ordem de inserção, enquanto as funções de ordenação retornam novas listas organizadas.
- **Classe `Collections`:** Uso de métodos estáticos para algoritmos de ordenação eficientes.

---