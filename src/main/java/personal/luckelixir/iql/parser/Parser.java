package personal.luckelixir.iql.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    private final String input;
    protected File currentFile;
    public Parser(String input) {
        this.input = input;
        parseInput();
    }

    public void parseInput() {
        ArrayList<String> subcommands = new ArrayList<>(List.of(input.split(" ")));
        String mainCommand = subcommands.get(0);
        if (mainCommand.equalsIgnoreCase("CREATE")) {
            //InventoryReader.CREATE(subcommands.subList(1, subcommands.size()));
        }
    }
}
