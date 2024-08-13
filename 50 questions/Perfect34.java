import java.util.*;
class Perfect34{		

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number: ");
int r=sc.nextInt();

boolean av = perfect(r);
System.out.println("prefect "+av);



}
public static int digisum(int r){
int i=1, t =n, sum=0,cnt=0;

while(i<=(r/2)){

if(r%i==0)
sum +=sum+i;

n/=10;
}
 return sum==t ? "true" :"false";
}
}
