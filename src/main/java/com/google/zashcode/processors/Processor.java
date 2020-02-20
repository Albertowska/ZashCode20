package com.google.zashcode.processors;

import com.google.zashcode.Utils;
import com.google.zashcode.model.Picture;
import com.google.zashcode.model.Slide;
import com.google.zashcode.model.Slideshow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Processor implements MagicProcessor{

    public Slideshow process(List<Picture> pictureList) {
        List<Slide> slideList = new ArrayList<>();

        Picture lastVerticalPicture = null;

        for (Picture picture : pictureList) {

            if (picture.isHorizontal()) {

                slideList.add(new Slide(picture));
            } else { // vertical

                if (lastVerticalPicture != null) {
                    slideList.add(new Slide(lastVerticalPicture, picture));
                    lastVerticalPicture = null;
                } else {
                    lastVerticalPicture = picture;
                }
            }

        }
        return new Slideshow(slideList);
    }
}
