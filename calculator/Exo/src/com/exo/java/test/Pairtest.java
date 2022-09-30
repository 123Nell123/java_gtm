package com.exo.java.test;

import static org.junit.Assert.*;

import java.util.IllegalFormatException;

import org.junit.Test;

import com.exo.java.exception.ExceptionNeg;
import com.exo.java.metier.DetermineParite;

public class Pairtest {

	DetermineParite pp=new DetermineParite();
	
	
	@Test 
	public void testpair() throws Exception {
		// l argument 2 donne un resultat pair
	assertTrue("message", pp.parite(2)=="pair" );
		
	}
	

	
	@Test 
	public void testimpair() throws Exception {
		// l argument 3 donne un resultat impair
	assertTrue("message", pp.parite(3)=="impair" );
		
	}
	
	@Test 
	public void testnull() throws Exception {
		// l argument 3 donne un resultat impair
	assertTrue("message", pp.parite(0)==null );
		
	}
	
	
	@Test(expected=ExceptionNeg.class) 
	public void testExceptionNeg() throws ExceptionNeg {
		pp.parite(-1);

	}
	
	
	
	@Test
	public void testNotInteger() {
	try {
	pp.parite("lulu");
		}
	catch (IllegalFormatException malecris)
	  {assert(malecris.getMessage().contains("la valeur n'est pas un integer"));}
	}
	
	
	
	
	
	
	
	



	
	
	
	
	
}
