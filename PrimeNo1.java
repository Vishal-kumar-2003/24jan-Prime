
public class PrimeNo1 {

	public static void main(String[] args) {
		
		int num = 35,counter=0;
		for(int x=num;x>=1;x--) {
			if (num% x ==0) counter++;
		}
if (counter == 2)System.out.println("yes it is prime ");
else System.out.println("not a prime ");
	}

}
