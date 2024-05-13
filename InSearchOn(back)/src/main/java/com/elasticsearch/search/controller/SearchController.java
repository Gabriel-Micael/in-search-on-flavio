package com.elasticsearch.search.controller;

import com.elasticsearch.search.api.facade.SearchApi;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.elasticsearch.search.api.model.Result;
import com.elasticsearch.search.service.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;


@CrossOrigin
@RestController
public class SearchController implements SearchApi {

    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @Override
    public CompletableFuture<ResponseEntity<List<Result>>> search(String query) {
        // Consulta normal
        List<Result> result = searchService.submitQuery(query);
        return CompletableFuture.supplyAsync(() -> ResponseEntity.ok(result));
    }
}
