class Refridgerator{
String name;
String color;
int price;
void cool(){
System.out.println(color+" "+name+ "has capacity to cool");
}
void store(){
System.out.println(color+" "+name+ "has capacity to store");
}
public static void main(String[] args){
Refridgerator Whirlpool=new Refridgerator();
Whirlpool.name="Whirlpool";
Whirlpool.color="Gray";
Whirlpool.price=25000;
Whirlpool.cool();
Whirlpool.store();
}
}
