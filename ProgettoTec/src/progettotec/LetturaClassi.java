package progettotec;
import java.io.*;



public class LetturaClassi{

    static int GRANDEZZA1=100;
    private String vettoreClassi[];
    private int numEl;
        
        
    public LetturaClassi() {
        numEl = 0;
        vettoreClassi = new String[GRANDEZZA1];
    }
    
    public void leggiC(String NomeFile){
        try{
            FileReader reader = new FileReader(NomeFile);
            BufferedReader buffer = new BufferedReader(reader);
            
            while(true)
            {
                String s= buffer.readLine();   //leggo
                
                if(s==null) break;             //se non ci sono più caratteri termino
                else
                {
                    
                    vettoreClassi[numEl]=s;
                    numEl++;
                    
                }
            }
            reader.close();
            
            
            
        }catch(IOException e)
        {
            System.out.println("ERRORE LETTURA"+e);
        }
        
                    
    }
	
    
    public int getNumEl(){
         return numEl;
    }
	
    public String getEl(int pos){
         return vettoreClassi[pos];
    }
    
    
}
