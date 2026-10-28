package com.example.demo.fortech.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Payment {
    private Integer userId;

    private Integer receiverId;

    private Double amount;

}
