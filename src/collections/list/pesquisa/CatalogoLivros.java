package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

/*
adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
 */
public class CatalogoLivros {
    List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livros.isEmpty()) {
            for(Livro l : livros) {
                if(l.getAutor().equalsIgnoreCase(autor))
                    livrosPorAutor.add(l);
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroIntervaloAnos = new ArrayList<>();

        if(!livros.isEmpty()) {
            for(Livro l : livros) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    livroIntervaloAnos.add(l);
            }
        }

        return livroIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo =  null;

        if(!livros.isEmpty()) {
            for(Livro l : livros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        else {
            System.out.println("Não tem nenhum livro com esse titulo!");
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
