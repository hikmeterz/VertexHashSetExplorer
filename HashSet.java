import java.util.ArrayList;

public class HashSet {
	
	ArrayList<Vertex>[] table;
	int rowCount=0;
	ArrayList<Pair> p;
	//ArrayList<Vertex>[] originalArray;

    public HashSet(int rowCount) {
    	p= new ArrayList<Pair>();
    	this.rowCount=rowCount;
    	//originalArray = new ArrayList[rowCount];
    	//for(int i = 0; i < rowCount; i++)
          //  originalArray[i] = new ArrayList<>();
    	
    	
    	
    	table = new ArrayList[rowCount];
        for(int i = 0; i < rowCount; i++)
            table[i] = new ArrayList<>();
    	

    }

    private int compress(int hash) {
    	if(hash<0)
    		return (-1*hash) %rowCount;//negatif uretildigi zaman -1 ile carpip modunu al.
    	else
    		return hash % rowCount;
    
    
    }

    public void insert(Vertex vertex) {
    	
    	int hash = compress(vertex.toString().hashCode());
    	//System.out.println(hash);
    	//hashCode  Negatif uretebiliyor..
    	
    	ArrayList<Vertex> row = table[hash];
       
    	//ArrayList<Vertex> row1 = originalArray[hash];
    	
    	int column=0;
        boolean bulunduMu=false;

        for(Vertex ver:row) {//rowda arama yapmak icin...
        	if(ver.equals(vertex)) {//eger ayni degerde vertex varsa.
        		bulunduMu=true;//bulundu...
        		break;//ve donguden cik.
        	}
        	column++;
        	
        }
        
        
        p.add(new Pair(hash,column));
       // row1.add(vertex);
        
        if(!bulunduMu){//bulunmadiysa rowa eklenebilir.
        	row.add(vertex);
        	
        }
        
      
        
        
    }

    public void print() {
    	for(int i = 0; i < rowCount; i++) {
            if(!table[i].isEmpty())
                System.out.println("Row:" + i);
            for (Vertex vertex : table[i])
                System.out.println(vertex);
           
        }
    	
    }
    public void getIndexData() {
    	for(Pair pair:p) {
    		System.out.println(pair);
    		
    		
    	}
    	
    	
    	
    }
    /*
    public void OriginalArray() {
    	
    	for(int i = 0; i < rowCount; i++) {
            if(!originalArray[i].isEmpty())
                System.out.println("Row:" + i);
            for (Vertex vertex : originalArray[i])
                System.out.println(vertex);
           
        }
    
    }*/
    public void getOriginalArray() {
    	for(int i=0;i<p.size();i++) {
    		
    		System.out.println(table[p.get(i).getx()].get(p.get(i).getY()));
    		
    		
    	}
    	
    	
    	
    }
    
    
    
    
}