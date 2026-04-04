# 🔢 Desafio: Controle de Fluxo e Exceções Customizadas

Projeto desenvolvido para consolidar o conhecimento sobre estruturas de repetição e, principalmente, o **tratamento de exceções de negócio**.

## 🎯 Cenário Proposto
O sistema recebe dois números inteiros via terminal. O programa deve realizar uma contagem (interação `for`) baseada na diferença entre esses números. 

**Regra de Ouro:** Se o primeiro parâmetro for maior que o segundo, o sistema deve impedir a execução e lançar uma exceção personalizada.

## 🚀 Diferenciais do Meu Projeto
* **Hierarquia de Exceções:** Criação da classe `ParametrosInvalidosException` herdando de `Exception`, garantindo que o erro de lógica seja tratado explicitamente pelo compilador (*checked exception*).
* **Validação de Negócio:** Método `contar()` encapsula a lógica de validação, mantendo o método `main` limpo e focado na interação com o utilizador.
* **Sinalização de Erro:** Uso de `System.err` para imprimir a mensagem de erro, seguindo o padrão de saída de erros do sistema.

## 🛠️ Tecnologias Utilizadas
* Java 17+
* Custom Exception Handling