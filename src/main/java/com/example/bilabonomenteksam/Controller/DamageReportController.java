package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Service.DamageReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class DamageReportController {

  private DamageReportService damageService = new DamageReportService();

  @GetMapping("/DamageReport")
  public String DamageReport(){
    return "DamageReport";
  }

  @PostMapping("/DamageReport")
  public String DamageReport(WebRequest payload){
    damageService.createDamageReport(payload);
    return "ListOfDamageReports";
  }

}