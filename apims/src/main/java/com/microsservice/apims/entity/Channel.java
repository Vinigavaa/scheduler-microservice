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

    public Channel(Long channelId, String description) {
        this.channelId = channelId;
        this.description = description;
    }

    public enum Values {
        EMAIL(1l, "email"),
        SMS(2L, "sms"),
        PUSH(3l, "push"),
        WHATSAPP(4l, "whatsapp");

        private Long id;
        private String description;

        Values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Channel toChannel(){
            return new Channel(id, description);
        }
    }
}
