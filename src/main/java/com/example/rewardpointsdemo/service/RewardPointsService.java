package com.example.rewardpointsdemo.service;

import com.example.rewardpointsdemo.configuration.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RewardPointsService {

    @Autowired
    private ApplicationProperties applicationProperties;

    public int getRewardPoints(int amount) {
        int rewardPoints = 0;
        int amountOne = applicationProperties.getAmounts().getAmountOne();
        int amountTwo = applicationProperties.getAmounts().getAmountTwo();

        if(amount > amountOne) {
            rewardPoints += (amount - amountOne);
        }

        if(amount > amountTwo) {
            rewardPoints += (amount - amountTwo);
        }

        return rewardPoints;
    }
}
