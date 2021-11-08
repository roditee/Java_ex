package Loop;

public class ex13 {

	public static void main(String[] args) {
//		###
//		###
//		###
		for (int i=1; i<10; i++) {
			System.out.print("#");
			if(i%3==0) System.out.println();
		}
		
		System.out.println();
		
//		###
//		###
//		###
		for (int i=0; i<3; i++ ) {
			for (int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		#
//		##
//		###
		for (int i=0; i<3; i++ ) {
			for (int j=0; j<i+1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		  #
//		 ##
//		###
		for (int i=0; i<=3; i++ ) {
			for (int j=3; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		###
//		##
//		#
		for (int i=1; i<=3; i++ ) {
			for (int j=3; j>=i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		###
//		##
//		#
		for (int i=0; i<3; i++ ) {
			for (int j=2; j>=i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		###
//		 ##
//		  #
		for (int i=1; i<=3; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=3; j>=i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		@##
//		@@#
//		@@@
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) { System.out.print("@"); }
			for (int j=3; j>i; j--) { System.out.print("#"); }
			System.out.println();
		}
		
		System.out.println();
		
//		  #
//		 ###
//		#####
		for (int i=1; i<=3; i++) {
			for (int j=3; j>i; j--) { System.out.print(" "); }
			for (int j=1; j<=(2*i)-1; j++) { System.out.print("#"); }
			System.out.println();
		}
		
		System.out.println();
		
//		#####
//		 ###
//		  #
		for (int i=1; i<=3; i++) {
			for (int j=1; j<i; j++) { System.out.print(" "); }
			for (int j=5; j>=(2*i)-1; j--) { System.out.print("#"); }
			System.out.println();
		}
		
		System.out.println();
	}
}