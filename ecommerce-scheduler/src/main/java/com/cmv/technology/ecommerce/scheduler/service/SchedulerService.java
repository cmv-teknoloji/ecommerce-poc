package com.cmv.technology.ecommerce.scheduler.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@RefreshScope
@EnableScheduling
public class SchedulerService {

    private final StatuTrackService statuTrackService;

    @Scheduled(cron = "${yurtici.cargo.queryCron}")
    public void scheduleForOrderStatuChange(){
        statuTrackService.queryNonCompletedOrders();
    }
}
