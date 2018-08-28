package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnection() throws SQLException {
        //Given

        //When
        DbManager dbManager = DbManager.getInstance();

        //Then
        Assert.assertNotNull(dbManager.getConnection());

    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
            rs.getString("FIRSTNAME") + ", " +
            rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();

        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUserAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "select U.FIRSTNAME, U.LASTNAME, count(*) as TASKQUANTITY from ISSUES I, USERS U " +
                "where I.USER_ID_ASSIGNEDTO = U.ID " +
                "group by U.ID " +
                "having count(*) > 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(
            rs.getString("U.FIRSTNAME") + ", " +
            rs.getString("U.LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();

        Assert.assertEquals(5, counter);
    }
}
