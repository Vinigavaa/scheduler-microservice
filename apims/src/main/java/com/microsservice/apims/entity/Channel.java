package com.microsservice.apims.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_channels")
public class Channel {
    @Id
    private Long channelId;

    private String description;
}
