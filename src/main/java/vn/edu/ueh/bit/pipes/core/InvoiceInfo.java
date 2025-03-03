package vn.edu.ueh.bit.pipes.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
public class InvoiceInfo {
    private List<Invoice> invoices;
    private CreditResponse creditNote;
    private Payment payment;
    private DeliveryDetail note;

    // Chuyển đối tượng thành chuỗi JSON
    public String toJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{}";
        }
    }

    // Override toString()
    @Override
    public String toString() {
        return "InvoiceInfo{" +
                "invoices=" + invoices +
                ", creditNotes=" + creditNote +
                ", payments=" + payment +
                ", notes=" + note +
                '}';
    }
}
