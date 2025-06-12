package com.pluralsight.db;
// inserting into a database
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataManager {
    // create attributes and constructor
    private DataSource dataSource;

    // constructor
    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    // methods to insert into sakila database
    // making query and prepared statement

    public void insertIntoDirect(String country) {
        try (Connection connection = dataSource.getConnection(); // add connection
             PreparedStatement preparedStatement = connection.prepareStatement(
                     // writing query inserting country to a list
                     "INSERT into country (country) VALUES (?)")) {
            //  set prepared statement also replace ? with user entry
            preparedStatement.setString(1, country);

            int rows = preparedStatement.executeUpdate(); //this runs query and insert country
            System.out.println("rows inserted" + rows);
            // int rows shows how many rows were inserted

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    // new method for generated keys

    public void insertWihGeneratedKeys(String country) {
        try (Connection connection = dataSource.getConnection(); // add connection
             PreparedStatement preparedStatement = connection.prepareStatement(
                     // writing query inserting country to a list
                     "INSERT into country (country) VALUES (?)", PreparedStatement.RETURN_GENERATED_KEYS))
                     // returns  generated id
        {
            //  set prepared statement also replace ? with user entry
            preparedStatement.setString(1, country);

            int rows = preparedStatement.executeUpdate(); //this runs query and insert country
            // using execute update instead of query
            System.out.println("rows inserted" + rows);
            // int rows shows how many rows were inserted

            try (ResultSet keys = preparedStatement.getGeneratedKeys()) {
                // while loop if u have multiple keys only
                while (keys.next()) {
                    System.out.println("new key was added " + keys.getInt(1));
                    // message shows keys
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void updateRecord(String newDescription, int fimnID){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE film SET description = ? WHERE film_id = ?")) {
            preparedStatement.setString(1,newDescription);
            preparedStatement.setInt(2,fimnID);

            int rows = preparedStatement.executeUpdate();
            // shows number of rows updated
            System.out.println("rows updated" + rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // delete method
    public void deleteRecord(String countryName){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM country where country = ?")) {
            preparedStatement.setString(1,countryName);


            int rows = preparedStatement.executeUpdate();
            // shows number of rows updated

            System.out.println("rows deleted" + rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    }

