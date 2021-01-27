package dev.sprinten.visitor;

import dev.sprinten.dir.Directory;
import dev.sprinten.dir.File;

public interface Visitor {
    void visit(Directory dir);
    void visit(File file);
    void printReport();
}
