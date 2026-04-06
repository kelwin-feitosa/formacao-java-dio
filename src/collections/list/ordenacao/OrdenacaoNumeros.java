package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
adicionarNumero(int numero): Adiciona um número à lista.
ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
*/
public class OrdenacaoNumeros {
    List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if(!numerosAscendentes.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
        if(!numerosDescendentes.isEmpty()) {
            Collections.sort(numerosDescendentes, Collections.reverseOrder());
            return numerosDescendentes;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
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
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}

