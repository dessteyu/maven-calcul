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
    public void verifieAddition(){
        System.out.println("verification de addtion.")
    }
    
    @Test
    public void verifieMultiplication(){
        int resultat = 10 * 20;
        assertTrue("la multiplication de 10 et 20 doit etre egal a 200", Calcul.multiplication(10, 20) == resultat);
        resultat = 1 * 10;
        assertTrue("la multiplication de 10 et 1 doit etre egal a00", Calcul.multiplication(1, 20) == resultat);
        resultat = 65 * 7;
        assertTrue("la multiplication de 10 et 1 doit etre egal a 200", Calcul.multiplication(65, 7) == resultat);
//        a et b sont negatifs
        resultat = (-4) * (-7);
        assertTrue("a * b doit etre possitifs est egal a 34 ", Calcul.multiplication(-4, -7) == resultat);
    }
    
}
