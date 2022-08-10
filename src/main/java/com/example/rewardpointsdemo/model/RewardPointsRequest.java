package com.example.rewardpointsdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RewardPointsRequest implements Serializable {

    @NotNull(message = "Amount cannot be Null")
    @Min(value = 1, message = "Amount should be greater than 0")
    private Integer amount;
}
