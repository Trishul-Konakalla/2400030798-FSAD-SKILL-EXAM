package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository repository;

    @Override
    public String addInvoice(Invoice invoice) {
        repository.save(invoice);
        return "Invoice Added Successfully";
    }

    @Override
    public List<Invoice> viewAllInvoices() {
        return repository.findAll();
    }
}