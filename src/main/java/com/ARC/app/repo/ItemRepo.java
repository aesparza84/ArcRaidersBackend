package com.ARC.app.repo;

import com.ARC.app.model.ItemBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<ItemBase, String> {

}
