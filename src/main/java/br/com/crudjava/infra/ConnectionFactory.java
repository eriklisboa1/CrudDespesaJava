package br.com.crudjava.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private ConnectionFactory(){}// PARA EVITAR QUE ALGUEM CRIE UMA NOVA INSTACIA FORA DESSA CLASSE

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/DespesasDB","postgres","3125");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
