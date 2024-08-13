import java.util.*;
class Table_N26{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number range: ");
int r=sc.nextInt();


int j=1;
while(j<=r)
{

int i=1;
while(i<=10){

System.out.println(j+"*"+i+"="+j*i);
i++;


}
System.out.println("\n\n\n ");
j++;
}
}
}
