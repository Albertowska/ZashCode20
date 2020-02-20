package com.google.zashcode;

import com.google.zashcode.model.Library;
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

  public List<Library> getLibraries() throws IOException {

    List<String> lines = Files.readAllLines(Paths.get(filePath.concat(docName)));

  }


}
