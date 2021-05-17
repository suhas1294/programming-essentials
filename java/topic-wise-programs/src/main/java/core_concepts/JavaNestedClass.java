package core_concepts;

class JavaNestedClass {
    InsideClass insideClass;
    String msg;
    public JavaNestedClass(String msg){
        this.msg = msg;
        new InsideClass(msg);
    }
    class InsideClass{
        InsideClass insideClass;
        public InsideClass(String msg){
            System.out.println("Inner most class constructor" + msg);
        }
    }

    public static void main(String[] args) {
        new JavaNestedClass("jkd");
    }

}
