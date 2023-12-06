import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {

    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=biblioteca";
    private static final String USUARIO = "ITALOL\\italo";
    private static final String SENHA = "";

    public static Connection obterConexao() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado!");
            e.printStackTrace();
            throw new SQLException("Driver JDBC não encontrado!", e);
        }
    }
}
