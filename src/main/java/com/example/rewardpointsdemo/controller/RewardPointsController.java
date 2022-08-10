package com.example.rewardpointsdemo.controller;

import com.example.rewardpointsdemo.model.*;
import com.example.rewardpointsdemo.service.RewardPointsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
@Validated
@Slf4j
public class RewardPointsController {

    @Autowired
    private RewardPointsService rewardPointsService;

    @GetMapping("/getRewardPoints")
    public ResponseEntity getRewardPoints(@Valid RewardPointsRequest request) {

        log.info("Get Reward Points Request {} - start", request);

        RewardPointsResponse response = rewardPointsService.getRewardPoints(request.getAmount());

        log.info("Get Reward Points Request {} - end", request);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/getRewardPointsByMonth")
    public ResponseEntity getRewardPointsByMonth(@Valid RewardPointsByMonthRequest request) {

        log.info("Get Reward Points By Month Request {} - start", request);

        RewardPointsByMonthResponse response = rewardPointsService.getRewardPointsByMonth(request);

        log.info("Get Reward Points By Month Request {} - end", request);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/getRewardPointsSum")
    public ResponseEntity getRewardPointsSum(@Valid RewardPointsSumRequest request) {

        log.info("Get Reward Points Sum Request {} - start", request);

        RewardPointsSumResponse response = rewardPointsService.getRewardPointsSum(request);

        log.info("Get Reward Points Sum Request {} - end", request);

        return ResponseEntity.ok(response);
    }
}
