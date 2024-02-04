package personal.imperfectcoder0.iql.parser;

import java.util.List;

public abstract class Commands {
    public abstract void CREATE(List<String> subcommands);
    public abstract void DELETE(List<String> subcommands);

}
