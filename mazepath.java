import java.util.ArrayList;

public class mazepath {
    
    
    public static void main(String[] args)
    {
        int n=3;
	    int m=3;
	     ArrayList<String> ans= MazePaths(0,0,n-1,m-1);
        System.out.println(ans);
	}
	
	
	public static ArrayList<String> MazePaths(int sr, int sc, int dr, int dc){
	    if(sr==dr && sc==dc)
	    {
	        ArrayList<String> base= new ArrayList<>();
	        base.add("");
	        return base;
	    }
	      ArrayList<String> hpaths= new ArrayList<>();
	      ArrayList<String> vpaths= new ArrayList<>();
	      
	      if(sr<dr){
	          vpaths= MazePaths((sr+1),sc,dr,dc);
	      }
	      if(sc<dc){
	          hpaths=MazePaths(sr,(sc+1),dr,dc);
	      }
	      
	      
	      ArrayList<String> paths= new ArrayList<>();
	      
	      for(String s: vpaths){
	          paths.add("v"+s);
	      }
	      for(String s: hpaths)
	    {
	        paths.add("h"+s);
	    }
	    return paths;
	    
	}
  
    
    
}
