package com.zensar.core;

import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.util.Base64;

public class FileToBase64Convertor {

    public static void main(String[] args) {
        String filePath = args[0];
        final String data = encoder(filePath + args[1]);
        System.out.println(data);
        System.out.println(decoder(filePath + args[2], data));


    }

    public static String decoder(final String filePath, final String data){
        final File file = new File(filePath);

        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(file));
            outputStream.write(DatatypeConverter.parseBase64Binary(data));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return file.getName();
    }

    public static String encoder(String filePath) {
        String base64File = "";
        File file = new File(filePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a file from file system
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            base64File = Base64.getEncoder().encodeToString(fileData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the file " + ioe);
        }
        return base64File;
    }
}
