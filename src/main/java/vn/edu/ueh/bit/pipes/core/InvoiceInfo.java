package vn.edu.ueh.bit.pipes.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class InvoiceInfo {
    private List<Invoice> invoices;
    private List<CreditNote> creditNotes;
    private List<Payment> payments;
    private List<Note> notes;

    // Getter và Setter
    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<CreditNote> getCreditNotes() {
        return creditNotes;
    }

    public void setCreditNotes(List<CreditNote> creditNotes) {
        this.creditNotes = creditNotes;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

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
                ", creditNotes=" + creditNotes +
                ", payments=" + payments +
                ", notes=" + notes +
                '}';
    }
}
