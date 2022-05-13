
import java.io.IOException;

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

public class QTDACIDENTES {
    
       public void LerQtdacidentes (ESTATISTICA2022[ ] estatistica  ) throws IOException {				
    int i;	

   for (i = 0 ; i < 15; i++) {	
      if (estatistica[i].qtdacidentes >= 100 && estatistica[i].qtdacidentes <= 500)
      {

          System.out.println("Codigo da cidade :" + estatistica[i].codcity + " Cidade :" + estatistica[i].nomecity + " Numero de acidentes : " + estatistica[i].qtdacidentes + " Tipo de veiculo :" + estatistica[i].tipoveiculo + "\n");	

      }
    }
    System.out.println("*************************************************************************** \n"); 
  }
}
    