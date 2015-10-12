package progettotec;
import java.io.*;

public class Consiglio {
    
        private String anno;
	private String mese;
	private String giorno;
	private String classe;
	private String oraI;
	private String minutiI;
	private String oraF;
	private String minutiF;

    public Consiglio() {
    }

    public Consiglio(String anno, String mese, String giorno, String classe, String oraI, String minutiI, String oraF, String minutiF) {
        this.anno = anno;
        this.mese = mese;
        this.giorno = giorno;
        this.classe = classe;
        this.oraI = oraI;
        this.minutiI = minutiI;
        this.oraF = oraF;
        this.minutiF = minutiF;
    }
    
    

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOraI() {
        return oraI;
    }

    public void setOraI(String oraI) {
        this.oraI = oraI;
    }

    public String getMinutiI() {
        return minutiI;
    }

    public void setMinutiI(String minutiI) {
        this.minutiI = minutiI;
    }

    public String getOraF() {
        return oraF;
    }

    public void setOraF(String oraF) {
        this.oraF = oraF;
    }

    public String getMinutiF() {
        return minutiF;
    }

    public void setMinutiF(String minutiF) {
        this.minutiF = minutiF;
    }
        
    public void stampa(){
        System.out.println("Data: "+giorno+"/"+mese+"/"+anno+" Ora"+oraI+" Classe: "+classe);
    }
}
