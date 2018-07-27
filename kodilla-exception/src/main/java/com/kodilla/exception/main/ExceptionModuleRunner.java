package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        System.out.println("----------task 8.3.1----------");
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        System.out.println("----------task 8.3.2----------");
        FileReaderWithoutHandling fileReader2 = new FileReaderWithoutHandling();
        try {
            fileReader2.readFile();
        } catch (IOException e) {
            System.out.println("Ups sth went wrong!, Error:" + e);
        }

        System.out.println("----------task 8.3.3----------");
        ExceptionHandling exceptionHandling = new ExceptionHandling(new SecondChallenge());
        System.out.println(exceptionHandling.test(2.0, 1.0));
    }
}
