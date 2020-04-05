package com.example.thereviewshow.trending.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/thereviewshow/trending/model/TrendingClient;", "", "getTrending", "Lcom/example/core/di/utils/NetworkResponse;", "Lcom/example/thereviewshow/trending/model/Trending;", "mediaType", "", "mediaTime", "app_debug"})
public abstract interface TrendingClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "trending/{media_type}/{media_time}?c329a39a2e407e774a1e9e9a9bd4189b")
    public abstract com.example.core.di.utils.NetworkResponse<com.example.thereviewshow.trending.model.Trending> getTrending(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "media_type")
    java.lang.String mediaType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "media_time")
    java.lang.String mediaTime);
}