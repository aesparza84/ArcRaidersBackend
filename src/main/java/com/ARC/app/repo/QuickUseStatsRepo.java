package com.ARC.app.repo;

import com.ARC.app.model.QuickUseStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuickUseStatsRepo extends JpaRepository<QuickUseStats, String> {

}
