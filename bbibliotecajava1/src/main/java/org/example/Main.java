package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "Editora X", 1954, "Sinopse...");
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", "Editora Y", 1997, "Sinopse...");

        // Criando alguns usuários
        Usuario usuario1 = new Usuario("João", "Rua ABC, 123", "joao@email.com", "123456789");
        Usuario usuario2 = new Usuario("Maria", "Rua XYZ, 456", "maria@email.com", "987654321");

        // Criando uma data de empréstimo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEmprestimo;
        try {
            dataEmprestimo = sdf.parse("01/01/2023");
        } catch (ParseException e) {
            dataEmprestimo = new Date(); // Em caso de erro, usa a data atual
            e.printStackTrace();
        }

        // Criando empréstimos
        Emprestimo emprestimo1 = new Emprestimo(usuario1, livro1, dataEmprestimo, null);
        Emprestimo emprestimo2 = new Emprestimo(usuario2, livro2, dataEmprestimo, null);

        // Adicionando empréstimos ao histórico dos usuários
        usuario1.adicionarEmprestimo(emprestimo1);
        usuario2.adicionarEmprestimo(emprestimo2);

        // Acessando informações dos empréstimos
        System.out.println("Livro emprestado por " + usuario1.getNome() + ": " + emprestimo1.getLivro().getTitulo());
        System.out.println("Data do empréstimo por " + usuario1.getNome() + ": " + sdf.format(emprestimo1.getDataEmprestimo()));
        System.out.println("Livro emprestado por " + usuario2.getNome() + ": " + emprestimo2.getLivro().getTitulo());
        System.out.println("Data do empréstimo por " + usuario2.getNome() + ": " + sdf.format(emprestimo2.getDataEmprestimo()));

        // Exemplo de devolução de um livro
        Date dataDevolucao;
        try {
            dataDevolucao = sdf.parse("10/01/2023");
        } catch (ParseException e) {
            dataDevolucao = new Date(); // Em caso de erro, usa a data atual
            e.printStackTrace();
        }
        emprestimo1.setDataDevolucaoEfetiva(dataDevolucao);
        emprestimo1.setDevolvido(true);

        // Acessando informações após devolução do livro
        System.out.println("Livro devolvido por " + usuario1.getNome() + ": " + emprestimo1.getLivro().getTitulo());
        System.out.println("Data de devolução por " + usuario1.getNome() + ": " + sdf.format(emprestimo1.getDataDevolucaoEfetiva()));
        System.out.println("Status do empréstimo por " + usuario1.getNome() + ": " + (emprestimo1.isDevolvido() ? "Devolvido" : "Pendente"));
    }
}