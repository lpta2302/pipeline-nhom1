package vn.edu.ueh.bit.pipes.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import vn.edu.ueh.bit.pipes.core.entities.InvoiceInfo;
import vn.edu.ueh.bit.pipes.core.entities.Message;
import vn.edu.ueh.bit.pipes.core.service.ShopService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/invoice-infors")
@RequiredArgsConstructor
public class ShopController {
    private final ShopService shopService;

    @PostMapping
    public ResponseEntity<Message> checkOut(@RequestBody InvoiceInfo invoiceInfo) {
        return ResponseEntity.ok(shopService.checkOut(invoiceInfo));
    }
    
}
