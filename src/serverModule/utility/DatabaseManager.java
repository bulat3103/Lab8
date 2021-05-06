package serverModule.utility;

import java.io.Console;
import java.sql.*;
import java.util.Scanner;

public class DatabaseManager {
    public static final String MARINE_TABLE = "space_marine";
    public static final String USER_TABLE = "my_user";
    public static final String COORDINATES_TABLE = "coordinates";
    public static final String CHAPTER_TABLE = "chapter";

    public static final String MARINE_TABLE_ID_COLUMN = "id";
    public static final String MARINE_TABLE_KEY_COLUMN = "key";
    public static final String MARINE_TABLE_NAME_COLUMN = "name";
    public static final String MARINE_TABLE_COORDINATES_ID_COLUMN = "coordinates_id";
    public static final String MARINE_TABLE_CREATION_DATE_COLUMN = "creation_date";
    public static final String MARINE_TABLE_HEALTH_COLUMN = "health";
    public static final String MARINE_TABLE_HEART_COUNT_COLUMN = "heart_count";
    public static final String MARINE_TABLE_ACHIEVEMENTS_COLUMN = "achievements";
    public static final String MARINE_TABLE_WEAPON_TYPE_COLUMN = "weapon_type";
    public static final String MARINE_TABLE_CHAPTER_ID_COLUMN = "chapter_id";
    public static final String MARINE_TABLE_USER_ID_COLUMN = "user_id";

    public static final String USER_TABLE_ID_COLUMN = "id";
    public static final String USER_TABLE_USERNAME_COLUMN = "username";
    public static final String USER_TABLE_PASSWORD_COLUMN = "password";
    public static final String USER_TABLE_ONLINE_COLUMN = "online";
    public static final String USER_TABLE_COLOR_COLUMN = "color";

    public static final String CHAPTER_TABLE_ID_COLUMN = "id";
    public static final String CHAPTER_TABLE_NAME_COLUMN = "name";
    public static final String CHAPTER_TABLE_PARENT_LEGION_COLUMN = "parent_legion";

    public static final String COORDINATES_TABLE_ID_COLUMN = "id";
    public static final String COORDINATES_TABLE_X_COLUMN = "x";
    public static final String COORDINATES_TABLE_Y_COLUMN = "y";

    private final String JDBC_DRIVER = "org.postgresql.Driver";

    private final String url = "jdbc:postgresql://localhost:19999/studs";
    private String user;
    private String password;
    private Connection connection;

    public DatabaseManager() {
        doConnectionToDatabase();
    }

    private void doConnectionToDatabase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Подключение к базе данных...");
        while (true) {
            System.out.println("Введите логин:");
            this.user = scanner.nextLine();
            System.out.println("Введите пароль:");
            this.password = scanner.nextLine();
            try {
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Соединение с базой данных установлено!");
                break;
            } catch (SQLException e) {
                System.out.println("Произошла ошибка при подключении к базе данных!");
                System.out.println("Проверьте правильность ввода логина и пароля!");
            } catch (ClassNotFoundException e) {
                System.out.println("Драйвер управления базой данных не найден!");
                System.exit(0);
            }
        }
    }

    public PreparedStatement doPreparedStatement(String sqlStatement, boolean generateKeys) throws SQLException {
        PreparedStatement preparedStatement;
        try {
            if (connection == null) throw new SQLException();
            int autoGeneratedKeys = generateKeys ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS;
            preparedStatement = connection.prepareStatement(sqlStatement, autoGeneratedKeys);
            return preparedStatement;
        } catch (SQLException e) {
            if (connection == null) {
                System.out.println("Соединение с базой данных не установлено!");
            }
            throw new SQLException();
        }
    }

    public void closePreparedStatement(PreparedStatement preparedStatement) {
        if (preparedStatement == null) return;
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Не удалось закрыть SQL-запрос");
        }
    }

    public void closeConnection() {
        if (connection == null) return;
        try {
            connection.close();
            System.out.println("Соединение с базой данных разорвано!");
        } catch (SQLException e) {
            System.out.println("Произошла ошибка при разрыве соединения с базой данных!");
        }
    }

    public void setCommit() {
        try {
            if (connection == null) throw new SQLException();
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Произошла ошибка при установлении 'commit'!");
        }
    }

    public void setAutoCommit() {
        try {
            if (connection == null) throw new SQLException();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            System.out.println("Произошла ошибка при установлении 'auto_commit'!");
        }
    }

    public void commit() {
        try {
            if (connection == null) throw new SQLException();
            connection.commit();
        } catch (SQLException e) {
            System.out.println("Произошла ошибка при подтверждении нового состояния базы данных!");
        }
    }

    public void rollback() {
        try {
            if (connection == null) throw new SQLException();
            connection.rollback();
        } catch (SQLException e) {
            System.out.println("Произошла ошибка при возврате исходного состояния базы данных!");
        }
    }

    public void setSavepoint() {
        try {
            if (connection == null) throw new SQLException();
            connection.setSavepoint();
        } catch (SQLException e) {
            System.out.println("Произошла ошибка при сохранении состояния базы данных!");
        }
    }
}
