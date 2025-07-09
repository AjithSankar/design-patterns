package structural.composite;

// Composite is a structural design pattern that lets you compose objects into tree structures and
// then work with these structures as if they were individual objects.

public class Main {

    public static void main(String[] args) {

        Directory parentDir1 = new Directory();
        FileSystem fileObj1 = new File();
        parentDir1.add(fileObj1);

        Directory childDir = new Directory();
        FileSystem childFileObj = new File();
        childDir.add(childFileObj);

        parentDir1.add(childDir);
        parentDir1.ls();


    }
}
