package main.java;

import java.util.HashMap;

public class BuilderEventsHolder {
    private HashMap<String, BuilderEvent> builderEvents = new HashMap<String, BuilderEvent>();

    public void AddBuilderEvent(String name, String content){
        this.builderEvents.put(name, new BuilderEvent(name, content));
    }
}
