package fr.gtm.behome.dao;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.behome.domaine.Agent;

public class AgentDao {



	//methode create
	
		public boolean createAgent ( Agent agentic) {
			
			System.out.println("cette methode cree une table d'agent");
			
			//etape1:  on se connecte avec la base de donnee
			
									// Information d'accès à la base de données
									String url = "jdbc:mysql://localhost/behome?autoReconnect=true&useSSL=false";
									String login = "root";
									String passwd = "";
									Connection cn =null;
									Statement st =null;
						
									try {
						
										// Etape 1 : Chargement du driver
										Class.forName("com.mysql.jdbc.Driver");
						
										// Etape 2 : récupération de la connexion
										cn = DriverManager.getConnection(url, login, passwd);
										
				
							
			
			//etape 2:  on prepare un enregistrement
										// Etape 3 : Création d'un statement
										st = cn.createStatement();

									
			
			// etape 3: on definit la requete SQL
	

							            String sql = "INSERT INTO `agent` VALUES ('"
							            + agentic.getId() + "','"+ agentic.getNom() +"','"+agentic.getPrenom()+"','"+agentic.getNbBien()+"','"+agentic.getClient().getIdClient()+"')";
			
			
										
			// Etape 4 : exécution requête
										st.executeUpdate(sql);
									}
			// on gere les exceptions
									catch (SQLException e) {
										e.printStackTrace();
									} catch (ClassNotFoundException e) {
										// TODO: handle exception
										e.printStackTrace();
									} 
									
									
									
					finally {
										try {
			// Etape 6 : libérer ressources de la mémoire.
											cn.close();
											st.close();
										} catch (SQLException e) {
											e.printStackTrace();
										}
									}
									return true;
			
		}
		

		public void read () {
			System.out.println("cette methode lie une table d'agent");

			
				// Information d'accès à la base de données
				String url = "jdbc:mysql://localhost/behome?autoReconnect=true&useSSL=false";
				String login = "root";
				String passwd = "";
				Connection cn =null;
				Statement st =null;
				ResultSet rs =null;
				
				try {

					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.jdbc.Driver");

					// Etape 2 : récupération de la connexion
					cn = DriverManager.getConnection(url, login, passwd);

					// Etape 3 : Création d'un statement
					st = cn.createStatement();
/// ces 2 la sont liés ensembles
					String sql = "SELECT * FROM agent";

					// Etape 4 : exécution requête
					rs = st.executeQuery(sql);

					
					
					// Si récup données alors étapes 5 (parcours Resultset)

					while (rs.next()) {
						
						System.out.println(rs.getString("idAgent")+" "+rs.getString("nom")+ " "+rs.getString("prenom")+" "+ rs.getString("nbBien")+" "+rs.getString("idClient")); 
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} finally {
					try {
					// Etape 6 : libérer ressources de la mémoire.
						cn.close();
						st.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			
			
			
			}
		
		
		public void update () {
			System.out.println("cette methode met a jour une table d'agent");

			// Information d'accès à la base de données
			String url = "jdbc:mysql://localhost/behome?autoReconnect=true&useSSL=false";
			String login = "root";
			String passwd = "";
			Connection cn =null;
			Statement st =null;
			ResultSet rs =null;
			
			try {

				// Etape 1 : Chargement du driver
				Class.forName("com.mysql.jdbc.Driver");

				// Etape 2 : récupération de la connexion
				cn = DriverManager.getConnection(url, login, passwd);

				// Etape 3 : Création d'un statement
				st = cn.createStatement();
/// ces 2 la sont liés ensembles
				
			
				String sql = "UPDATE `agent` SET nom= 'barbara' ','  prenom= 'mathieuX' ',' nbBien =2   WHERE `idAgent`= 2";
			
			
					

				// Etape 4 : exécution requête
				rs = st.executeQuery(sql);

				
				
				// Si récup données alors étapes 5 (parcours Resultset)

				while (rs.next()) {
					
					System.out.println(rs.getString("idAgent")+" "+rs.getString("nom")+ " "+rs.getString("prenom")+" "+ rs.getString("nbBien")+" "+rs.getString("idClient")); 
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
				// Etape 6 : libérer ressources de la mémoire.
					cn.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		
		}
		
		public void delete() {
		System.out.println("cette methode efface une table d'agent");
		
		
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/behome?autoReconnect=true&useSSL=false";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;
		ResultSet rs =null;
		
		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Création d'un statement
			st = cn.createStatement();
/// ces 2 la sont liés ensembles
			
		
			
			String sql = "DELETE FROM `agent` WHERE `idAgent` = 11 "; 
		

			//String sql = "UPDATE `agent` SET nom= 'barbara' ','  prenom= 'mathieuX' ',' nbBien =2   WHERE `idAgent`= 2";
		
				

			// Etape 4 : exécution requête
			rs = st.executeQuery(sql);

			
			
			// Si récup données alors étapes 5 (parcours Resultset)

			while (rs.next()) {
				
				System.out.println(rs.getString("idAgent")+" "+rs.getString("nom")+ " "+rs.getString("prenom")+" "+ rs.getString("nbBien")+" "+rs.getString("idClient")); 
			}
		} 
		
		
		
		
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		}
		
		public ArrayList<Agent> getAllAgents(){
			 System.out.println("RECUPERATION LISTE TOTALE DES AGENTS");
				// Information d'accès à la base de données
				String url = "jdbc:mysql://localhost/gestionrh";
				String login = "root";
				String passwd = "";
				Connection cn =null;
				Statement st =null;
				// 1. Déclaration et instanciation Liste à retourner
				ArrayList<Agent> maListeAgent = new ArrayList<Agent>();

				try {

					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.jdbc.Driver");

					// Etape 2 : récupération de la connexion
					cn = DriverManager.getConnection(url, login, passwd);

					// Etape 3 : Création d'un statement
					st = cn.createStatement();

					String sql = "SELECT * FROM `agent`";

					System.out.println(sql);
					// Etape 4 : exécution requête

					// Si récup données alors étapes 5 (parcours Resultset)

						ResultSet rs = st.executeQuery(sql);

						while (rs.next()) {
							//System.out.println("RECUP INFO ENREGISTREMENT");
							// Création d'un Objet et remplissage
							Agent monAgent = new Agent();
							
							monAgent.setNom(rs.getString("nom"));
							monAgent.setPrenom(rs.getString("prenom"));
							// Ajout de l'Objet dans la liste
							maListeAgent.add(monAgent);
						}
						
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					try {
					// Etape 6 : libérer ressources de la mémoire.
						cn.close();
						st.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				//3. Retouner la liste
			return maListeAgent;
			 
		 }
			
		}
		


	
	
	
	

