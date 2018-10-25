import java.util.List;

public class DBManager {
	
	private static final DBManager INSTANCE = new DBManager();
	
	public DBManager getInstance(){
	      return INSTANCE;
	   }
	
	public DBManager() {
		// constructor
	}
	
	public static void init() {
		// the init function
		System.out.println(" the init function");
		DBDef.getInstance();
		DBDef.init();
	}
	
	public void finish() {
		DBDef.finish();
	}
	
	public void processCommande(String commande) {
		
	}
	
	
	// create relation
	public static void CreateRelation(String NomRel, int nbC, List<String> typeC) {
		RelDef newRel = new RelDef();
		newRel.setNomRel(NomRel);
		newRel.setNbColone(nbC);
		newRel.setTypeCol(typeC);
		
		DBDef db = new DBDef();

		db.AddRelation(newRel);
	}
	
}
