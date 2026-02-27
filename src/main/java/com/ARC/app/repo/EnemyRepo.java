package com.ARC.app.repo;

import com.ARC.app.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyRepo extends JpaRepository<Enemy, String> {

}
