package com.google.zashcode.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private int id;

  private int signUpDays;

  private List<Book> bookList;

  public List<Book> getBooksToProcess() {
    return booksToProcess;
  }

  public void setBooksToProcess(List<Book> booksToProcess) {
    this.booksToProcess = booksToProcess;
  }

  private List<Book> booksToProcess;

  private int dailyThroughput;

  public Library(int id, int signUpDays, int dailyThroughput, List<Book> books) {
    this.id = id;
    this.signUpDays = signUpDays;
    this.dailyThroughput = dailyThroughput;
    this.bookList = books;
    this.booksToProcess = new ArrayList<>();
  }

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

  @Override
  public String toString() {
    String libraryString = id + " " + booksToProcess.size() + "\n";
    booksToProcess.forEach(book -> libraryString.concat(book.getId()));
    return libraryString;
  }
}
