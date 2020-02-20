package com.google.zashcode;

import com.google.zashcode.model.Book;
import com.google.zashcode.model.Library;
import com.google.zashcode.model.SignupProcess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DataLoader {

  private final String filePath = "src/main/java/resources/inputs/";

  private String docName;


  public DataLoader(String docName) {
    this.docName = docName;
  }

  public SignupProcess getProcess() throws IOException {

    List<String> lines = Files.readAllLines(Paths.get(filePath.concat(docName)));

    SignupProcess process = new SignupProcess();

    process.setFilename(this.docName);

    String[] values = lines.get(0).split(" ");
    process.setBookCollectionCount(Integer.valueOf(values[0]));
    process.setLibraryCount(Integer.valueOf(values[1]));
    process.setMaxProcessDays(Integer.valueOf(values[2]));

    lines.remove(0);

    String[] books = lines.get(0).split(" ");
    int bookId = 0;
    for(String book: books){
      process.getBookCollection().put(bookId, new Book(bookId,Integer.valueOf(book)));
      bookId++;
    }

    lines.remove(0);
    Library library = null;
    int libraryCount = 0;
    for(int i=0;i<lines.size();i=i+2){

      String line1 = lines.get(i);
      String[] libraryLine = line1.split(" ");
      if(line1.length()<1) break;

      library = new Library(libraryCount++,Integer.valueOf(libraryLine[1]), Integer.valueOf(libraryLine[2]));
      String line2 = lines.get(i+1);
      String[] booksLine = line2.split(" ");
      List<String> booksForLibrary = Arrays.asList(booksLine);
      for(String bookIdAux: booksForLibrary){
        library.getBookList().add(process.getBookCollection().get(Integer.valueOf(bookIdAux)));
      }

      process.getLibraryList().add(library);
    }

  return process;
  }


}
