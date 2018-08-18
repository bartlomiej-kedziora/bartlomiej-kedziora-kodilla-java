package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBook() {
        //Given
        Library library = new Library("Library number 1");
        Book book1 = new Book("title1", "author1", LocalDate.now().minusYears(1));
        Book book2 = new Book("title2", "author2", LocalDate.now().minusYears(2));
        Book book3 = new Book("title3", "author3", LocalDate.now().minusYears(3));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //When
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library number 2");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library number 3");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book3);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, cloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepCloneLibrary.getBooks().size());
        Assert.assertNotEquals(library.getBooks(), deepCloneLibrary.getBooks());
    }
}
