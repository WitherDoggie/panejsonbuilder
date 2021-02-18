package io.github.witherdoggie.panejsonbuilder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        writeJsons(args);
    }

    private static void writeJsons(String [] args) throws FileNotFoundException {

        for(int i = 0; i < args.length; i+=2){
            writePost(args[i], args[i+1]);
            writeNoSide(args[i], args[i+1]);
            writeNoSideAlt(args[i], args[i+1]);
            writeSide(args[i], args[i+1]);
            writeSideAlt(args[i], args[i+1]);
        }
    }

    private static void writePost(String name, String texturePath) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(name + "_pane_post.json");
        writer.println("{");
        writer.println("\t" + "\"parent\":" + "\"minecraft:block/template_glass_pane_post\"" + ",");
        writer.println("\t " + "\"textures\": {");
        writer.println("\t\t " + "\"pane\" : " + "\"" + texturePath + "\",");
        writer.println("\t\t " + "\"edge\" : " + "\"" + texturePath + "\"");
        writer.println("\t}");
        writer.println("}");

        writer.close();
    }

    private static void writeNoSide(String name, String texturePath) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(name + "_pane_noside.json");
        writer.println("{");
        writer.println("\t" + "\"parent\":" + "\"minecraft:block/template_glass_pane_noside\"" + ",");
        writer.println("\t " + "\"textures\": {");
        writer.println("\t\t " + "\"pane\" : " + "\"" + texturePath + "\"");
        writer.println("\t}");
        writer.println("}");

        writer.close();
    }

    private static void writeNoSideAlt(String name, String texturePath) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(name + "_pane_noside_alt.json");
        writer.println("{");
        writer.println("\t" + "\"parent\":" + "\"minecraft:block/template_glass_pane_noside_alt\"" + ",");
        writer.println("\t " + "\"textures\": {");
        writer.println("\t\t " + "\"pane\" : " + "\"" + texturePath + "\"");
        writer.println("\t}");
        writer.println("}");

        writer.close();
    }

    private static void writeSide(String name, String texturePath) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(name + "_pane_side.json");
        writer.println("{");
        writer.println("\t" + "\"parent\":" + "\"minecraft:block/template_glass_pane_side\"" + ",");
        writer.println("\t " + "\"textures\": {");
        writer.println("\t\t " + "\"pane\" : " + "\"" + texturePath + "\",");
        writer.println("\t\t " + "\"edge\" : " + "\"" + texturePath + "\"");
        writer.println("\t}");
        writer.println("}");

        writer.close();
    }

    private static void writeSideAlt(String name, String texturePath) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(name + "_pane_side_alt.json");
        writer.println("{");
        writer.println("\t" + "\"parent\":" + "\"minecraft:block/template_glass_pane_side_alt\"" + ",");
        writer.println("\t " + "\"textures\": {");
        writer.println("\t\t " + "\"pane\" : " + "\"" + texturePath + "\",");
        writer.println("\t\t " + "\"edge\" : " + "\"" + texturePath + "\"");
        writer.println("\t}");
        writer.println("}");

        writer.close();
    }
}
