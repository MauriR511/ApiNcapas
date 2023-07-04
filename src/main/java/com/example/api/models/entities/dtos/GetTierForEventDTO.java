package com.example.api.models.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetTierForEventDTO {
    String UUID;
    String name;
    float price;
}
