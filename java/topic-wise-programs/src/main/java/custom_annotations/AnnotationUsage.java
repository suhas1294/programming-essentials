package custom_annotations;

@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        createdBy = "",
        tags = {"sales", "test"},
        lastModified = "today"
)
public class AnnotationUsage {
    @Test
    public void testOne(){
        if (true){
            throw new RuntimeException("This test always failed");
        }
    }

    @Test(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

    @Deprecated
    String helloWorld(){
        return "hello";
    }

    @MyAnnotation(value = 10)
    public void anotherMethod(){
        String b = new AnnotationUsage().helloWorld();
    }

    public static void main(String[] args) {
        String a = new AnnotationUsage().helloWorld();

        System.out.println(a);
    }
}

@interface MyAnnotation{
    int value() default 0;
}