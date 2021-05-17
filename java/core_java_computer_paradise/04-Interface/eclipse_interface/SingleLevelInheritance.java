package _7interface;
class ParentCls {
  public int add(int a, int b) {
    return a + b;
  }
}
class ChildCls extends ParentCls {
  public int sub(int a, int b) {
    return a - b;
  }
}
public class SingleLevelInheritance {
  public static void main(String[] args) {
    int a = 10, b = 20;
    int sum = 0, diff = 0;
    ChildCls chObj = new ChildCls();
    sum = chObj.add(a, b);
    diff = chObj.sub(a, b);
    System.out.println("sum " + sum);
    System.out.println("Diff " + diff);
  }
}