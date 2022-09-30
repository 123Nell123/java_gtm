package launcher;

import java.util.Scanner;

import domain.Client;
import domain.ClientFortune;
import domain.CompteBancaire;
import domain.Conseiller;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//////*********************************************************************************************************************************************	**********
		//////****************************        debut invite de choix         **************************************		
		//**********************************************************************************************************************************************************	
		
		
		System.out.println("\n Bienvenu dans l'interface de ProxiBanque, que souhaiter vous faire? \n"
				+ "1. ouvrir un compte.... \n"
				+ "2. ouvrir un compte.... \n"
				+ "3. ouvrir un compte.... \n"
				);
		
		Scanner scdeb = new Scanner(System.in);
		int choix  = scdeb.nextInt();
			
				
		//TODO mettre une fonction pour appeller les fonctions correspondantes ici ou mieux redispatcher ces fonctions ds tout le programme
		
		switch(choix) {
		  case 1:
		    System.out.println("tres bon choix");
		    break;
		  case 2:
		    System.out.println("patientez svp");
		    break;
		    
		  case 3:
			    System.out.println("je n'ai pas compris");
			    break;
		  default:
		    System.out.println("Oups, le système n'est pas prévu pour ce choix");
		    
		}
		
	//////*********************************************************************************************************************************************	**********
	//////****************************        liee  association bilaterale client_ conseiller   au client fortuné          **************************************		
	//**********************************************************************************************************************************************************		
	
		System.out.println(" \n \t** Bienvenu sur l'interface pour retrouver les associations clients//fournisseurs **  \n");	
		
		///  on cherche le(s) client(s) d'un conseiller particulier//
		//decla
		
		Client clientDuConseiller ;
		Conseiller conseiller1; 
		
		//inst
		conseiller1= new Conseiller(10,"Alma","Arthur","alma.arthur@proxibanque.fr"); 
		clientDuConseiller = new Client(100, "Carne","Cedric", "route du parc", "93400","st ouen", "0642530127",'o', 'o', 'p', conseiller1);
		
		
		/*
		 * public Client(int id, String nom, String prenom, String adresse, String codePostal, String ville, String tel,
			char carteElectron, char cartePremier, char entrepriseParticulier)
		 * 
		 */
		
		
		
		//utili
		
	
		System.out.println(" le conseiller " + conseiller1.getNom() +" a dans son compte le client ref" + clientDuConseiller.getId()+ ", Mr ou Mme "+clientDuConseiller.getNom()+".") ;
		
	//TODO faire l'assocation ds le cas de plusieurs clients pour un conseiller
		
		/// on cherche le conseiller d'un client////
		//decla
		
		Conseiller conseillerDuClient ;
		Client client0;
		
		//inst
		client0 = new Client(11, "Pazani","Patrick","rue des pattes","12300","Milan","1200456874", 'o', 'o', 'p');
		conseillerDuClient = new Conseiller(2,"Palma","Parthur","palma.parthur@proxibanque.fr", client0 );
				
		client0.getNom();
		System.out.println(" le client " + client0.getNom() +" a comme conseiller" + ", Mr ou Mme "+ conseillerDuClient.getNom()+".") ;
System.out.println("---------------------------------------------------------------------------------------------------------------------");		

//////*********************************************************************************************************************************************	**********
//////****************************        liaison  client// compteBancaire        **************************************		
//**********************************************************************************************************************************************************

System.out.println(" \n \t** Bienvenu sur l'interface pour retrouver les associations client// compte bancaire  **  \n");	

///  on cherche le client d'un compte bancaire (pour l'audit par exemple)



//decla

Client clientAuCompteBancaire ;
CompteBancaire compte1; 

clientAuCompteBancaire = new Client(11, "Pazani","Patrick","rue des pattes","12300","Milan","1200456874", 'o', 'o', 'p');

//inst
compte1 = new CompteBancaire (10, 5000, "12.04.2000", clientAuCompteBancaire);

float soldeClient = compte1.solde ;

///  TODO on cherche le compte bancaire d'un client




/*
public CompteBancaire(int numero, float solde, String dateOuverture, Client compteBancaireClient) {
	super();
	this.numero = numero;
	CompteBancaire.solde = CompteCourant.soldeCC+ CompteEpargne.soldeCompteEpargne;
	this.dateOuverture = dateOuverture;
	this.compteBancaireClient = compteBancaireClient;
*/

System.out.println("---------------------------------------------------------------------------------------------------------------------");		

//////*********************************************************************************************************************************************	**********
//////****************************        liaison  compteBancaire// compteBancaire        **************************************		
//**********************************************************************************************************************************************************

System.out.println(" \n \t** Bienvenu sur l'interface pour faire un virement compte a compte  **  \n");	














/////////////////////***********************************************************************************	
//////********************************       liee au client          ***************************************		
//******************************************************************************************************		
		System.out.println(" \n \t** Bienvenu sur de gestion de compte des clients **  \n");		
		
		// declaration 
Client client1;		
	
		
		// Instantiation

client1 = new Client (1, "PIED", "nell", "rue des cerises", "75013"," paris", "0611225504", 'o', 'o', 'p' )	;	
			
      // Utilization


//////creer le compte d 'un client///////////////////////

System.out.println("veuillez rentrer le nom du client: ");

