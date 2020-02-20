package com.google.zashcode.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignupProcess {

    private String filename;

    private List<Library> libraryList;

    private List<Library> librariesToProcess;

    private int timeline;

    private Map<Integer, Book> bookCollection;

    private int bookCollectionCount;

    private int libraryCount;

    private int maxProcessDays;

    public SignupProcess(){
        libraryList = new ArrayList<>();
        librariesToProcess = new ArrayList<>();
        bookCollection = new HashMap<>();
    }

    public List<Library> getLibraryList() {
        return libraryList;
    }

    public void setLibraryList(List<Library> libraryList) {
        this.libraryList = libraryList;
    }

    public List<Library> getLibrariesToProcess() {
        return librariesToProcess;
    }

    public void setLibrariesToProcess(List<Library> librariesToProcess) {
        this.librariesToProcess = librariesToProcess;
    }

    public int getTimeline() {
        return timeline;
    }

    public void setTimeline(int timeline) {
        this.timeline = timeline;
    }

    public Map<Integer, Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(Map<Integer, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int getBookCollectionCount() {
        return bookCollectionCount;
    }

    public void setBookCollectionCount(int bookCollectionCount) {
        this.bookCollectionCount = bookCollectionCount;
    }

    public int getLibraryCount() {
        return libraryCount;
    }

    public void setLibraryCount(int libraryCount) {
        this.libraryCount = libraryCount;
    }

    public int getMaxProcessDays() {
        return maxProcessDays;
    }

    public void setMaxProcessDays(int maxProcessDays) {
        this.maxProcessDays = maxProcessDays;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
