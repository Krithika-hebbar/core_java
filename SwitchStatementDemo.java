class SwitchStatementDemo{
public static void main(String[] args){
char symbol='+';
switch(symbol){
case '+':System.out.println("Addition");
break;
case '-':System.out.println("Subtraction");
break;
case '*':System.out.println("Multiplication");
break;
case '/':System.out.println("Division");
break;
case '%':System.out.println("Modulus");
break;
default:System.out.println("Invalid Symbol");
break;
}
}
}