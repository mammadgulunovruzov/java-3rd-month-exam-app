package org.example.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    public static byte[] readFile(String fileName) throws  Exception{
        Path path = Paths.get(fileName);
        return Files.readAllBytes(path);

    }
    public static void writeFile(byte[] bytes, String fileName) throws Exception{

        Path path = Paths.get(fileName);
        Files.write(path, bytes);

    }


}
