package com.ivoronline.springboot_jdbc_update.controller;

import com.ivoronline.springboot_jdbc_update.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired
  private MyService myService;

  //=========================================================================================================
  // UPDATE
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/update")
  public int update() throws SQLException {
    int    success = myService.update("John New", "John", 10);
    return success;
  }

}
