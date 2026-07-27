import java.util.*;
class calculator {
    int a;
    int b;
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    float div(){
        return a/b;
    }
}
class calculatordemo{
public static void main(){
    Scanner sc=new Scanner(System.in);
    calculator c1=new calculator();
    int result,c;
    System.out.println("Arithematic operation");
    System.out.println("----------------");
    System.out.println("1.Addition");
    System.out.println("2.Substracton");
    System.out.println();
    System.out.print("Enter your Choice:");
    c=sc.nextInt();
    System.out.print("Enter the First Number:");
    c1.a=sc.nextInt();
    System.out.print("Enter the Second Number:");
    c1.b=sc.nextInt();

    switch (c) {
        case 1:
            result=c1.add();
            System.out.println("Sum:"+result);
            break;
        case 2:
            result=c1.sub();    
            System.out.println("Difference:"+result);
            break;
        case 3:
            result=c1.mul();
            System.out.println("Product:"+result);
            break;
        case 4:
            float re=c1.div();
            System.out.println("Quotient:"+re);
            break;
        default:System.out.println("Invalid Choice");
            break;
    }
}
}
