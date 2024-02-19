package com.in28minutes.learnspringin10steps.enterprise.example.business;

import com.in28minutes.learnspringin10steps.enterprise.example.data.DataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

  // Any one of the Injection would have worked, either Field, Constructor, Setter 
  // Recommended method is - Constructor Injection
  // No need to use all three methods to inject dependencies - Although it won't give any error

  // Field Injection of dependencies
  @Autowired
  private DataService dataService;

  // Construtor Injection of Dependencies
  @Autowired
  public BusinessService(DataService dataService) {
    this.dataService = dataService;
  }

  // Setter Injection of Dependencies
  @Autowired
  public void setDataService(DataService dataService) {
    this.dataService = dataService;
  }

  public long calculateSum() {
    List<Integer> data = dataService.getData();
    return data.stream().reduce(Integer::sum).get();
  }
}
