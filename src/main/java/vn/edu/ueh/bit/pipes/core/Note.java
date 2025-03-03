package vn.edu.ueh.bit.pipes.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Note {
    private Long noteId;
    private boolean delivery;
    private String note;
    private String deliveryAdd;

    // Getter và Setter
    public Long getNodeId() {
        return noteId;
    }

    public void setNodeId(Long noteId) {
        this.noteId = noteId;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDeliveryAdd() {
        return deliveryAdd;
    }

    public void setDeliveryAdd(String deliveryAdd) {
        this.deliveryAdd = deliveryAdd;
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
        return "Note{" +
                "noteId=" + noteId +
                ", isDelivery=" + delivery +
                ", note='" + note + '\'' +
                ", deliveryAdd='" + deliveryAdd + '\'' +
                '}';
    }
}
