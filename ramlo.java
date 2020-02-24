
public class ramlo {

	static boolean isPowerOfTwo(int number){
		boolean isPowerOfTwo = true;
		int reminder = 0;
		while(number > 1){
		reminder = number % 2;
		if(reminder != 0){
		isPowerOfTwo = false;
		break;
		}else{
		number = number / 2;
		}
		}
		return isPowerOfTwo;
		}

	}


