package com.theironyard.clt;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Firearms boom = new Firearms();
        Scanner scanner = new Scanner(System.in);
        System.out.println("thank you for choosing the Firearms Registration System.");
        System.out.println("Please enter the type of weapon you are registering.");
        boom.type = scanner.nextLine();
        System.out.println("Please enter the caliber.");
        boom.caliber = Double.valueOf(scanner.nextLine());
        System.out.println("Please enter the action of your weapon.");
        boom.action = scanner.nextLine();
        System.out.println("please enter the bore type.");
        boom.bore = scanner.nextLine();
        System.out.println("please enter the year your firearm was originally manufactured.");
        boom.year = scanner.nextInt();

        File file = new File("Guns.json");
        if (file == null) {
            JsonSerializer serializer = new JsonSerializer();
            String json = serializer.serialize(boom);
            FileWriter fw = new FileWriter(file);
            fw.write(json);
            fw.close();
        }else {
            System.out.println("Sorry but the file is full.");
        }

        Scanner s = new Scanner(file);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        boom = parser.parse(contents, Firearms.class);

        System.out.println(boom);

    }
}
