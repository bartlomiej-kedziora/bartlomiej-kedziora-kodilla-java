package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

        FileReaderWithoutHandling fileReader2 = new FileReaderWithoutHandling();
        try {
            fileReader2.readFile();
        } catch (IOException e) {
            System.out.println("Ups sth went wrong!, Error:" + e);
        }

    }
}
