package com.microsservice.apims.scheduler;

import com.microsservice.apims.service.NotificationService;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

@Component
public class ApiTaskScheduler {

    private static final Logger logger = LoggerFactory.getLogger(ApiTaskScheduler.class);
    private final NotificationService notificationService;

    public ApiTaskScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void checkTasks (){
        var dateTime = LocalDateTime.now();
        logger.info("Running at {}", dateTime);
        notificationService.checkAndSend(dateTime);
    }
}
