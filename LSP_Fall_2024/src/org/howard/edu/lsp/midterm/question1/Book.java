package org.howard.edu.lsp.midterm.question1;

/**
 * Represents a Book with a title, author, ISBN, and year published.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructs a new Book with the specified title, author, ISBN, and year published.
     *
     * @param title          the title of the book
     * @param author         the author of the book
     * @param ISBN           the ISBN number of the book (a unique identifier)
     * @param yearPublished  the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of the book.
     *
     * @return  the book's title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the title of the book.
     *
     * @param title  the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Returns the author of the book.
     *
     * @return  the book's author
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Sets the author of the book.
     *
     * @param author  the new author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    /**
     * Returns the ISBN number of the book.
     *
     * @return  the book's ISBN number
     */
    public String getISBN() {
        return ISBN;
    }
    
    /**
     * Sets the ISBN number of the book.
     *
     * @param ISBN  the new ISBN number of the book
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    /**
     * Returns the year the book was published.
     *
     * @return  the year published
     */
    public int getYearPublished() {
        return yearPublished;
    }
    
    /**
     * Sets the year the book was published.
     *
     * @param yearPublished  the new publication year
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    /**
     * Compares this book to the specified object. The result is {@code true} if and only if
     * the argument is not {@code null} and is a {@code Book} object that has the same
     * ISBN and author as this object.
     *
     * @param o  the object to compare this {@code Book} against
     * @return   {@code true} if the given object represents a {@code Book} equivalent to this book, {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Book book = (Book) o;
        if (ISBN == null || book.ISBN == null) return false;
        if (author == null || book.author == null) return false;
        
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }
    
    /**
     * Returns a string representation of the book, including its title, author, ISBN, and year published.
     *
     * @return  a string representation of the book
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + 
               ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
