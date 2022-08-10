package com.example.rewardpointsdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RewardPointsService {

    public int getRewardPoints(int amount) {
        int rewardPoints = 0;

        if(amount > 50) {
            rewardPoints += (amount - 50);
        }

        if(amount > 100) {
            rewardPoints += (amount - 100);
        }

        return rewardPoints;
    }
}
