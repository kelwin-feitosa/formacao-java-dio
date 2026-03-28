# 🏦 Desafio: Simulação de Conta Bancária via Terminal

Este projeto integra o módulo de **Sintaxe Java** da trilha básica da DIO. O objetivo é exercitar a captura de dados, manipulação de variáveis e a saída formatada de informações.

## 🎯 Objetivo do Desafio
Desenvolver uma aplicação que receba dados de uma conta bancária (Agência, Número, Nome e Saldo) via terminal e retorne uma mensagem de confirmação formatada.

## 🚀 Implementação Técnica
* **Entrada de Dados:** Utilização da classe `Scanner` para interatividade.
* **Formatadores:** Implementação de `Locale.US` para garantir a entrada de valores decimais (`double`) com ponto, evitando conflitos de regionalização.
* **Saída Dinâmica:** Uso de `printf` e concatenação de `Strings` para gerar a mensagem final personalizada:
  > *"Olá [Nome], obrigado por criar uma conta em nosso banco, sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque."*

## 🛠️ Tecnologias Utilizadas
* Java 17+
* Scanner API / Locale