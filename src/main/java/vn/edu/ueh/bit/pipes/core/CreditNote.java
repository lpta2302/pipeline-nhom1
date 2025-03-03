package vn.edu.ueh.bit.pipes.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreditNote {
    private Long creditNote;
    private String notes;
    private boolean cancellation;

    // Getter và Setter
    public Long getCreditNote() {
        return creditNote;
    }

    public void setCreditNote(Long creditNote) {
        this.creditNote = creditNote;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isCancellation() {
        return cancellation;
    }

    public void setCancellation(boolean cancellation) {
        this.cancellation = cancellation;
    }

    // Chuyển đối tượng thành JSON
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
        return "CreditNote{" +
                "creditNote=" + creditNote +
                ", notes='" + notes + '\'' +
                ", cancellation=" + cancellation +
                '}';
    }
}