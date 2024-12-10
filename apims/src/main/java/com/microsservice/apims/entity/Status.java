package com.microsservice.apims.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_status")
@Getter
@Setter
public class Status {
    @Id
    private Long statusId;

    private String description;

    public Status() {
    }

    public Status(Long statusId, String description) {
        this.statusId = statusId;
        this.description = description;
    }

    public enum Values {
        PENDING(1L, "pending"),
        SUCCESS(1L, "success"),
        ERROR(1L, "error"),
        CANCELLED(1L, "cancelled");

        private Long id;
        private String description;

        Values(Long id, String description) {
            this.id = id;
            this.description = description;
        }
        public Status toStatus(){
            return new Status(id, description);
        }


    }
}
