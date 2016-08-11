package basedato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.System.err;

public class BaseDatos {
    private static Connection con;

    public void conectar(String ser, String usu, String pas, String nom){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        //con = DriverManager.getConnection("jdbc:mysql://192.168.56.2/test", "pepito", "pepito")
       con = DriverManager.getConnection("jdbc:mysql://"+ser+"/"+nom, usu, pas);
          System.out.println("Conexion exitosa");
    }catch (ClassNotFoundException e){
          System.err.println("No encuentra conector MySQL");
      //e.printStackTrace();
      }catch (SQLException e) {
          System.err.println("Conexion fallida");
          //e.printStackTrace();
      }
    }
        public void cerrar(){
        try{
            con.close();
            System.out.println("Conexion cerrada");
        }catch (SQLException e){
            err.println("Error al cerrar conexion");
        }
        }
    public void obtener(){
        String consulta = "SELECT email FROM user";
        Statement st = null;
        try {
            st = con.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(consulta);
            while(resultSet.next()){
                System.out.println("E-mail: "+ resultSet.getString("email"));
            }
        }catch (SQLException e){
            err.println("Vaya. No funciono");
            //e.printStackTrace();
        }
    }
  }