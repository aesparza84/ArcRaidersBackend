package com.ARC.app.service;

import com.ARC.app.DTO.Items.FullItemDTO;
import com.ARC.app.DTO.Items.FullItemResponseDTO;
import com.ARC.app.DTO.Items.SubItemComponentReferenceDTO;
import com.ARC.app.model.CompositeKeys.ItemComponentCompositeKey;
import com.ARC.app.model.ItemBase;
import com.ARC.app.model.ItemComponent;
import com.ARC.app.model.WeaponModStats;
import com.ARC.app.repo.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Optional;

@Service
public class DataAquisitionService {

//    private EnemyRepo enemyRepo;
    private ItemRepo itemRepo;
    private QuickUseStatsRepo quickUseRepo;
    private WeaponModStatsRepo modRepo;
    private WeaponStatsRepo weaponRepo;
    private ItemComponentsRepo componentsRepo;

    @Value("${base.url}")
    private String baseApi;

    public DataAquisitionService(ItemRepo itemRepo, QuickUseStatsRepo quickUseRepo, WeaponModStatsRepo modRepo, WeaponStatsRepo weaponRepo, ItemComponentsRepo componentsRepo) {
//        this.enemyRepo = enemyRepo;
        this.itemRepo = itemRepo;
        this.quickUseRepo = quickUseRepo;
        this.modRepo = modRepo;
        this.weaponRepo = weaponRepo;
        this.componentsRepo = componentsRepo;
    }

    public void GatherItemInfo() {
        ObjectMapper mapper = new ObjectMapper();

        //Amount of items per response to be eco-friendly
//        Integer Limit = 10;
//        String uri = UriComponentsBuilder.fromUriString(baseApi)
//                .pathSegment("items")
//                .queryParam("limit", Limit)
//                .queryParam("search", "power rod")
//                .toUriString();
//
//
//        RestTemplate template = new RestTemplate();
//
//        String response = template.getForObject(uri, String.class);
//        FullItemResponseDTO info = mapper.readValue(response, FullItemResponseDTO.class);

        FullItemResponseDTO info = mapper.readValue(
                new File("src/main/java/com/ARC/app/junk/fullItem.json"),
                FullItemResponseDTO.class);

        for (FullItemDTO item : info.getData()) {
            ItemBase entry = item.toItemBase();

            itemRepo.save(entry);

            if (item.getComponents() != null) {
                for (SubItemComponentReferenceDTO comp : item.getComponents()) {
                    ItemBase base = comp.getComponent().toItemBase();
                    itemRepo.save(base);

                    ItemComponentCompositeKey key = new ItemComponentCompositeKey(
                            entry.getId(), base.getId()
                    );

                    ItemComponent compItem = new ItemComponent(
                            key,
                            entry,
                            base,
                            comp.getQuantity()
                    );

                    componentsRepo.save(compItem);
                }


            }
        }
    }

    public void GatherWeaponInfo() {
        ObjectMapper mapper = new ObjectMapper();

        //Amount of items per response to be eco-friendly
        Integer Limit = 10;
        String uri = UriComponentsBuilder.fromUriString(baseApi)
                .pathSegment("items")
                .queryParam("limit", Limit)
                .queryParam("search", "power rod")
                .toUriString();

        //Initial request
        RestTemplate template = new RestTemplate();

        String response = template.getForObject(uri, String.class);
        FullItemResponseDTO enemyData = mapper.readValue(response, FullItemResponseDTO.class);
    }

    public void GatherWeaponModInfo(){

    }

    public void GatherQuickUseInfo(){

    }

    public void GatherArcInfo() {

    }

}
