import java.io.IOException;
import javax.swing.JOptionPane;

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
 class FTIPO {
       public void LerFtipo (ESTATISTICA2022[ ] estatistica  ) throws IOException {				
    int i,consulta;	
  
    consulta = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do carro que deseja consultar: "));

   for (i = 0 ; i < 15; i++) {	
      if (estatistica[i].tipoveiculo == consulta){
          System.out.println("Codigo da cidade :" + estatistica[i].codcity + " Cidade :" + estatistica[i].nomecity + " Numero de acidentes : " + estatistica[i].qtdacidentes + " Tipo de veiculo :" + estatistica[i].tipoveiculo + "\n");	
      }
    }
    System.out.println("*************************************************************************** \n"); 
 }    
}
