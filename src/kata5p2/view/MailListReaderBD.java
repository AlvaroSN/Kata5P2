package kata5p2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Mail;

 public class MailListReaderBD {
     
    private static Connection connect() {
        String url = "jdbc:sqlite:Kata5.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Conexion establecida");
        } catch( SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static List<String> read() throws SQLException {
        List<String> list = new ArrayList<>();
        String sql = "SELECT mail FROM emails";
        try(Connection conn = MailListReaderBD.connect();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql)) {
            
            while(rs.next()){
                list.add(rs.getString("Mail"));
                
            }
            
        }
        return list;
    }
}