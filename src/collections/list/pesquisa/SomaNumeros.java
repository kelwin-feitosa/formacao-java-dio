package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;
/*
adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
*/
public class SomaNumeros {
    List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                soma += n;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        if (!numeros.isEmpty()) {
            int maior = numeros.get(0);

            for (Integer n : numeros) {
                if (n > maior) {
                    maior = n;
                }
            }

            return maior;

        } else {
            throw new RuntimeException("Não posso buscar o maior em uma lista vazia!");
        }
    }

    public int encontrarMenorNumero() {
        if (!numeros.isEmpty()) {
            int menor = numeros.get(0);

            for (Integer n : numeros) {
                if (n < menor) {
                    menor = n;
                }
            }

            return menor;

        } else {
            throw new RuntimeException("Não posso buscar o menor em uma lista vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
