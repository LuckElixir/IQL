package personal.imperfectcoder0.iql.reader;

import personal.imperfectcoder0.iql.parser.Commands;
import jmatrix.matrix.Matrix;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.TreeSet;

public class InventoryReader extends Commands {
    private String readerText;
    private int width;
    private int height;
    private TreeSet<Inventory> idRow;
    private Matrix<Integer> values;

    public InventoryReader(String readerText) {

        this.readerText = readerText;
        readString();
    }

    public InventoryReader(int width, int height, TreeSet<Inventory> idRow, Matrix<Integer> values) {
        this.width = width;
        this.height = height;
        this.idRow = idRow;
        this.values = values;
        readValues();

    }

    public InventoryReader(Path inputFile) throws IOException {
        // todo add handling of Path
//        this.readerText = new BufferedReader(inputFile).read();
    }

    private void readString() {
        // The metadata containing rows at the start of the file "rXcL...."
        String[] metadata = this.readerText.split("L");
        this.width = Integer.parseInt(metadata[0].split("X")[1]);
        this.height = Integer.parseInt(metadata[0].split("X")[0]);
        // Anything after the metadata
        // Structured like this: (ID) \u0001 (index) \u001f (cell) \u001e (index) \u001f (cell) \u001e \u001d (ID)
        int iteration = 0;
        for (String columns : metadata[1].split("\u001d")) {
            this.idRow.add(new Inventory(Integer.parseInt(columns.split("\u0001")[0], 16)));
            for (String unit : columns.split("\u0001")[1].split("\u001e")) {
                this.values.put(iteration, Integer.parseInt(unit.split("\u001f")[0]),
                        Integer.parseInt(unit.split("\u001f")[1]));
            }
            iteration++;
        }

    }

    private void readValues() {


    }


    public void CREATE(List<String> subcommands) {
        subcommands.forEach((String t) -> {
            if (t.replaceFirst("^-+", "").contains("t")) {

            }
        });

    }


    public void DELETE(List<String> subcommands) {

    }
}
