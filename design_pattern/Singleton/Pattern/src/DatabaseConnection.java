import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() {
        try {
            // Exemplo de inicialização da conexão com o banco de dados
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "username";
            String password = "password";
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public ResultSet executeQuery(String sql) {
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static void main(String[] args) {
        DatabaseConnection database = DatabaseConnection.getInstance();
        ResultSet resultSet = database.executeQuery("SELECT * FROM mytable");

        try {
            while (resultSet.next()) {
                System.out.println("Column1: " + resultSet.getString("column1"));
                System.out.println("Column2: " + resultSet.getString("column2"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
