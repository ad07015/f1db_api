package com.svalbard.f1.f1db_api.service;

import com.svalbard.f1.f1db_api.model.SeasonDriverStanding;
import com.svalbard.f1.f1db_api.repository.SeasonDriverStandingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonDriverStandingService {

    private final SeasonDriverStandingRepository repo;

    public SeasonDriverStandingService(SeasonDriverStandingRepository repo) {
        this.repo = repo;
    }

    public List<SeasonDriverStanding> getDriverStandingsByYear(Integer year) {
        return repo.findByYear(year);
    }
}
