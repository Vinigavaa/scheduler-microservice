package com.microsservice.apims.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")
public class Status {
    @Id
    private Long statusId;

    private String description;
}
