package progettotec;


public class Consigli {
    
        static int GRANDEZZA1 = 100;
        private Consiglio[] calendario;
	private int numEl;

    public Consigli() {
        this.calendario = new Consiglio[100];
        this.numEl = 0;
    }

    public Consigli(Consiglio[] Calendario) {
        this.calendario = Calendario;
        this.numEl = 0;
    }
        
    
    public void add(Consiglio consiglio){
        calendario[this.numEl] = consiglio;
	this.numEl = numEl+1;
        
    }
	
    public int getNumEl(){
        return this.numEl;
    }
	
    Consiglio getEl(int pos){
        return calendario[pos];
    }

    public void stampa(){
        for (int i = 0; i < this.numEl; i++)
	{
		System.out.println("Consiglio numero: "+ (i+1));
                calendario[i].stampa();
	}
    }
}
