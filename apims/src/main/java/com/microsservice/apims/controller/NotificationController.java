package com.microsservice.apims.controller;

import com.microsservice.apims.controller.dto.ScheduleNotificationDTO;
import com.microsservice.apims.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> ScheduleNotification(@RequestBody ScheduleNotificationDTO dto){
        notificationService.scheduleNotification(dto);
        return ResponseEntity.accepted().build();
    }
}
