package com.microsservice.apims.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_channels")
@Getter
@Setter
public class Channel {
    @Id
    private Long channelId;

    private String description;

    public Channel() {
    }
}
