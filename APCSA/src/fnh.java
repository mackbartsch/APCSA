
public class fnh {

	public static void main(String args[]) {
		System.out.println("prepare for greatness");
boolean name = true;
		
			for(int i = 0; i < 30; i++)
			{
				for(int j= 0; j < i; j++) {
					if(name) {
						System.out.print("john ");
						name = false;
					}else {
						System.out.print("wall ");
						name = true;
					}
					
				}
				System.out.println();
			}
			
	
			
	}

}
