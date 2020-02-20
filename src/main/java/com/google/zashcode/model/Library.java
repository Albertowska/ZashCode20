package com.google.zashcode.model;

import java.util.ArrayList;
import java.util.List;

public class Library implements Comparable<Library>{

  private int id;

  private int signUpDays;

  private List<Book> bookList;

  private int libraryPoints = 0;

  private int maxProcessingDays = 0;

  public List<Book> getBooksToProcess() {
    return booksToProcess;
  }

  public void setBooksToProcess(List<Book> booksToProcess) {
    this.booksToProcess = booksToProcess;
  }

  private List<Book> booksToProcess;


    public Library (int id, int signUpDays, int dailyThroughput){
        this.id= id;
        this.signUpDays=signUpDays;
        this.dailyThroughput=dailyThroughput;
        this.bookList= new ArrayList<>();
        this.booksToProcess = new ArrayList<>();
    }
  private int dailyThroughput;


  public int getSignUpDays() {
    return signUpDays;
  }

  public void setSignUpDays(int signUpDays) {
    this.signUpDays = signUpDays;
  }

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  public int getDailyThroughput() {
    return dailyThroughput;
  }

  public void setDailyThroughput(int dailyThroughput) {
    this.dailyThroughput = dailyThroughput;
  }


  public int getLibraryPoints(){
    return libraryPoints / signUpDays;
  }

  public void setLibraryPoints(){
    libraryPoints = 0;
    for (Book book : bookList) {
      libraryPoints = libraryPoints + book.getScore();
    }
  }

  @Override
  public String toString() {
    String libraryString = id + " " + booksToProcess.size() + "\n";
    for(Book book : booksToProcess){
      libraryString = libraryString.concat(String.valueOf(book.getId()) + " ");
    }
    return libraryString;
  }

  @Override
  public int compareTo(Library comparelib) {
    if(getLibraryPoints() > comparelib.getLibraryPoints()){
      return -1;
    }else if (getLibraryPoints() < comparelib.getLibraryPoints()){
      return 1;
    }else{
      return 0;
    }
  }

  public int getMaxProcessingDays() {
    return maxProcessingDays;
  }

  public void setMaxProcessingDays(int maxProcessingDays) {
    this.maxProcessingDays = maxProcessingDays;
  }
}
