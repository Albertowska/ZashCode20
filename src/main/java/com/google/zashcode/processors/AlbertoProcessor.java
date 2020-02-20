package com.google.zashcode.processors;

import com.google.zashcode.DataOutput;
import com.google.zashcode.model.Book;
import com.google.zashcode.model.Library;
import com.google.zashcode.model.SignupProcess;

import java.util.Collections;
import java.util.stream.Collectors;

public class AlbertoProcessor implements MagicProcessor {


  @Override
  public void process(SignupProcess process) throws InterruptedException {

    // Order libraries
    Collections.sort(process.getLibraryList());

    Library libraryOnSignup = null;
    int nextFreeDay = 0;
    for(int i = 0; i < process.getMaxProcessDays(); i++){
      if(nextFreeDay <= i){

        if(libraryOnSignup != null){
          process.getLibrariesToProcess().add(libraryOnSignup);
        }

        // Add library
        if(process.getLibraryList().size() > 0) {
          libraryOnSignup = process.getLibraryList().get(0);
          process.getLibraryList().remove(0);
          nextFreeDay = i + libraryOnSignup.getSignUpDays();
        } else {
          libraryOnSignup = null;
        }

        System.out.println(process.getFilename() + " - " + i);
      }

      // Add books
      for (Library library : process.getLibrariesToProcess()) {
        for (int numBook = 0; numBook < library.getDailyThroughput(); numBook++) {
          addFirstNBooks(library);
        }
      }
    }

    generateResult(process);
  }

  private void addFirstNBooks(Library library) {
    if(library.getBookList().size() > 0) {
      // Select best book
      Book book = library.getBookList().get(0);
      library.getBooksToProcess().add(book);
      library.getBookList().remove(0);
    }
  }

  private void generateResult(SignupProcess process){
    DataOutput.write(process.getFilename().split("\\.")[0], process.getLibrariesToProcess());
  }
}
