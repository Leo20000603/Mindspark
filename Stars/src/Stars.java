
public class Stars {
	
	public static void rectangle(int lines){
		//*****		5
		//*****
		//*****
		//*****
		//*****
	}
	
	public static void triangle(int lines){
		//  *     3
		// ***
		//*****
		for(int i = 0;i<lines;i++){
			for(int j = 0;j<lines-i-1;j++){
				System.out.print(" ");
			}
			for(int j = 0; j<i*2+1;j++){
				System.out.print("*");
			}
			for(int j = 0;j<lines-i-1;j++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void stairs(int lines){
		//*     4
		//**
		//***
		//****
		for(int i = 0;i<lines;i++){
			for(int j = 0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
	public static void upsideDownTriangle(int lines){
		//*****		3
		// ***
		//  *
		for(int i = 0;i<lines;i++){
			for(int j = 0; j<i;j++){
				System.out.print(" ");
			}
			for(int j = 0;j<(lines-i)*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void sidewaysTriangle(int lines){
		//*		3
		//**
		//***
		//***
		//**
		//*
		stairs(lines);
		for(int i = 0; i<lines;i++){
			for(int j = 0; j<lines-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void diamond(int lines){
		//  *		3		* 		4
		// ***			   ***
		//*****			  *****
		// ***			  *****
		//  *			   ***
		//					*
	}
	
	public static void trapezoid(int lines, int lenTop){
		//  ****	3,4
		// ******
		//********
	}
	
	
	/*
	 * OPTIONAL AFTER THIS COMMENTS
	 */
	public static void christmasTree(int lines){
		//    *		3
		//   ***
		//  *****
		//   ***
		//  *****
		// *******
		//	 ***
		//  *****
		//*********
		//	 ***
		//	 ***
		//   ***				
	}
	
	public static void castle(int lines){
		//  *    *    *  	5
		// ***  ***  ***
		//***************
		//***************
		//***************
		
	}
}
