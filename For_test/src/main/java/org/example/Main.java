package org.example;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        // Задать параметры подключения к базе данных
        final String DB_URL = "jdbc:postgresql://localhost:5432/IT_school_customer";
        final String USER = "postgres";
        final String PASSWORD = "1234";

        // Создать соединение с базой данных
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

        // Выполнить запрос к базе данных
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");

        // Обработать результаты запроса
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }

        // Закрыть соединение с базой данных
        connection.close();
    }
}
