package DTO;

import DBConnector.DBConnection;
import DBConnector.SchemDB;

import javax.xml.validation.Schema;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TasksDTO {


    private final Connection connection;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public TasksDTO() {
        connection = DBConnection.getConnection();
    }


    public void showingDates() {
        try {
            String query = "SELECT * FROM " + SchemDB.TAB_DB + ";";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println();
                int id = resultSet.getInt(SchemDB.COL_ID);
                String title = resultSet.getString(SchemDB.COL_TITLE);
                String description = resultSet.getString(SchemDB.COL_DESC);
                Date due_date = resultSet.getDate(SchemDB.COL_DATE);
                Time created_at_time = resultSet.getTime(SchemDB.COL_CREA);
                boolean is_completed = resultSet.getBoolean(SchemDB.COL_COMP);
                Date created_at = resultSet.getDate(SchemDB.COL_CREA);


                System.out.printf("Id: %d,\nTitle: %s,\nDescription: %s,\nTime to complete: %tF,\nis completed: %b,\nCreated at: %tF %tT\n",
                        id, title, description, due_date, is_completed, created_at, created_at_time);
            }


        } catch (SQLException e) {
            System.out.println("Error in show dates");
            e.printStackTrace(); // Кращий спосіб виводу помилок(хз)
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                System.out.println();
            } catch (SQLException e) {
                System.out.println("Error in closing resources");
                e.printStackTrace();
            }
//            DBConnection.closeConnection();
//            System.out.println("Ok!");
        }
    }


    public void makeTask(String title, String desc, String date) {
// INSERT INTO tasks (title,description,due_date,created_at)
        //VALUES (VARCHAR(100),TEXT,DATE,TIMESTAMP);
        try {
            LocalDateTime dateObj = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formatedDate = dateObj.format(formatter);
            if (!connection.isClosed()) {
                String query = "INSERT INTO " + SchemDB.TAB_DB + "(" + SchemDB.COL_TITLE + "," + SchemDB.COL_DESC +
                        "," + SchemDB.COL_DATE + "," + SchemDB.COL_CREA + ")" + "VALUES (?, ?, ?, ?);";

                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, title);
                preparedStatement.setString(2, desc);
                preparedStatement.setString(3, date);
                preparedStatement.setString(4, formatedDate);
                preparedStatement.execute();

            }
        } catch (SQLException e) {
            System.out.println("Error in creating task");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                System.out.println("Ok!");
            } catch (SQLException e) {
                System.out.println("Error in close data base");
                System.out.println(e.getMessage());
            }
        }


    }

    public void deleteTask(int id) {
        boolean b = false;
        try {
            b = verfId(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if ( b != false) {
            System.out.println("Id exist!");
            try {
                String query = "DELETE FROM " + SchemDB.TAB_DB + " WHERE " + SchemDB.COL_ID + " = ?";

                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.execute();
                System.out.println("Deleting...");
            } catch (SQLException e) {
                System.out.println("Error in deleting task");
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (preparedStatement != null) preparedStatement.close();
                    System.out.println("Delete succes");
                    System.out.println();
                } catch (SQLException e) {
                    System.out.println("Error in closing data");
                    System.out.println(e.getMessage());
                }
            }
        }else {
            System.out.println("Id not exist\n");
        }
    }

    public void showingUncompletedTasks() {
        try {
            String query = "SELECT * FROM " + SchemDB.TAB_DB + " WHERE " + SchemDB.COL_COMP + " = 0";
            // SELECT * FROM tasks WHERE is_completed = 0;
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println();
                int id = resultSet.getInt(SchemDB.COL_ID);
                String title = resultSet.getString(SchemDB.COL_TITLE);
                String description = resultSet.getString(SchemDB.COL_DESC);
                Date due_date = resultSet.getDate(SchemDB.COL_DATE);
                Time created_at_time = resultSet.getTime(SchemDB.COL_CREA);
                boolean is_completed = resultSet.getBoolean(SchemDB.COL_COMP);
                Date created_at = resultSet.getDate(SchemDB.COL_CREA);


                System.out.printf("Id: %d,\nTitle: %s,\nDescription: %s,\nTime to complete: %tF,\nis completed: %b,\nCreated at: %tF %tT\n",
                        id, title, description, due_date, is_completed, created_at, created_at_time);
            }


        } catch (SQLException e) {
            System.out.println("Error in show dates");
            e.printStackTrace(); // Кращий спосіб виводу помилок(хз)
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                System.out.println();
            } catch (SQLException e) {
                System.out.println("Error in closing resources");
                e.printStackTrace();
            }
//            DBConnection.closeConnection();
//            System.out.println("Ok!");
        }

    }

    public void changeComplete(int id){

        try {
            //UPDATE tasks SET is_completed = 1 WHERE id = ?
            String query = "UPDATE " + SchemDB.TAB_DB + " SET " + SchemDB.COL_COMP + " = 1 WHERE " + SchemDB.COL_ID + " = ?;";

//            String query1 = "SELECT " + SchemDB.COL_COMP + " FROM " + SchemDB.TAB_DB + " WHERE " + SchemDB.COL_ID + " = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Error in updating data");
            System.out.println(e.getMessage());
        }

    }

    public void verfComp(int id){

        try {
            // SELECT is_completed FROM tasks WHERE id = ?;
            String query = "SELECT " + SchemDB.COL_COMP + " FROM " + SchemDB.TAB_DB + " WHERE " + SchemDB.COL_ID + " = ?;";


//            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            resultSet = preparedStatement.executeQuery();


            if (resultSet.next()){
                boolean is_completed = resultSet.getBoolean(SchemDB.COL_COMP);

                if (!is_completed){
                    System.out.println("Changing task...");
                    changeComplete(id);
                }else {
                    System.out.printf("Task with id:%d is already completed",id);
                }
            }else {
                System.out.printf("Task with id:%d not found",id);
            }

        } catch (SQLException e) {
            System.out.println("Error in checking boolean");
            System.out.println(e.getMessage());
        }finally {
            try {
                System.out.println("Task is changed!");
                if (preparedStatement != null) preparedStatement.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException e) {
                System.out.println("Error in closing resourses");
                System.out.println(e.getMessage());
            }
        }

    }

    public boolean verfId(int id) throws SQLException {
        String query = "SELECT EXISTS(SELECT 1 FROM " + SchemDB.TAB_DB +
                " WHERE " + SchemDB.COL_ID + " = ?)";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getBoolean(1); // Отримуємо результат EXISTS
                }
                return false;
            }
        }
    }


}
