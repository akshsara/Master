
package class2;

class Hello{
int a,b;

void Addition()
{
    System.out.print("Output is=");
    System.out.println(b+a);
}
}
  public class Class2 {
    public static void main(String[] args) {
        Hello obj= new Hello();
        
        obj.a=10;
        obj.b=20;
        
        obj.Addition();
        
    }
    
}