Scanner sc30 = new Scanner(System.in);
String nomClient1 = sc30.nextLine();
client1.setNom(nomClient1);

System.out.println("veuillez rentrer le prenom du client: ");

Scanner sc31 = new Scanner(System.in);
String prenomClient1 = sc31.nextLine();
client1.setPrenom(nomClient1);


System.out.println("veuillez rentrer l'adresse du client: ");

Scanner sc32 = new Scanner(System.in);
String adresseClient1 = sc32.nextLine();
client1.setAdresse(nomClient1);


System.out.println("veuillez rentrer le tel du client: ");

Scanner sc33 = new Scanner(System.in);
String telClient1 = sc33.nextLine();
client1.setAdresse(nomClient1);





// creation d'une ref pour le client

int id1 = 1;
/*  client1.setId(idclient1);
*/

client1.creer(id1, nomClient1);








// TODO s'assurer que ce numéro est incrementer a chaque fois


//////TODO modifier le compte d 'un client///////////////////////




//////TODO afficher le compte d 'un client///////////////////////	


//nomClient1
/*
int num;


client1.afficher(nomClient1, num);
*/

//////TODO supprimer le le compte d 'un client///////////////////////	


//////*********************************************************************************************************	
//////****************************        liee au client fortuné          **************************************		
//*************************************************************************************************************
System.out.println("---------------------------------------------------------------------------------------------------------------------");	
System.out.println("\n \t ** Bienvenu sur l'interface de placement pour nos clients fortunés ** \n");


//////////TODO une invit de commande pour le client fortunité
//decla
ClientFortune clientF1;

//insta
clientF1 = new ClientFortune(1557, "Dupont" , "Charles","rue de la paix","06644","Monaco","0794640646", 'o', 'o', 'p');



System.out.println("merci de renseigner l'identification du client :(entrez un numero svp) ");
Scanner sc50 = new Scanner(System.in);
int id = sc50.nextInt();
//TODO appeller le client fortunite
System.out.println("le compte correspondant est:");
//TODO verifier le solde du client
System.out.println("le solde est:");




//utilisa


System.out.println();





//TODO utiliser les enum pour le placement 
//String.placement = Bourse.valueOf(arg0) ;


System.out.println("Choissisez la ville où le client souhaite placer son argent: \n"
		+ "1. Paris \n"
		+ "2. Tokyo \n"
		+ "3. Londres \n");
Scanner sc0 = new Scanner(System.in);
int ville = sc0.nextInt();


if (ville == 1) 
	{
	System.out.println("Vous avez demandé Paris.");
	}
	else if (ville == 2) 
		{System.out.println("Vous avez demandé Tokyo.");
		

		}
		else if (ville == 3) 
			{System.out.println("Vous avez demandé Londres.");

			}
		  else { System.out.println(" désolé, nous ne proposons pas la ville demandée.");
		  
		  System.out.println("voulez vous:\n"
		  		+ "1.quittez   \n"
		  		+ " 2.ressayer \n" );
		  			Scanner sc1 = new Scanner(System.in);
		  			int pla = sc1.nextInt();
		  				if (pla ==1 )
		  				   { 	System.out.println("un instant svp, vous allez revenir un menu initial");
		  				   
		  				   //TODO une fin de programme propre pour le choix 1 quittez
		  				     				   		  				   
		  				    }
		  				if (pla ==2 )
		  			   { 	System.out.println("veuillez patienter");
		  			  //TODO une fin de programme propre pour le choix 2 ressayez
  		  				   
	  				    }
		  				else 
		  					{ System.out.println(" operation non reconnue");
		  					
		  					}
		  				
			   }
	
//////*********************************************************************************************************	
//////****************************        liee au conseiller          **************************************		
//*************************************************************************************************************
System.out.println("---------------------------------------------------------------------------------------------------------------------");	
System.out.println("\n \t** Bienvenu sur l'interface de simulation de crédit **\n");	

// simulation de credit 
//les taux immobilier et consommation sont fixé arbitrairement a 1.7 et 4.2 
float taux = 0 ;

System.out.println("Quel est le type de credit demandé: \n"
				+ "1. Crédit immobilier ?\n"
				+ "2. Crédit a la consommation ?\n") ;

Scanner sc4 = new Scanner (System.in);
int type = sc4.nextInt() ;

	if (type == 1) {
	  taux = (float) 1.7 ; 
		}
	else  {
			if (type == 2)
			    taux = (float) 4.2 ; 
	
			else
		  	 System.out.println("merci de refaire la saisie svp"); 
			}






System.out.println("Vous souhaitez faire une demande de simulation de credit, quel est le montant demande (arrondi à l'unité) : ");
Scanner sc41 = new Scanner (System.in);
int montantdem = sc41.nextInt() ;

System.out.println(" Entrez les revenus  du client (arrondi à l'unité) : ");
Scanner sc42 = new Scanner (System.in);
int reve = sc42.nextInt() ;

System.out.println("montant de remboursement mensuel (arrondi à l'unité) : ");
Scanner sc43 = new Scanner (System.in);
int remb = sc43.nextInt() ;


float duree = (montantdem * taux / remb) /12 ;



if (remb >= 3 * reve) 
    System.out.println("désolé, le pret est refusé");
    else { 
    	System.out.println("le taux est de"+ taux + "%");
    }







	}
	//fin de la methode main
		
	}
// fin de la classe Lanceur

