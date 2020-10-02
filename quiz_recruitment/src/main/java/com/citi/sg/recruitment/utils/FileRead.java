package com.citi.sg.recruitment.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

public class FileRead {

    public static byte[] getFile(String files) throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = null;

        try {
            // trying opening file from classpath
            URL resource = FileRead.class.getClassLoader().getResource(files);
            file = new File(resource.getPath());
        } catch (Exception ex) {
            sb.append(ex);
            try {
                // trying opening file directly
                file = new File(files);
            } catch (Exception ex2) {
                // trying opening file from
                sb.append(ex2);
            }
        }

        if (file == null) {
            throw new FileNotFoundException(sb.toString());
        }

        return Files.readAllBytes(file.toPath());
    }

}
