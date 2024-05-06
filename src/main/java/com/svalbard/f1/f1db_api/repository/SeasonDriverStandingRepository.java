package com.svalbard.f1.f1db_api.repository;

import com.svalbard.f1.f1db_api.model.SeasonDriverStanding;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeasonDriverStandingRepository extends JpaRepository<SeasonDriverStanding, Integer> {

    List<SeasonDriverStanding> findByYear(Integer year);
}
