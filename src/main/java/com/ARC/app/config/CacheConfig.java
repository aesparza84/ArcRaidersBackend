package com.ARC.app.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        ConcurrentMapCacheManager manager = new ConcurrentMapCacheManager();
        manager.setAllowNullValues(false);
        manager.setCacheNames(List.of("itemsCache", "arcCache"));
        return manager;
    }

    @Scheduled(fixedDelay = 600000, initialDelay = 0)
    @CacheEvict(value = {"itemsCache", "arcCache"},allEntries = true)
    public void ClearCache(){
        System.out.println("Cleared caches");
    }
}
