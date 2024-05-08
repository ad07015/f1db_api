package com.svalbard.f1.f1db_api.controller;

import com.svalbard.f1.f1db_api.model.SeasonDriverStanding;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface SeasonDriverStandingController {

    @Operation(summary = "Get driver standings by season")
    @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Found driver standings for a given season",
        content = { @Content(mediaType = APPLICATION_JSON_VALUE,
        schema = @Schema(implementation = SeasonDriverStanding.class)) }),
    @ApiResponse(responseCode = "400", description = "Invalid season supplied",
        content = @Content),
    @ApiResponse(responseCode = "404", description = "Driver standings not found for given season",
        content = @Content) })
    ResponseEntity<List<SeasonDriverStanding>> getDriverStandingByYear(@PathVariable Integer year);
}
