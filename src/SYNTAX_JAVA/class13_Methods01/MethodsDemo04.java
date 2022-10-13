package SYNTAX_JAVA.class13_Methods01;

public class MethodsDemo04 {
    boolean mystery(){
        return true;
    }

    String mystery2(int num){
        return "Java";
    }
    String method(String word){
        //return "Java";
        if(word.equals("Java")){
            return "python";
        }else
        {
            return "Java";
        }

    }
    public static void main(String[] args) {
        MethodsDemo04 methodsDemo4=new MethodsDemo04();
        System.out.println(methodsDemo4.mystery());
        System.out.println(methodsDemo4.mystery2(10));
        System.out.println(methodsDemo4.method("python"));
    }
}


