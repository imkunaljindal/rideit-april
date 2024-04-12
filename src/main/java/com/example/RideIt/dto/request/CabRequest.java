package com.example.RideIt.dto.request;

import com.example.RideIt.Enum.CarType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CabRequest {

    String company;

    String carModel;

    String cabNo;

    CarType carType;

    int numberOfSeats;

    double farePerKm;
}
