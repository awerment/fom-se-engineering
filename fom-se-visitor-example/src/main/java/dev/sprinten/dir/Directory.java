package dev.sprinten.dir;

import dev.sprinten.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemElement {

    protected List<FileSystemElement> children = new ArrayList<>();

    public Directory(String name) {
        super();
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        this.children.forEach(c -> c.accept(visitor));
    }

    @Override
    public List<FileSystemElement> getChildren() {
        return children;
    }

    @Override
    public FileSystemElement getChild(int index) {
        return children.get(0);
    }

    @Override
    public void addChild(FileSystemElement child) {
        child.setParent(this);
        children.add(child);
    }

    @Override
    public void removeChild(FileSystemElement child) {
        child.setParent(null);
        children.remove(child);
    }
}
