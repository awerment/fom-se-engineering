package dev.sprinten.visitor;

import dev.sprinten.dir.Directory;
import dev.sprinten.dir.File;

public class CountingVisitor implements Visitor {

    private int fileCount;
    private int dirCount;

    public CountingVisitor() {
        this.fileCount = 0;
        this.dirCount = 0;
    }

    @Override
    public void visit(Directory dir) {
        this.dirCount++;
    }

    @Override
    public void visit(File file) {
        this.fileCount ++;
    }

    @Override
    public void printReport() {
        System.out.println("Counted " + fileCount + " files in " + dirCount + " directories.");
    }
}
