package br.com.crudjava;

import br.com.crudjava.dao.DespesaDAO;
import br.com.crudjava.model.Categoria;
import br.com.crudjava.model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesa {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> despesaOptional = dao.findById(4L);

        Despesa despesa = despesaOptional.get();
        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

//        despesa.setDescricao("Gasto com dentista");
//        despesa.setData(LocalDate.of(2021,6,25));
//        despesa.setValor(100);
//        despesa.setCategoria(Categoria.SAUDE);
//
//        dao.update(despesa);



    }
}
