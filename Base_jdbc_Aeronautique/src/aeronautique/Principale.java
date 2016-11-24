package aeronautique;

import controleur.Controleur;
import dao.Connexion;


/**
 * Il faut commencer par faire le m�tier, puis regarder la classe Connexion,
 * puis le Design Pattern DAO sur la table VOL
 * Ensuite on �tend aux autres tables AVION et PILOTE
 * Puis il faut essayer des requ�tes plus complexes.
 * @author abi
 *
 */
public class Principale {

	public static void main(String[] args) {
				
		new Controleur();		
		Connexion.fermer();
	}

}
