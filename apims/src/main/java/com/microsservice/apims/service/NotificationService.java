package com.microsservice.apims.service;

import com.microsservice.apims.controller.dto.ScheduleNotificationDTO;
import com.microsservice.apims.entity.Notification;
import com.microsservice.apims.entity.Status;
import com.microsservice.apims.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO dto){
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId){
        return notificationRepository.findById(notificationId);
    }

    public void cancelNotification(Long notificationId){
        var notification = findById(notificationId);

        if(notification.isPresent()){
            notification.get().setStatus(Status.Values.CANCELLED.toStatus());
            notificationRepository.save(notification.get());
        }
    }
}
