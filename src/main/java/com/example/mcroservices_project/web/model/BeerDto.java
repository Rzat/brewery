package com.example.mcroservices_project.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    /*
        private UUID id;
        private String beerName;
        private BeerStyleEnum beerStyle;
        private Integer version;
        private OffsetDateTime createdDate;
        private OffsetDateTime lastModifiedDate;
        private Long upc;
        private BigDecimal price;
        private Integer quantityOnHand;
    */
    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc;

    private OffsetDateTime createdDate; //used with user interface, example in DTO's
    private OffsetDateTime lastUpdatedDate;
}
