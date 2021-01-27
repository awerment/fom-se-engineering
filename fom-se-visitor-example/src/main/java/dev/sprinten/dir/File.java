package dev.sprinten.dir;

import dev.sprinten.visitor.Visitor;

import java.util.List;

public class File extends FileSystemElement {

    public File(String name) {
        super();
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public List<FileSystemElement> getChildren() {
        return List.of();
    }

    @Override
    public FileSystemElement getChild(int index) {
        return null;
    }

    @Override
    public void addChild(FileSystemElement child) {
    }

    @Override
    public void removeChild(FileSystemElement child) {
    }
}
