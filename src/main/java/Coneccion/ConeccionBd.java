package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConeccionBd {

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemadebusescomerciales",
                    "root",
                    "" 
            );
            return cn;
        } catch (Exception e) {
            System.out.println("ERROR A CONECTAR: " + e.getMessage());
            return null;
        }

    }
}
