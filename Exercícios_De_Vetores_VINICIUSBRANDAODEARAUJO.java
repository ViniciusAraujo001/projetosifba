
/**
 * @author Vinícius Brandão de Araújo
 * Turma: 18118.2
 * Data: 15 de abril de 2020
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Exercícios_De_Vetores_VINICIUSBRANDAODEARAUJO {

  public static String f(double num) { 
    NumberFormat formater = new DecimalFormat("##,###,###,##0.00");
    return formater.format(num);
  }

  public static void car() {
    String[] carros = new String[5];
    int[] kms = new int[5];
    double[] litros = new double[5];
    double litro = 0;
    int maisEconomico = 0;
    int index = 0;
    for (int i = 0; i < carros.length; i++) {
      
      String carro = JOptionPane.showInputDialog(null, "Que carro é", "Entrada " + (i + 1) + "/5", 3);
      int km = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos KMs ele faz por litro?", "Entrada " + (i + 1) + "/5", 3));
      litro = 1000 / km;

      carros[i] = carro;
      kms[i] = km;
      litros[i] = litro;

      if (maisEconomico < kms[i]) {
        maisEconomico = kms[i];
        index = i;
      }
    }
    JOptionPane.showMessageDialog(null,
        "O veículo mais economico é o " + carros[index] + ", fazendo " + maisEconomico + "KMs/litro");
    JOptionPane.showMessageDialog(null,
        "Se você fizer uma viagem de 1000km você gastará com o: \n" + carros[0] + ": " + f(litros[0])
            + " litros de combustível \n" + carros[1] + ": " + f(litros[1]) + " litros de combustível \n" + carros[2]
            + ": " + f(litros[2]) + " litros de combustível \n" + carros[3] + ": " + f(litros[3])
            + " litros de combustível \n" + carros[4] + ": " + f(litros[4]) + " litros de combustível");
  }

  public static void vendedor() {
    int lengthVetor = 1;
    double total = 0;
    int index1 = 0;
    int index2 = 0;
    double valorMaior = 0;
    double valorMenor = 0;
    double[] totalDeVendas = new double[lengthVetor];
    double[] comissoes = new double[lengthVetor];
    int[] codigos = new int[lengthVetor];
    double[] valorReceber = new double[lengthVetor];

    for (int i = 0; i < lengthVetor; i++){
      int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Código", "Entrada " + (i + 1) + "/10", 3));
      double totalDeVenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Total de vendas", "Entrada " + (i + 1) + "/10", 3));
      double comissao = Double.parseDouble(JOptionPane.showInputDialog(null, "Comissão em %", "Entrada " + (i + 1) + "/10", 3));
      

      totalDeVendas[i] = totalDeVenda;
      comissoes[i] = comissao;
      codigos[i] = codigo;
      valorReceber[i] = (comissao/100) * totalDeVenda;

      if (valorMaior < valorReceber[i]) {
        valorMaior = valorReceber[i];
        index1 = i;
      } else if (valorMenor > valorReceber[i]) {
        valorMenor = valorReceber[i];
        index2 = i;
      }
    }

      JOptionPane.showMessageDialog(null, 
      codigos[0] + " | R$ " + f(valorReceber[0]) + "\n" +
      codigos[1] + " | R$ " + f(valorReceber[1]) + "\n" +
      codigos[2] + " | R$ " + f(valorReceber[2]) + "\n" +
      codigos[3] + " | R$ " + f(valorReceber[3]) + "\n" +
      codigos[4] + " | R$ " + f(valorReceber[4]) + "\n" +
      codigos[5] + " | R$ " + f(valorReceber[5]) + "\n" +
      codigos[6] + " | R$ " + f(valorReceber[6]) + "\n" +
      codigos[7] + " | R$ " + f(valorReceber[7]) + "\n" +
      codigos[8] + " | R$ " + f(valorReceber[8]) + "\n" +
      codigos[9] + " | R$ " + f(valorReceber[9]),
       "Código | Valor a Receber", JOptionPane.PLAIN_MESSAGE);
  

    for (int i = 0; i < lengthVetor; i++){
      total += totalDeVendas[i];
    }

    JOptionPane.showMessageDialog(null, "Total de vendas de todos os vendedores: R$ " + f(total));
    JOptionPane.showMessageDialog(null, "O vendedor de código " + codigos[index1] + " foi o que recebeu mais: R$ " + f(valorReceber[index1]));
    JOptionPane.showMessageDialog(null, "O vendedor de código " + codigos[index2] + " foi o que recebeu menos: R$ " + f(valorReceber[index2]));
  }
  public static void main(final String[] args) {

    Object[] textoButao = {"Questão 1", "Questão 2"};
    int escolha = JOptionPane.showOptionDialog(null, null, "ESCOLHA A QUESTÃO", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, textoButao, textoButao);
    if (escolha == 0) {
      car();
    } else if (escolha == 1) {
      vendedor();
    }
  }
}