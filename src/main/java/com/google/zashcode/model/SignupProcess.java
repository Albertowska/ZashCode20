package com.google.zashcode.model;

import java.util.List;

public class SignupProcess {

    private List<Library> libraryList;

    private List<Library> librariesToProcess;

    private int timeline;

    private List<Book> bookCollection;

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

    public List<Book> getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(List<Book> bookCollection) {
        this.bookCollection = bookCollection;
    }
}
