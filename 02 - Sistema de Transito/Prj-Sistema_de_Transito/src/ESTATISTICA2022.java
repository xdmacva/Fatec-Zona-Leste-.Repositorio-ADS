/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * -----------------------------
 * 13/05/22                     |
 * @ Fatec Zona Leste           |
 * @teacher Ricardo Satoshi     |
 * -----------------------------
 * @author Marco Aurélio Villar |
 * @email  ma-cva@hotmail.com   |
 * -----------------------------
 */

class ESTATISTICA2022 {
 int    codcity;
 String nomecity;	 
 int    qtdacidentes;	 
 int    tipoveiculo;	 
	 
 // construtor	 
 ESTATISTICA2022 () {	 
  this(0,"",0,0);	 
 }	 
	 
   ESTATISTICA2022 ( int codcityEstatistica, String nomecityEstatistica,	 
   int qtdacidentesEstatistica,	 
   int tipoveiculoEstatistica )	 
 {	 
  codcity   = codcityEstatistica;	 
  nomecity  = nomecityEstatistica;	 
  qtdacidentes  = qtdacidentesEstatistica;
  tipoveiculo = tipoveiculoEstatistica;
 }	 
}	

    

