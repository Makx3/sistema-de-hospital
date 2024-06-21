package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            if (connection != null) {
                System.out.println("Conexión a la base de datos establecida exitosamente.");
            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos.");
            }
            DatabaseConnection.closeConnection();
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
