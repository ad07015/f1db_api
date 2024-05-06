package com.svalbard.f1.f1db_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "season_driver_standing")
public class SeasonDriverStanding {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "position_display_order")
    private Integer positionDisplayOrder;

    @Column(name = "year")
    private Integer year;

    @Column(name = "position_number")
    private Integer positionNumber;

    @Column(name = "position_text")
    private String positionText;

    @Column(name = "driver_id")
    private String driverId;

    @Column(name = "points")
    private Double points;
}
