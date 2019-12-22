package com.sir.calcul;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test 
    public void verifieAdditionPositif(){
       int rest = 1+3;
       assertTrue("le resultat doit etre equal a 4", Calcul.addition(1, 3) == rest);
    }
    
    @Test
    public void verifieAddwithNegativeValue(){
        int rest = 1-7;
        assertTrue("le resultat doit etre q a -6", Calcul.addition(1, -7) == rest);
    }
    
    @Test
    public void verifieAddToNegativeValues(){
        int rest = (-4) + (-6);
        assertTrue("Le resultat doit etre  -10", Calcul.addition(-4, -6) == rest);
    }
    
    @Test
    public void verifieMultPosotifsValues(){
        int resultat = 10 * 20;
        assertTrue("la multiplication de 10 et 20 doit etre egal a 200", Calcul.multiplication(10, 20) == resultat);
    }
    
    @Test
    public void verifieMultWithNegValue(){
        int   resultat = (-4) * (7);
        assertTrue("a * b doit etre possitifs est egal a -34 ", Calcul.multiplication(-4, 7) == resultat);
    }
    
    @Test
    public void verifieMultWithNegsValues(){
        int   resultat = (-4) * (7);
        assertTrue("a * b doit etre possitifs est egal a 34 ", Calcul.multiplication(-4, -7) == resultat);
    }
    
    public void verifieMultWthZero(){
        int   resultat = 0 * 80;
        assertTrue("a * b doit etre possitifs est egal a 0 ", Calcul.multiplication(0, 80) == resultat);
    }
    
    
}
