package com.ivoronline.springboot_jdbc_update.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private DataSource dataSource;

  //=========================================================================================================
  // UPDATE
  //=========================================================================================================
  public int update(String newName, String oldName, Integer age) throws SQLException {

    //GET DB CONNECTION
    Connection connection = dataSource.getConnection();

    //INSERT RECORDS (Use single quotes for Strings)
    String    sql       = " UPDATE PERSON SET NAME = '"+newName+"' WHERE name = '"+oldName+"' AND age = "+age+";" +
                          " UPDATE PERSON SET NAME = 'Bill New'    WHERE name = 'Bill'";
    Statement statement = connection.createStatement();
    int       success   = statement.executeUpdate(sql);

    //RETURN SUCCESS
    return success;

  }

}
