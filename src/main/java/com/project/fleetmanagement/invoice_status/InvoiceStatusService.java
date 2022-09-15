package com.project.fleetmanagement.invoice_status;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceStatusService {

    private final InvoiceStatusRepository invoiceStatusRepository;
}
