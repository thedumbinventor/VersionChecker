package com.example.versionchecker;

import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonProductReader {

    public static int pID() {
        int productName = 0;
        try (FileReader reader = new FileReader("product.json")) {
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject product = new JSONObject(tokener);

          productName = (int) product.getNumber("productVersionNumber");
            String productVersion = product.getString("productVersionName");

            System.out.println("Product Name: " + productName);
            System.out.println("Product Version: " + productVersion);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return productName;
    }

    public static void main(String[] args) {
        pID();
    }
}
