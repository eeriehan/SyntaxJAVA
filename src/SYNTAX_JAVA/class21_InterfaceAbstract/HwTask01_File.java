package SYNTAX_JAVA.class21_InterfaceAbstract;
/*
Create 3 subclasses: JavaFile, WordFile, PdfFile    that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text, to open .doc file we need
Microsoft Word to be installed etc
 */
abstract class HwTask01_File {
    abstract void open(); //abstract methods don't need {} just ;
    void edit(){
        System.out.println("Edit the file");
    }
    void close(){
        System.out.println("Close the file");
    }
}
class JavaFile extends HwTask01_File {
    @Override
    void open(){
        System.out.println("Notepad++ not found");
    }
}
class WordFile extends HwTask01_File {
    @Override
    void open(){
        System.out.println("Ms-Word not found");
    }
}
class PdfFile extends HwTask01_File {
    @Override
    void open(){
        System.out.println("User brain not found");
    }
}
 class FileExe_Test{
    public static void main(String[] args) {
        HwTask01_File[] browsers = {new JavaFile(), new WordFile(), new PdfFile()};
        for(HwTask01_File x: browsers){
            x.open();
        }
    }
}