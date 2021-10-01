class NumberDigit{
public static void main(String[] args){
int number=13;
if(number>=0 && number<=9){
System.out.println("one digit number");
} 
if(number>=10 && number<=99){
System.out.println("two digit number");
}
if(number>=100 && number<=999){
System.out.println("three digit number");
}
if(number>=1000 && number<=9999){
System.out.println("four digit number");
}
if(number>=10000 && number<=99999){
System.out.println("five digit number");
}
if(number>=100000){
System.out.println("more than 5 digit");
}
}
}