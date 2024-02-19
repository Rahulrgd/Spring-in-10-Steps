package com.in28minutes.learnspringin10steps.enterprise.example.web;

import com.in28minutes.learnspringin10steps.enterprise.example.business.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    @Autowired
  private BusinessService businessService;

  public MyWebController(BusinessService businessService) {
    this.businessService = businessService;
  }

  public long returnValueFromBusinessService() {
    return businessService.calculateSum();
  }
}
