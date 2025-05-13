import java.util.*;
public class hammingDistance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first value : ");
		a=sc.nextInt();
		System.out.println("Enter the second value : ");
		b=sc.nextInt();
		int res=a^b;
		int count=0;
		while(res>0) {
			int res1=res&1;
			res=res>>1;
			if(res1==1)
				count+=1;
		}	
		System.out.println("The hamming distance is "+count);
	}
}


// public class hammingdistance {
//     public static void main(String[] args) {
//         int n=5;
//         int mask=1;
//         int counter=0;
//          for(int i=0;i<12;i++){
//             if((n&mask)==0){
//                 counter++;
//             }
//             mask=mask<<1;
//          }
//     }
//     system.out.println(counter);
    
// }
