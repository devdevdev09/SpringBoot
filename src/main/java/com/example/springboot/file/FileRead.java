package com.example.springboot.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.core.io.ClassPathResource;

public class FileRead {

    public static void main(String[] args) {
        FileRead read = new FileRead();

        List<String> fileContent = read.springFileRead();

        String jsonStr = read.listToString(fileContent);

        List<Object> jsonList = read.toListObject(jsonStr);

        for (Object obj : jsonList) {
            System.out.println("obj : " + obj);
        }
    }

    // Spring File Read
    public List<String> springFileRead(){
        // resources 아래 경로
        ClassPathResource resource = new ClassPathResource("data/json/test.json");
        List<String> content = null;

        try {
            Path path = Paths.get(resource.getURI());
            content = Files.readAllLines(path);

            // print content
            content.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        return content;
    }

    // List<String> To String
    public String listToString(List<String> list){
        String str = list.stream().map(n -> String.valueOf(n)).collect(Collectors.joining());
        return str;
    }
    
    // json String To List<Object>
    public List<Object> toListObject(String json){
        JsonParser jp = JsonParserFactory.getJsonParser();
        List<Object> js = jp.parseList(json);
        
        return js;
    }
}