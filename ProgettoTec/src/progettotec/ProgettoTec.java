package progettotec;
import java.io.*;
/**
 *
 * @author studente
 */
public class ProgettoTec {

    public static void main(String[] args) {
        
            
        Consigli calendario = new Consigli();
	LetturaCalendario Lettura = new LetturaCalendario();
	LetturaClassi LeggiClassiProf = new LetturaClassi();
              
        calendario = Lettura.leggi("E:\\ProgettoTec\\src\\progettotec\\CALENDARIO.csv");
        LeggiClassiProf.leggiC("E:\\ProgettoTec\\src\\progettotec\\CLASSI.csv");
        
        
        
	Consigli prof = new Consigli();

	for (int x = 0; x < calendario.getNumEl(); x++)
	{
		for (int i = 0; i < LeggiClassiProf.getNumEl(); i++)
		{
                    String y=LeggiClassiProf.getEl(i);
                    String z=calendario.getEl(x).getClasse();
                    if(y.equals(z))
			{
                            prof.add(calendario.getEl(x));
			} 

		}
	}
	
        System.out.println("controllo funzionamento");
        prof.stampa();
    }
    
}

