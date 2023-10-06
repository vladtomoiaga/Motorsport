package org.example;

import java.sql.Connection;
import java.util.Scanner;

public class DataSourceName {
    public static String DB_NAME = dataBaseName();
    public static final String URL_DATABASE = "jdbc:postgresql://localhost:5432/";
    public static final String URL = "jdbc:postgresql://localhost:5432/" + DB_NAME.toLowerCase();
    public static final String USER = "postgres";
    public static final String PASSWORD = "password";
    public static final String COLUMN_FIRST_NAME = "first_name";
    public static final String COLUMN_LAST_NAME = "last_name";
    public static final String COLUMN_TEAM = "team";
    public static String COLUMN_POINTS = "points";


    /** Define the database name*/
    public static String dataBaseName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data base name:");
        String dataBaseName = scanner.nextLine().replaceAll(" ", "_");
        scanner.close();
        return dataBaseName;
    }
}
