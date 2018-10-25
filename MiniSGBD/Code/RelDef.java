import java.util.List;

public class RelDef {
	
	private String NomRel;
	private int nbColone;
	private List <String> TypeCol;
	
	
	public RelDef() {
		//constructor of Rel Def
	}
	
	
	
// the getter and the setter
	public String getNomRel() {
		return NomRel;
	}

	public void setNomRel(String nomRel) {
		NomRel = nomRel;
	}

	public int getNbColone() {
		return nbColone;
	}

	public void setNbColone(int nbColone) {
		this.nbColone = nbColone;
	}

	public List<String> getTypeCol() {
		return TypeCol;
	}

	public void setTypeCol(List<String> typeCol) {
		TypeCol = typeCol;
	}
	
	

	
}
