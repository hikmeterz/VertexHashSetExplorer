import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
	
	

		Scanner input=null;
		
		try {
			
			input= new Scanner(new File("input.txt"));
			
			
		
		}catch(FileNotFoundException e){
			System.out.println("ERROR.");
			
			
		}
		
		
		
		
		String rowSayisi=input.nextLine();
		
		int row=Integer.parseInt(rowSayisi);
		
		String inputCount= input.nextLine();
		HashSet set = new HashSet(row);
		
		String line;
		
		while(input.hasNextLine()) {//veriler dolduruldu.
		
			line = input.nextLine();
			int x=Integer.parseInt(line.substring(0,line.indexOf(" ")));
			line=line.substring(line.indexOf(" ")+1);
			int y=Integer.parseInt(line.substring(0,line.indexOf(" ")));
			line=line.substring(line.indexOf(" ")+1);
			int z=Integer.parseInt(line.substring(0));
			
			
			set.insert(new Vertex(x,y,z));
				
		}
		
		set.print();
		set.getIndexData();
		//set.OriginalArray();
		set.getOriginalArray();
	
	}
	
	
	
	
	
	
	
}
