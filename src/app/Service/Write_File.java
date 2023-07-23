package app.Service;

import app.util.Constants;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Write_File {

public String getWriteFile(String fileName){
    try {
        Path file = Path.of(Constants.BASE_PATH_IN + fileName);
        Files.createFile(file);
        return "Файл створено. ";
    }catch (IOException e) {
        return"Такий файл існує. " + e.getMessage();
      }
    }

    public String getWriteContent(ArrayList<String> list, String fileName){
    Path file = Path.of(Constants.BASE_PATH_IN + fileName);
    try {
        String content = String.join("\n",list);
        byte[] text = content.getBytes();
        Files.write(file, text);
        return "Данні записані у файл";
    }catch  (IOException e) {
        return "Помилка запису " + e.getMessage();
    }
    }
}
