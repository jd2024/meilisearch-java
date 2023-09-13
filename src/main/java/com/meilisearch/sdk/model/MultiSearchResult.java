package com.meilisearch.sdk.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Multi search response
 *
 * <p>https://www.meilisearch.com/docs/reference/api/multi_search#response
 */
@Getter
@ToString
public class MultiSearchResult implements Searchable {
    String indexUid;
    ArrayList<HashMap<String, Object>> hits;
    Object facetDistribution;
    int processingTimeMs;
    String query;
    int offset;
    int limit;
    int estimatedTotalHits;

    public MultiSearchResult() {}
}
