package fileHandling;

import javafx.application.Application;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FileHandlingForDMV {
    public static void main(String[] args) {
        FileHandlingForDMV fileHandlingForDMV = new FileHandlingForDMV();
        fileHandlingForDMV.foo("file/OUT.TXT");
    }

    private void foo(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);

        File file;
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            file = new File(resource.getFile());
        }


        List<String> validLines = new ArrayList<>();
        List<String> invalidLines = new ArrayList<>();

//        FileInputStream fis = new FileInputStream("test.txt");
//        InputStreamReader isr = new InputStreamReader(fis, "UTF8");
//        InputStreamReader defaultReader = new InputStreamReader(fis);
//        String defaultEncoding = defaultReader.getEncoding();

        FileInputStream in1 = null;
        try {
            in1 = new FileInputStream(file.getAbsoluteFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        InputStreamReader in = null;
        try {
            in = new InputStreamReader(in1, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        System.out.println("##########################" + in.getEncoding());

        try (BufferedReader br = new BufferedReader(in)) {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsoluteFile())))) {
            String line;


            while ((line = br.readLine()) != null) {
                String ret = line.replaceAll("[^\\w]", StringUtils.SPACE);

                if (ret.startsWith("BB225")) {
                    if (ret.length() != 165) {
                        validLines.add(ret);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        invalidLines.add(ret);
                    }
                } else {
                    String lastLine = validLines.get(validLines.size() - 1);

                    String newLastLine = lastLine.concat(StringUtils.SPACE).concat(ret);
                    validLines.remove(validLines.size() - 1);
                    validLines.add(newLastLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        validLines.stream().forEach(System.out::println);
        invalidLines.stream().forEach(System.out::println);

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            in1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
