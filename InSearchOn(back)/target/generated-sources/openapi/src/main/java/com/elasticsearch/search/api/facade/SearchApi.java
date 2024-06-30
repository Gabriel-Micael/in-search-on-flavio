/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.elasticsearch.search.api.facade;

import com.elasticsearch.search.api.model.Error;
import com.elasticsearch.search.api.model.SearchResult;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-29T20:49:01.654238048-03:00[America/Sao_Paulo]")

@Validated
@Api(value = "search", description = "the search API")
public interface SearchApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /search : Submits a query to Elasticsearch
     *
     * @param query          Query to be submitted (optional)
     * @param page           Page to be returned (optional)
     * @param pageSize       Number of page to be returned (optional)
     * @param filter         Filter of Order (optional)
     * @param order          Method of Order (optional)
     * @param initialDate    Start Date Filter (optional)
     * @param finalDate      End Date Filter (optional)
     * @param minReadingTime Min Reading Time (optional)
     * @param maxReadingTime Max Reading Time (optional)
     * @return OK (status code 200)
     * or Unexpected error (status code 500)
     */
    @ApiOperation(value = "Submits a query to Elasticsearch", nickname = "search", notes = "", response = SearchResult.class, tags={ "search", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SearchResult.class),
        @ApiResponse(code = 500, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default CompletableFuture<ResponseEntity<SearchResult>> search(@ApiParam(value = "Query to be submitted") @Valid @RequestParam(value = "query", required = false) String query, @ApiParam(value = "Page to be returned") @Valid @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Number of page to be returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "Filter of Order") @Valid @RequestParam(value = "filter", required = false) Integer filter, @ApiParam(value = "Method of Order") @Valid @RequestParam(value = "order", required = false) Boolean order, @ApiParam(value = "Start Date Filter") @Valid @RequestParam(value = "initialDate", required = false) String initialDate, @ApiParam(value = "End Date Filter") @Valid @RequestParam(value = "finalDate", required = false) String finalDate, @ApiParam(value = "Min Reading Time") @Valid @RequestParam(value = "minReadingTime", required = false) Integer minReadingTime, @ApiParam(value = "Max Reading Time") @Valid @RequestParam(value = "maxReadingTime", required = false) Integer maxReadingTime) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"results\" : [ { \"reading_time\" : 0, \"abs\" : \"abs\", \"title\" : \"title\", \"dt_creation\" : \"dt_creation\", \"url\" : \"url\" }, { \"reading_time\" : 0, \"abs\" : \"abs\", \"title\" : \"title\", \"dt_creation\" : \"dt_creation\", \"url\" : \"url\" } ], \"total_results\" : 6, \"search_time\" : 1 }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

}
