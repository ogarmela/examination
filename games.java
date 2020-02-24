import java.util.Random;

public class games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random();
		 int height = 0;
		 int falls = 0;
		 while (height<6) {
			 int r = rand.nextInt(2);
			 // 50% chance the ant will fall ....
			 if (r==0) {
				 // ant fell
				 height = 0;
				 falls++;
			 } else {
				 // ant climbs a step
				 height++;
			 }
		 }
		 System.out.println("number of falls: " + falls);

				 
	}

}
