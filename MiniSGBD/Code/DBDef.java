import java.util.List;

public class DBDef {
	// verifier que c'est un singleton a faire !!!!!

	private static final DBDef INSTANCE = new DBDef();

	public static DBDef getInstance(){
	      return INSTANCE;
	}
	
	
	
	
	private List <RelDef> listRelDef;
	private int cptRel=0;
	
	
	public DBDef() {
		// constructor 
	}
	
	public void AddRelation(RelDef rel) {
		listRelDef.add(rel);
		cptRel++;
	}

	
// getter and setter 
	public List<RelDef> getListRelDef() {
		return listRelDef;
	}

	public void setListRelDef(List<RelDef> listRelDef) {
		this.listRelDef = listRelDef;
	}

	public int getCptRel() {
		return cptRel;
	}

	public void setCptRel(int cptRel) {
		this.cptRel = cptRel;
	}
	
	
	// init and finish method
	public static void init() {
		System.out.println(" the init function of DBDef");
	}
	
	public static void finish() {
		System.out.println("DBDef is closed ");
	}
	
	
}
