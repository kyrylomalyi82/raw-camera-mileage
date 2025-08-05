package com.kyrylomalyi.rawmileage.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MileageResponse {
    private Integer mileage;
    private String cameraModel;
    private String fileName;
    private String message;
}
