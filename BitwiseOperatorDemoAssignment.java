class BitwiseOperatorDemoAssignment{
public static void main(String[] args){
int p=44;
int q=20;
System.out.println(p<q && ++p<q);
System.out.println("P: " +p);
System.out.println(p>=q & ++p<q);
System.out.println("P: " +p);
System.out.println(p!=q || q++!=p);
System.out.println("q: " +q);
System.out.println(p>=q | q!=p);
System.out.println("q: " +q);
}
}