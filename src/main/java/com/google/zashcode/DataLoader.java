package com.google.zashcode;

import com.google.zashcode.model.Picture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataLoader {

  private final String filePath = "src/main/java/resources/inputs/";

  private String docName;


  public DataLoader(String docName) {
    this.docName = docName;
  }

  public List<Picture> getLibraries() throws IOException {

    List<String> lines = Files.readAllLines(Paths.get(filePath.concat(docName)));

    List<Picture> pictures = new ArrayList<Picture>();

    lines.remove(0);

    Set<String> tagList;
    boolean horizontal;
    int pictureId = 0;
    for (String pictureLine : lines) {
      String[] arrayLine = pictureLine.split(" ");

      horizontal = arrayLine[0].equals("H") ? true : false;
      int numTags = Integer.parseInt(arrayLine[1]);
      tagList = new HashSet<String>();
      for (int i = 2; i < arrayLine.length; i++) {
        tagList.add(arrayLine[i]);
      }
      pictures.add(new Picture(pictureId, horizontal, tagList));
      pictureId++;
    }

    return pictures;
  }


}
