package dev.sprinten.visitor;

import dev.sprinten.dir.Directory;
import dev.sprinten.dir.File;
import dev.sprinten.dir.FileSystemElement;

import java.util.ArrayList;
import java.util.List;

public class SearchingVisitor implements Visitor {

    private final String searchPattern;
    private final List<FileSystemElement> matching = new ArrayList<>();

    public SearchingVisitor(String searchPattern) {
        this.searchPattern = searchPattern;
    }

    @Override
    public void visit(Directory dir){
        if (dir.getName().matches(this.searchPattern)) {
            matching.add(dir);
        }
    }

    @Override
    public void visit(File file) {
        if (file.getName().matches(this.searchPattern)) {
            matching.add(file);
        }
    }

    @Override
    public void printReport() {
        System.out.println("Found " + matching.size() + " file(s):");
        matching.forEach(m -> System.out.println("  " + m.getFullPath()));
    }
}
