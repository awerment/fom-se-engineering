package dev.sprinten;

import dev.sprinten.dir.Directory;
import dev.sprinten.dir.File;
import dev.sprinten.dir.FileSystemElement;

public class App {
    public static void main(String[] args) {
        FileSystemElement root = new Directory("");

        FileSystemElement dev = new Directory("dev");
        root.addChild(dev);

        FileSystemElement docs = new Directory("docs");
        FileSystemElement headFirst = new File("head-first.pdf");
        dev.addChild(headFirst);
        dev.addChild(docs);

        FileSystemElement bin = new Directory("bin");
        FileSystemElement java = new File("java");
        bin.addChild(java);
        root.addChild(bin);

        System.out.println("# Initial");
        assertAndPrint("/", root.getFullPath());
        assertAndPrint("/dev", dev.getFullPath());
        assertAndPrint("/dev/docs", docs.getFullPath());
        assertAndPrint("/bin/java", java.getFullPath());
        assertAndPrint("/dev/head-first.pdf", headFirst.getFullPath());

        System.out.println();
        System.out.println("# move a file");
        headFirst.move(docs);
        assertAndPrint("/dev/docs/head-first.pdf", headFirst.getFullPath());

        System.out.println();
        System.out.println("# rename a file");
        headFirst.rename("head-first-design-patterns.pdf");
        assertAndPrint("/dev/docs/head-first-design-patterns.pdf", headFirst.getFullPath());

        System.out.println();
        System.out.println("# rename a directory");
        docs.rename("books");
        assertAndPrint("/dev/books", docs.getFullPath());

        System.out.println();
        System.out.println("# move a directory");
        bin.move(dev);
        assertAndPrint("/dev/bin/java", java.getFullPath());
    }

    private static void assertAndPrint(Object expected, Object actual) {
        boolean equals = expected.equals(actual);
        if (!equals) {
            System.out.println("ERROR: " + actual + " does not match expected value\n       " + expected);
        } else {
            System.out.println("OK: " + actual + " matches expected value\n    " + expected);
        }
    }
}
