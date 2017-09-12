import java.util.Scanner;

public class StarsTester {
	
	public static void test(String s, int lines, int length){
		if(s.equals("stairs")){
			Stars.stairs(lines);
		}else if(s.equals("rectangle")){
			Stars.rectangle(lines);
		}else if(s.equals("triangle")){
			Stars.triangle(lines);
		}else if(s.equals("upsideDownTriangle")){
			Stars.upsideDownTriangle(lines);
		}else if(s.equals("sidewaysTriangle")){
			Stars.sidewaysTriangle(lines);
		}else if(s.equals("diamond")){
			Stars.diamond(lines);
		}else if(s.equals("trapezoid")){
			Stars.trapezoid(lines, length);
		}else if(s.equals("christmasTree")){
			Stars.christmasTree(lines);
		}else if(s.equals("castle")){
			Stars.castle(lines);
		}
	}
	
	public static void main(String[] args){
		boolean quit = false;
		Scanner in = new Scanner(System.in);
		while (!quit){
			System.out.println("Which method do you want to test?");
			String command = in.next();
			if(command.equals("stairs")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				test(command,command2,command2);
			}else if(command.equals("rectangle")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				test(command,command2,command2);
			}else if(command.equals("triangle")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				test(command,command2,command2);
			}else if(command.equals("upsideDownTriangle")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				test(command,command2,command2);
			}else if(command.equals("sidewaysTriangle")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				test(command,command2,command2);
			}else if(command.equals("diamond")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				test(command,command2,command2);
			}else if(command.equals("trapezoid")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				System.out.println("Length of the top row?");
				int command3 = in.nextInt();
				test(command,command2,command3);
			}else if(command.equals("christmasTree")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				test(command,command2,command2);
			}else if(command.equals("castle")){
				System.out.println("Number of lines?");
				int command2 = in.nextInt();
				test(command,command2,command2);
			}else if(command.equals("quit")){
				quit = !quit;
			}
		}
	}
}