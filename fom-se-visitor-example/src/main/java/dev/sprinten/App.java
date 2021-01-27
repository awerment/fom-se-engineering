package dev.sprinten;

import dev.sprinten.dir.Directory;
import dev.sprinten.dir.File;
import dev.sprinten.dir.FileSystemElement;
import dev.sprinten.visitor.CountingVisitor;
import dev.sprinten.visitor.SearchingVisitor;
import dev.sprinten.visitor.Visitor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
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

        Visitor counter = new CountingVisitor();
        root.accept(counter);
        counter.printReport();

        Visitor searcher = new SearchingVisitor("d.*");
        root.accept(searcher);
        searcher.printReport();
    }
}
