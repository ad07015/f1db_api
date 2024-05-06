package com.svalbard.f1.f1db_api.controller;

import com.svalbard.f1.f1db_api.service.SeasonDriverStandingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/driver-standing")
public class SeasonDriverStandingController {

    private final SeasonDriverStandingService service;

    public SeasonDriverStandingController(SeasonDriverStandingService service) {
        this.service = service;
    }

    @GetMapping(value = "/{year}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getDriverStandingByYear(@PathVariable Integer year) {
        var driverStandingsByYear = service.getDriverStandingsByYear(year);

        return new ResponseEntity<>(driverStandingsByYear, HttpStatus.OK);
    }
}
