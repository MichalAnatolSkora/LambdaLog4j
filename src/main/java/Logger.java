package main.java;

import java.util.function.Function;

public class Logger {
    private String name;

    public Logger(String name) {
        this.name = name;
        // use Log4j at this level
    }

    public void Log(Function<LevelLogsBuilder, LogsBuilder> func) {
        LogsBuilder firstBuilder = new LogsBuilder();
        LogsBuilder builder = func.apply(firstBuilder);
        builder.Generate(); // TODO Log it with log4j
    }
}