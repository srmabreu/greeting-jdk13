package com.features;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;

public class FileSystemsNewMethod {

    public static void main(String[] args) throws IOException {
        FileSystems.newFileSystem(Path.of(""));

        FileSystems.newFileSystem(Path.of(""), new HashMap<>());

        FileSystems.newFileSystem(Path.of(""), new HashMap<>(), null);
    }

}
