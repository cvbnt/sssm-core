package com.hao123.core.entity;

public class Books {
    private int bookId;
    private String bookName;
    private String detail;
    private int bookCounts;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", detail='" + detail + '\'' +
                ", bookCounts=" + bookCounts +
                '}';
    }

    public Books() {
    }

    public Books(int bookId, String bookName, String detail, int bookCounts) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.detail = detail;
        this.bookCounts = bookCounts;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }
}
