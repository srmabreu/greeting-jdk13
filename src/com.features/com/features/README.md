## Reimplement the Legacy Socket API
The underlying implementation of the java.net.Socket and java.net.ServerSocket APIs have been rewritten. The new implementation, NioSocketImpl, is a drop-in replacement for PlainSocketImpl.

## Dynamic CDS Archive
This JEP extends the class-data sharing feature, which was introduced in Java 10

$ java -XX:ArchiveClassesAtExit=my_app_cds.jsa -cp my_app.jar

$ java -XX:SharedArchiveFile=my_app_cds.jsa -cp my_app.jar

## ZGC: Uncommit Unused Memory
This JEP has enhanced ZGC to return unused heap memory to the operating system. The Z Garbage Collector was introduced in Java 11.