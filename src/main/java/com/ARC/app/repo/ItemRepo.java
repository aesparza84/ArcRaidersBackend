package com.ARC.app.repo;

import com.ARC.app.model.ItemBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ItemBase, String> {

}
