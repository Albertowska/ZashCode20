package com.google.zashcode;

import com.google.zashcode.model.Picture;
import com.google.zashcode.model.Slideshow;
import com.google.zashcode.processors.MagicProcessor;
import com.google.zashcode.processors.Processor;

import java.io.IOException;
import java.util.List;

public class Application {

  public static void main(String[] args) throws IOException, InterruptedException {

    System.out.println("Wer are Acquisition Hackers!!!");

    List<Picture> picturesA = new DataLoader("a_example.txt").getSlideShow();

    List<Picture> picturesB = new DataLoader("b_lovely_landscapes.txt").getSlideShow();

    List<Picture> picturesC = new DataLoader("c_memorable_moments.txt").getSlideShow();

    List<Picture> picturesD = new DataLoader("d_pet_pictures.txt").getSlideShow();

    List<Picture> picturesE = new DataLoader("e_shiny_selfies.txt").getSlideShow();

    MagicProcessor processor = new Processor();

    Thread a = new Thread(() -> {
      Slideshow slideshow = null;
      try {
        slideshow = processor.process(picturesA);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      Utils.getResults("A", slideshow);
      DataOutput.write("out_a", slideshow);
    });

    Thread b = new Thread(() -> {
      Slideshow slideshow = null;
      try {
        slideshow = processor.process(picturesB);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      Utils.getResults("B", slideshow);
      DataOutput.write("out_b", slideshow);
    });

    Thread c = new Thread(() -> {
      Slideshow slideshow = null;
      try {
        slideshow = processor.process(picturesC);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      Utils.getResults("C", slideshow);
      DataOutput.write("out_c", slideshow);
    });

    Thread d = new Thread(() -> {
      Slideshow slideshow = null;
      try {
        slideshow = processor.process(picturesD);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      Utils.getResults("D", slideshow);
      DataOutput.write("out_d", slideshow);
    });

    Thread e = new Thread(() -> {
      Slideshow slideshow = null;
      try {
        slideshow = processor.process(picturesE);
      } catch (InterruptedException e1) {
        e1.printStackTrace();
      }
      Utils.getResults("E", slideshow);
      DataOutput.write("out_e", slideshow);
    });

    b.start();
    c.start();
    d.start();
    e.start();

    b.join();
    c.join();
    d.join();
    e.join();

  }

}
