package com.microsservice.apims.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="tb_notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationId;

    private LocalDateTime dateTime;

    private String destination;

    private String message;
}
