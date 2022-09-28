package com.project.fleetmanagement.invoice_status;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoice-statuses")
@RequiredArgsConstructor
public class InvoiceStatusController {

    private final InvoiceStatusService invoiceStatusService;

    @GetMapping
    public String getInvoiceStatuses() {
        return "entity/invoice-status";
    }
}
