package progettotec;

import java.io.*;



public class LetturaCalendario {

    public LetturaCalendario() {
    }
    
    public Consigli leggi(String NomeFile){
        
        
        Consigli cal = new Consigli();// dichiarazione di un oggetto di classe consigli ( vettore che andrà riempito)
        try{
            FileReader reader = new FileReader(NomeFile);
            BufferedReader buffer = new BufferedReader(reader);
            System.out.println("INIZIO LETTURA...");
            
            while(true)
            {
                
                String s= buffer.readLine();   //leggo
               
                if(s==null) break;             //se non ci sono più caratteri termino
                else
                {
                    
                    Consiglio consiglio = new Consiglio(s.substring(0, 4) , s.substring(5, 7) ,s.substring(8, 10) ,s.substring(23, 26) , s.substring(11, 13),s.substring(14, 16),s.substring(17, 19), s.substring(20, 22));     
                  
                    cal.add(consiglio);
                   
                    
                }
            }
            reader.close();
            
        }catch(IOException e)
        {
            System.out.println("ERRORE LETTURA"+e);
        }
        
        
        return cal;
        
    }
}
