package aeronautique;

/**
 * étape 0 : les classes métier : le vol
 * on regarde les types de la table VOL
 * @author abi
 *
 */

public class Vol {

	/* !!! DATES : pour les bases de données, on passera par java.sql.Timestamp 
	 * Pour le find :
	 * GregorianCalendar hArr = new GregorianCalendar();
	 * hArr.setTimesInMillis (rs.getTimeStamp("harr").getTime());
	 * Pour le create :
	 * Timestamp ts = new Timestamp (vol.gethDep().getTimeInMillis());
	 * pst.setTimestamp(3,ts); 
	 */
	
	// Constructeur sur les champs.
	
	/**
	 * éventuellement utiliser java.sql.TimeStamp et getTimeInMillis pour afficher les dates 
	 */
	@Override
	public String toString() {
		// TODO TimeStamp de java.sql se rapproche du dateTime de sql Server
		return null;
	}
	

}
