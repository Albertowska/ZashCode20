package com.google.zashcode.model;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class Picture {

    private Integer id;

    private boolean horizontal;

    private Set<String> tags;

    public Picture(Integer id, boolean horizontal, Set tags) {
        this.id = id;
        this.horizontal = horizontal;
        this.tags = tags;
    }

}
