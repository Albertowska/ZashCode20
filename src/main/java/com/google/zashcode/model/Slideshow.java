package com.google.zashcode.model;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class Slideshow {

    private List<Slide> slides;

    private int numberOfPictures = 0;

    public Slideshow(List<Slide> slides) {
        this.slides = slides;
    }

    public List<Slide> getSlides() {
        return slides;
    }
}
