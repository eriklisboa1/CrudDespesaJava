package br.com.crudjava;

import br.com.crudjava.dao.DespesaDAO;
import br.com.crudjava.model.Despesa;
import br.com.crudjava.model.Categoria;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.util.Scanner;

public class InserirDespesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();

        System.out.println("Qual descricao para o gasto?");
        String descricao = scanner.nextLine();
        despesa.setDescricao(descricao);

        System.out.println("Qual valor?");
        double valor = scanner.nextDouble();
        despesa.setValor(valor);

        System.out.println("Escreva a categoria qual se encaixa\nalimentacao\neducacao\nsaude\ntransporte\ninvestimento\nmoradia\noutros");
        String op = scanner.next();
        switch (op){
            case "alimetacao":
                despesa.setCategoria(Categoria.ALIMENTACAO);
                break;
            case "educacao":
                despesa.setCategoria(Categoria.EDUCACAO);
                break;
            case "saude":
                despesa.setCategoria(Categoria.SAUDE);
                break;
            case "transporte":
                despesa.setCategoria(Categoria.TRANSPORTE);
                break;
            case "moradia":
                despesa.setCategoria(Categoria.MORADIA);
                break;
            case "investimento":
                despesa.setCategoria(Categoria.INVESTIMENTO);
                break;
            case "outros":
                despesa.setCategoria(Categoria.OUTROS);
                break;
            default:
                despesa.setCategoria(Categoria.OUTROS);
                break;
        }

        LocalDate data = LocalDate.now();
        despesa.setData(data);

        dao.save(despesa);

    }
}
