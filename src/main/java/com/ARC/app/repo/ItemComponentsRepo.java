package com.ARC.app.repo;

import com.ARC.app.model.ItemComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemComponentsRepo extends JpaRepository<ItemComponent,String> {

}
