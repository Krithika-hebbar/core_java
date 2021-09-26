class UnaryOperatorDemoAssignment{
public static void main(String[] args){
  int x=100;
  int y=++x;
  int z=y++;
  System.out.println(++z);

  int i=55;
  i++;
  int j=++i;
  int k=j--;
  System.out.println(--k);

  int m=35;
  m--;
 --m;
 int n=m;
 System.out.println(++n);
}
}