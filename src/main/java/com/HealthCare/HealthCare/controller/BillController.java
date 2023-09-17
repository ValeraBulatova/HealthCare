package com.HealthCare.HealthCare.controller;

import com.HealthCare.HealthCare.model.entities.Bill;
import com.HealthCare.HealthCare.service.BillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/add")
    public String showAddBillView(){
        return "/bills/add";
    }

    @PostMapping("/add/confirm")
    public String addBill(Bill bill) {
        // Save the new bill to the database
        billService.createBill(bill);

        return "redirect:/bills"; // Redirect back to the bill list
    }

    @GetMapping("/update")
    public String showUpdateBillForm(@RequestParam Long id, Model model) {
        // Retrieve the bill information by ID from your database or service
        Bill bill = billService.getBill(id);

        // Add the bill object to the model
        model.addAttribute("bill", bill);

        // Return the name of the HTML template
        return "bills/update"; // The name of your HTML template for updating bills
    }

    @PostMapping("/update/confirm")
    public String updateBill(Bill bill) {
        // Save the updated bill to the database
        billService.createBill(bill);

        return "redirect:/bills"; // Redirect back to the bill list
    }

    @PostMapping("/delete")
    public String deleteBill(@RequestParam Long id) {
        billService.deleteBill(id);

        return "redirect:/bills"; // Redirect back to the bill list
    }
}
