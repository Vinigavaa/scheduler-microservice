package com.microsservice.apims.controller.dto;

import com.microsservice.apims.entity.Channel;
import com.microsservice.apims.entity.Notification;
import com.microsservice.apims.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDTO(LocalDateTime dateTime, String destination, String message, Channel.Values channel) {
    public Notification toNotification(){
        return new Notification(
            dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
