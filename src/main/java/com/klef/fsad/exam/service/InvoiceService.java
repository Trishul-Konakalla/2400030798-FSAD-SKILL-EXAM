package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Invoice;
import java.util.List;

public interface InvoiceService {
    public String addInvoice(Invoice invoice);
    public List<Invoice> viewAllInvoices();
}