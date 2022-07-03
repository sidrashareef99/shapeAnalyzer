/**
 * <Sidra Shareef>
 * CPS142 – Spring 2022
 * 1/20/2022
 * Instructor: Adam Divelbiss
 * Assignment: Program02
 * Purpose: <Different shape names are being read from a file and a report including the largest and smallest volumes and surface areas is produced.>
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final String SHAPE_FILE = "shapes.csv";

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Shape> shapes = loadData();


        /**
         *
         * the select method is implemented to calculate minVolume,minSurface, maxVolume and maxSurface.
         * @param a
         * @param b
         * @return a
         * @return b
         */
        ShapeSelector minVolume = (a, b) -> {
            double min = Math.min(a.volume(), b.volume());
            if (a.volume() == min) {
                return a;
            } else {
                return b;
            }
        };


        ShapeSelector maxVolume = (a, b) -> {
            double max = Math.max(a.volume(), b.volume());
            if (a.volume() == max) {
                return a;
            } else {
                return b;
            }
        };


        ShapeSelector minSurface = (a, b) -> {
            double min = Math.min(a.surface(), b.surface());
            if (a.surface() == min) {
                return a;
            } else {
                return b;
            }
        };

        ShapeSelector maxSurface = (a, b) -> {
            double max = Math.max(a.surface(), b.surface());
            if (a.surface() == max) {
                return a;
            } else {
                return b;
            }
        };


        ShapeArrayReducer shapeArrayReducer = new ShapeArrayReducer() {
            @Override
            public Shape reduce(ArrayList<Shape> shapesArray, ShapeSelector shapeSelector) {
                Shape selectedShape = shapesArray.get(0);
                for (Shape shape : shapesArray) {
                    selectedShape = shapeSelector.select(selectedShape, shape);
                }
                return selectedShape;
            }
        };

        /**
         * a formatted report is printed
         */
        System.out.println("Shape Analyzer 1.0");
        System.out.println();
        System.out.printf("Shapes analyzed: %,d\n", shapes.size());
        System.out.println();
        System.out.printf("Smallest Volume:\n%s\n\n", shapeArrayReducer.reduce(shapes, minVolume));
        System.out.printf("Largest Volume:\n%s\n\n", shapeArrayReducer.reduce(shapes, maxVolume));
        System.out.printf("Smallest Surface Area:\n%s\n\n", shapeArrayReducer.reduce(shapes, minSurface));
        System.out.printf("Largest Surface Area:\n%s\n\n", shapeArrayReducer.reduce(shapes, maxSurface));

        System.out.println("End report");
    }


    /**
     * read in file and create array of all the shapes
     *
     * @return shapes array
     * @throws FileNotFoundException
     */
    public static ArrayList<Shape> loadData() throws FileNotFoundException {

        ArrayList<Shape> shapes = new ArrayList<>();


        File shapeFile = new File(SHAPE_FILE);

        if (!shapeFile.exists()) {
            throw new FileNotFoundException();
        }

        Scanner myReader = new Scanner(shapeFile);

        while (myReader.hasNextLine()) {
            String shapeLine = myReader.nextLine();
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape = ShapeFactory.create(shapeLine);
            shapes.add(shape);

        }


        return shapes;
    }


}