package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping("/add")
    public String addInvoice(@RequestBody Invoice invoice) {
        return service.addInvoice(invoice);
    }

    @GetMapping("/viewall")
    public List<Invoice> getAllInvoices() {
        return service.viewAllInvoices();
    }
}