
package Coneccion;
import java.sql.Connection;

public class probar {
 
    public static void main(String[] args) {
        Connection cn = ConeccionBd.conectar();
        if (cn != null) {
            System.out.println("✅ Conexión exitosa");
        } else {
            System.out.println("❌ Falló la conexión");
        }
    }
}

