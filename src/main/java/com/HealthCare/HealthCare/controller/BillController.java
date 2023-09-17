package com.HealthCare.HealthCare.controller;

import com.HealthCare.HealthCare.service.BillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bills")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    // the default page for /bills is the list of bills
    @GetMapping
    public String showBillsView(Model m){
        // Add the list of bills to the model
        m.addAttribute("Bill", billService.getBills());

        return "/bills/list";
    }
}
