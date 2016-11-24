package aeronautique;

import controleur.Controleur;
import dao.Connexion;


/**
 * Il faut commencer par faire le métier, puis regarder la classe Connexion,
 * puis le Design Pattern DAO sur la table VOL
 * Ensuite on étend aux autres tables AVION et PILOTE
 * Puis il faut essayer des requêtes plus complexes.
 * @author abi
 *
 */
public class Principale {

	public static void main(String[] args) {
				
		new Controleur();		
		Connexion.fermer();
	}

}
