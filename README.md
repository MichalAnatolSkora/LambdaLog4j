
# Lambda Log4j

## Getting Started

```
        Logger logger = new Logger(getClass().getName());
        logger.Log(e -> e.Info()
                .Technical()
                .Message("Created trigger")
                .Field("Method", "testMessage"));
```