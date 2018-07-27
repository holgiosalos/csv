package com.holmes.csv;

import java.io.File;
import java.io.IOException;
import org.simpleflatmapper.csv.CsvParser;

/**
 * @author Holmes Salazar
 */
public class CSVProcessor {

  private ClassLoader classLoader = getClass().getClassLoader();

  public void processFile(String fileName) throws IOException {

    File csvFile = new File(classLoader.getResource(fileName).getFile());

    CsvParser
        .mapTo(Table.class).forEach(csvFile, System.out::println);
  }

  public static void main(String[] args) throws IOException {
    new CSVProcessor().processFile("test1.csv");
    new CSVProcessor().processFile("test2.csv");
  }
}
