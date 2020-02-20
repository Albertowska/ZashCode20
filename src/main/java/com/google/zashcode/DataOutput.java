package com.google.zashcode;

import com.google.zashcode.model.Library;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataOutput {

  public static void write(String file, List<Library> libraryList) {
    List<String> lines = new ArrayList<>();
    lines.add("" + libraryList.size());

    for (Library library : libraryList) {
      lines.add(library.toString());
    }

    try {
      Files.createDirectories(Paths.get("src/main/java/resources/outputs/"));
      Files.write(Paths.get("src/main/java/resources/outputs/" + file + ".out"), lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
