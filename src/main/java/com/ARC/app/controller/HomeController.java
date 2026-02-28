package com.ARC.app.controller;

import com.ARC.app.DTO.ARC.EnemyResponseDTO;
import com.ARC.app.DTO.Items.FullItemResponseDTO;
import com.ARC.app.service.ApiMessengerService;
import com.ARC.app.service.CacheService;
import com.ARC.app.service.DataAquisitionService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ARC.app.apiParameters.*;

import java.util.Optional;

@RestController
@Validated
public class HomeController {

    private ApiMessengerService apiService;
    private CacheService cacheService;
    private DataAquisitionService dataService;

    public HomeController(ApiMessengerService apiService, CacheService cacheService, DataAquisitionService dataService) {
        this.apiService = apiService;
        this.cacheService = cacheService;
        this.dataService = dataService;
    }

    @GetMapping("/")
    public ResponseEntity<String> Home() {
        return ResponseEntity.ok("Home");
    }

    @GetMapping("/test")
    public void SaveDataTest() {
        dataService.GatherItemInfo();
    }


    @GetMapping("/c")
    public void Cached(){
        cacheService.inspectCache();
    }

    @GetMapping("/arcs")
    public ResponseEntity<EnemyResponseDTO> ArcQuery(@RequestParam(required = false) @Min(1) Integer page,
                                                     @RequestParam(required = false) @Min(1) @Max(50) Integer limit,
                                                     @RequestParam(required = false) String search,
                                                     @RequestParam(required = false) String sortOrder,
                                                     @RequestParam(required = false) String id,
                                                     @RequestParam(required = false) Boolean includeLoot) {
        //Pageable
        ApiPageableRequest p = new ApiPageableRequest.Builder()
                .page(page)
                .limit(limit)
                .search(search)
                .sortOrder(sortOrder)
                .id(id)
                .build();

        //Unique params w/pageable
        ApiArcParameters arcParams = new ApiArcParameters(includeLoot, p);

        Optional<EnemyResponseDTO> d = apiService.QueryArcURI(arcParams);

        if (d.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(d.get());
    }

    @GetMapping("/items")
    public ResponseEntity<FullItemResponseDTO> ItemsQuery(@RequestParam(required = false) String itemType,
                                             @RequestParam(required = false) String rarity,
                                             @RequestParam(required = false) String loadoutSlot,
                                             @RequestParam(required = false) String workbench,
                                             @RequestParam(required = false) String shieldType,
                                             @RequestParam(required = false) Boolean includeComponents,
                                             @RequestParam(required = false) Boolean minimal,
                                             @RequestParam(required = false) @Min(1) Integer page,
                                             @RequestParam(required = false) @Min(1) @Max(50) Integer limit,
                                             @RequestParam(required = false) String search,
                                             @RequestParam(required = false) String sortOrder,
                                             @RequestParam(required = false) String id
                                             ) {

        //Pageable
        ApiPageableRequest p = new ApiPageableRequest.Builder()
                .page(page)
                .limit(limit)
                .search(search)
                .sortOrder(sortOrder)
                .id(id)
                .build();

        //Unique + pagable
        ApiItemParameters itemParams = new ApiItemParameters(
                itemType,rarity,loadoutSlot,workbench,shieldType,includeComponents,minimal,p);

        Optional<FullItemResponseDTO> response = apiService.QueryItems(itemParams);

        if (response.isEmpty())
            return ResponseEntity.badRequest().build();

        return ResponseEntity.ok(response.get());
    }


}
