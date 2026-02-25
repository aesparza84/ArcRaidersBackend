package com.ARC.app.service;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CacheService {
    private CacheManager cacheManager;

    public CacheService(CacheManager c) {
        this.cacheManager = c;
    }

    public void inspectCache(){
        Cache cache = cacheManager.getCache("itemsCache");
        if (cache != null){
            System.out.println("Items cache:");
            System.out.println(Objects.requireNonNull(cache.getNativeCache()).toString());
        }
        else {
            System.out.println("No Cache exists");
        }
    }
}
