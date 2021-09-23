class Cycle{
String name;
String color;
int noOfTyres;
void Speed(){
System.out.println(color+" "+name+" goes in high speed");
}
void Brake(){
System.out.println(color+" "+name+" has brake to stop");
}
public static void main(String[] args){
Cycle Hero=new Cycle();
Hero.name="Hero";
Hero.color="Red";
Hero.noOfTyres=2;
Hero.Speed();
Hero.Brake();
}
}