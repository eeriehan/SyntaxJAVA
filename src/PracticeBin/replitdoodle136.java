package PracticeBin;

class replitdoodle136 {
    private void method1(){
        System.out.println("private");
    }
    void method2(){
        System.out.println("default");
    }
    protected void method3(){
        System.out.println("protected");
    }
    public void method4(){
        System.out.println("public");
    }}

class Main{
    public static void main(String[] args) {


        replitdoodle136 output = new replitdoodle136();
      //  output.method1();
        output.method2();
        output.method3();
        output.method4();
    }
    }

