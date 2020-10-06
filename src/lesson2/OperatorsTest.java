package lesson2;

public class OperatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	x, y = 10;
		
		x = 10;
		y += 5;	// y = y + 5;
		x = y += 3;
		
		if (x > 0) {
			if (x > 0) { 
				x = 0;
			}
		} 
		else {
			
		}
		
		while (x-- > 0) {
		}
		
		do {
			
		} while (x > 0);
		
		for (int i = 0; i < 10; i++) {
			y = x*x+i;
		}
		
		int i = 0;
		while (i < 10) {
			y = x*x;
			i++;
		}
		
//		for (;;) {
//			
//		}
		
		int[]	z = null;
		
		int sum = 0;
		for (int item : z) {
			// ---
			sum += item;
		}
		
//		for (int i = 0; i < z.length; i++) {
//			int item = z[i];
//			// ---
//		}

		while (x-- > 0) {
			if (x == 3) {
				continue;
			}
		}

		for (int i = 0; i < 10; i++) {
			if (?????) {
				continue;
			}
		}
//		int i = 0;
//		while (i < 10) {
//			if (?????) {
//				goto L1;		
//			}
// L1:		i++;
//		}
		
//loop:	for (int x = ...) {
//			for (int y = ...) {
//				break loop;	//goto L1;
//			}
//		}
//L1:
//
//loop:	for (int x = ...  //goto://) {
//			for (int y = ...) {
//				continue loop;	// goto:
//			}
//		}
//L1:
		switch (x) {	// int
			case 0 :	//	case 0 -> y = 0;
				y = 0;
				break;
			case 1 :	//	case 1,2 -> y = 0;
			case 2 :
				y = 2;
				break;
			default :
				y = 3;
				break;
		}
		// return;
	}
}
