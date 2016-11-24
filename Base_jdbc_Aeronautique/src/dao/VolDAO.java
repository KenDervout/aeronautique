package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.GregorianCalendar;

import aeronautique.Vol;

/**
 * étape 2 : le patron de conception DAO, le lien vers notre table PILOTE
 * On étend la classe DAO avec un Pilote
 * @author abi
 *
 */
public class VolDAO extends DAO<Vol> {

	// 2 constantes de classe : le nom de la table, la clé primaire


	/**
	 * On donne un vol en entrée qu'on va écrire dans la base de données
	 * La requête à utiliser est un INSERT INTO
	 * On utilise encore TimeStamp
	 */
	@Override
	public boolean create(Vol obj) {

		boolean succes=true;
		try {
			// TODO Le prepared Statement prépare notre requete.
			// On peut utiliser les méthodes setInt, setTimestamp, setString...
			// Puis on utilise executeUpdate

			// Ensuite, il faut remettre à jour l'identifiant de l'objet java,
			// généré automatiquement par la base de données
		} catch (SQLException e) {
			succes=false;
			e.printStackTrace();
		}
		return succes;
	}

	/**
	 * On donne un vol en entrée qu'on va supprimer de la base de données
	 * La requête à utiliser est un DELETE FROM
	 * 
	 */
	@Override
	public boolean delete(Vol obj) {
		boolean succes=true;
		int id = obj.getNumVol();
		try {
			// TODO prepared Statement et executeUpdate
		} catch (SQLException e) {
			succes = false;
			e.printStackTrace();
		} 
		return succes;		
	}

	/**
	 * On donne un vol en entrée qu'on va mettre à jour dans la base de données
	 * La requête à utiliser est un UPDATE SET
	 * 
	 */
	@Override
	public boolean update(Vol obj) {
		boolean succes=true;


		try {
			// TODO requete, preparedStatement, setInt, setString, setTimeStamp etc. puis executeUpdate
		} catch (SQLException e) {
			succes = false;
			e.printStackTrace();
		} 
		return succes;	
	}

	/**
	 * On donne un identifiant entier en entrée qu'on cherche dans la base de données
	 * La requête à utiliser est un SELECT FROM WHERE avec la clé primaire
	 * 
	 */
	@Override
	public Vol find(int id) {
		Vol vol = null;
		try {
			// TODO manipulation d'un resultSet, création d'un objet Vol
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vol;
	}



}
