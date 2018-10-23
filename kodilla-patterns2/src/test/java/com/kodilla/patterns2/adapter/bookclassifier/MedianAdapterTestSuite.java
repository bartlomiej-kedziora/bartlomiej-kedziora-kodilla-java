package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("author1", "title1", 2001, "signature1"));
        books.add(new Book("author2", "title2", 2002, "signature2"));
        books.add(new Book("author3", "title3", 2003, "signature3"));
        books.add(new Book("author4", "title4", 2004, "signature4"));
        books.add(new Book("author5", "title5", 2005, "signature5"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        System.out.println(median);
        assertEquals(2003, median);
    }
}
