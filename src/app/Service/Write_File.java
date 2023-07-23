package app.Service;

import app.util.Constants;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;

public class Write_File {

public String getWriteFile(String fileName){
    try {
        Path file = Path.of(Constants.BASE_PATH_IN + fileName + ".txt");
        Files.createFile(file);
        return "Файл створено. ";
    }catch (IOException e) {
        return"Такий файл існує. " + e.getMessage();
      }
    }
}
