package vn.edu.ueh.bit.pipes.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeliveryDetail {
    private Long id;
    private boolean delivery;
    private String note;
    private String deliveryAdd;

    // Getter và Setter
    public Long getNodeId() {
        return id;
    }

    public void setNodeId(Long noteId) {
        this.id = noteId;
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
                "noteId=" + id +
                ", isDelivery=" + delivery +
                ", note='" + note + '\'' +
                ", deliveryAdd='" + deliveryAdd + '\'' +
                '}';
    }
}
