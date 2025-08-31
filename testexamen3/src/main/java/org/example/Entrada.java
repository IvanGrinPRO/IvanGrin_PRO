package org.example;

import DBConnector.DBConnection;

public class Entrada {

    public static void main(String[] args) {


        DBConnection connection = new DBConnection();
        connection.realizarConecion();
    }
}