package dev.sprinten.dir;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class FileSystemElement {

    protected FileSystemElement parent;

    protected String name;

    public abstract List<FileSystemElement> getChildren();

    public abstract FileSystemElement getChild(int index);

    public abstract void addChild(FileSystemElement child);

    public abstract void removeChild(FileSystemElement child);

    public String getFullPath() {
        String path = Stream.concat(getParentChain().stream(), Stream.of(this))
                .map(FileSystemElement::getName)
                .collect(Collectors.joining("/"));
        return "".equals(path) ? "/" : path;
    }

    public void move(FileSystemElement newParent) {
        if (this.parent != null) {
            this.parent.removeChild(this);
        }
        newParent.addChild(this);
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    protected FileSystemElement getParent() {
        return parent;
    }

    protected void setParent(FileSystemElement parent) {
        this.parent = parent;
    }

    protected List<FileSystemElement> getParentChain() {
        List<FileSystemElement> chain = new ArrayList<>();
        FileSystemElement parent = this.parent;
        while (parent != null) {
            chain.add(0, parent);
            parent = parent.getParent();
        }
        return chain;
    }

}
