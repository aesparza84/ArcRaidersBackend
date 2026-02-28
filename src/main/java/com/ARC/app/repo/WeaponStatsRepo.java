package com.ARC.app.repo;

import com.ARC.app.model.WeaponStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponStatsRepo extends JpaRepository<WeaponStats,String> {

}
