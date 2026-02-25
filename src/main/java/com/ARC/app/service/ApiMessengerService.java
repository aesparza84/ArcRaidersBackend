package com.ARC.app.service;


//DOCS - https://metaforge.app/arc-raiders/api

import com.ARC.app.DTO.ARC.EnemyResponseDTO;
import com.ARC.app.DTO.Items.FullItemResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import tools.jackson.databind.ObjectMapper;

import com.ARC.app.apiParameters.*;

import java.util.Optional;

@Service
public class ApiMessengerService {

    @Value("${base.url}")
    private String baseApi;

    public ApiMessengerService(){}

    @CachePut(value = "arcCache", key = "#params")
    public Optional<EnemyResponseDTO> QueryArcURI(ApiArcParameters params) {
        ObjectMapper mapper = new ObjectMapper();
        String uri = UriComponentsBuilder.fromUriString(baseApi)
                .pathSegment("arcs")
                .queryParamIfPresent("page", Optional.ofNullable(params.getPageable().getPage()))
                .queryParamIfPresent("limit", Optional.ofNullable(params.getPageable().getLimit()))
                .queryParamIfPresent("search", Optional.ofNullable(params.getPageable().getSearch()))
                .queryParamIfPresent("includeLoot", Optional.ofNullable(params.getIncludeLoot()))
                .queryParamIfPresent("sortOrder", Optional.ofNullable(params.getPageable().getSortOrder()))
                .toUriString();

        RestTemplate template = new RestTemplate();

        String response = template.getForObject(uri, String.class);
        EnemyResponseDTO enemyData = mapper.readValue(response, EnemyResponseDTO.class);

        return Optional.ofNullable(enemyData);
    }

    @CachePut(value="itemsCache", key = "#params")
    public Optional<FullItemResponseDTO> QueryItems(ApiItemParameters params) {
        ObjectMapper mapper = new ObjectMapper();
        String uri = UriComponentsBuilder.fromUriString(baseApi)
                .pathSegment("items")
                .queryParamIfPresent("page", Optional.ofNullable(params.getPageable().getPage()))
                .queryParamIfPresent("limit", Optional.ofNullable(params.getPageable().getLimit()))
                .queryParamIfPresent("search", Optional.ofNullable(params.getPageable().getSearch()))
                .queryParamIfPresent("sortOrder", Optional.ofNullable(params.getPageable().getSortOrder()))
                .queryParamIfPresent("itemType", Optional.ofNullable(params.getItemType()))
                .queryParamIfPresent("rarity", Optional.ofNullable(params.getRarity()))
                .queryParamIfPresent("loadoutSlot", Optional.ofNullable(params.getLoadoutSlot()))
                .queryParamIfPresent("workbench", Optional.ofNullable(params.getWorkbench()))
                .queryParamIfPresent("shieldType", Optional.ofNullable(params.getShieldType()))
                .queryParamIfPresent("includeComponents", Optional.ofNullable(params.getIncludeComponents()))
                .queryParamIfPresent("minimal", Optional.ofNullable(params.getMinimal()))
                .toUriString();

        RestTemplate template = new RestTemplate();
        String response = template.getForObject(uri, String.class);
        FullItemResponseDTO itemResponse = mapper.readValue(response, FullItemResponseDTO.class);

//        FullItemResponseDTO itemResponse = mapper.readValue(
//                new File("src/main/java/com/ARC/app/junk/fullItem.json"),
//                FullItemResponseDTO.class);

        return Optional.ofNullable(itemResponse);
    }

}
