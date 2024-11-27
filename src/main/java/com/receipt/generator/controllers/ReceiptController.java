package com.receipt.generator.controllers;

import com.receipt.generator.entities.Receipt;
import com.receipt.generator.services.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/receipt")
public class ReceiptController {

    @Autowired
    ReceiptService receiptService;

    @PostMapping("/save")
    public ResponseEntity<?> saveReceipt(@RequestBody Receipt receipt) {
        return receiptService.saveReceipt(receipt);
    }

    @GetMapping("/fetch/{userId}")
    public ResponseEntity<?> fetchReceipt(@PathVariable String userId) {
        return receiptService.fetchReceipt(userId);
    }

    @GetMapping("/fetch/customer/receipts/{customerPhone}")
    public ResponseEntity<?> fetchCustomerReceipt(@PathVariable String customerPhone) {
        return receiptService.fetchCustomerReceipt(customerPhone);
    }

    @DeleteMapping("/delete/{billNumber}")
    public ResponseEntity<?> deleteReceipt(@PathVariable String billNumber) {
        return receiptService.deleteReceipt(billNumber);
    }
}
