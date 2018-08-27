
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Conexao{

    private Conexao(){ }
    private Connection conn = null;
    private static Conexao instance;

    public static synchronized Conexao getInstance(){
        if(instance == null){
            instance = new Conexao();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                instance.conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/banco","usuario","senha");
                
            } catch (SQLException e) {
                System.out.println(e);       
            }
        }
        return instance;
    }

    public Connection getConnection(){
        return this.conn;
    }
}