
public class Singleton {
	/** Constructeur privé */
	private Singleton()
	{}

	/** Instance unique pré-initialisée */
	private static Singleton INSTANCE = new Singleton();

	/** Point d'accès pour l'instance unique du singleton */
	public static Singleton getInstance()
	{   return INSTANCE;
	}
}
