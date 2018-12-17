package main.java;

public interface LevelLogsBuilder {
    ContextLogsBuilder Info();
    ContextLogsBuilder Warning();
    ContextLogsBuilder Error();
}
