public class ExcptionalHandling {
public static void main(String[] args) {
// TODO Auto-generated method stub
try {
int r,a=12,b=0;
r=a/b;
System.out.println("Answer:
+r);
}
catch (Exception e){
System.out.println("Error: Cannot divide by zero.");
}
finally{
System.out.println("Finally block executed");
}
}
/*
Output:-
Error: Cannot divide by zero
Finally block executed
*/
