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
}
