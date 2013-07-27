/*
* Completed by: Alexandre Cancado Cardoso (July 27th)
*/

import scala.io.Source

/****
 * Esse Πum pequeno exercӣio para demonstrar o uso do Scala para processar textos.
 * Complete o conteݤo das fun͛es abaixo e poste seu resultado no Github
 *  
 * Aten͋o: se vocРn̯ Πfluente em Scala, n̯ se desanime caso n̯ saiba resolver o problema de forma rȰida
 *          A ideia aqui Πdemonstrar que vocРΠcapaz de aprender novas linguagens. Google te ajudarǠbastante ;-)
 *          
 * Instru͋o: Apague o termo ??? das fun͛es e coloque o seu cؤigo.         
 *          
 */


class StopWords {

  override def toString = lista.toString
  
  // Essa fun͋o armazena uma lista de stopwords
  val lista = getStopWords()

  /*
   * Esta fun͋o deve devolver uma lista de stopwords. 
   * A lista de stopwords estǠneste endereί: "http://members.unine.ch/jacques.savoy/clef/englishST.txt"
   * 
   * A fun͋o deve: 
   *    1 - Ler as stopwords Ƞpartir da URL acima
   *    2 - Transformar o conteݤo em uma lista
   *    3 - Retornar uma lista contendo todas as palavras com mais de uma letra (palavras com tamanho maior que 1). 
   *    
   */ 
  def getStopWords():List[String] = ("\n".r.split(scala.io.Source.fromURL("http://members.unine.ch/jacques.savoy/clef/englishST.txt").mkString)).toList

 /*
  * A fun͋o part divide a lista de stopwords jǠfiltradas pela fun͋o getStopWords em duas partes: uma contendo todas as entradas com uma certa letra e outra sem a letra
  * 
  * Dica: a fun͋o part retorna o que o Scala chama de pairs. verifique o mϴodo "partition" no Scala.
  * 
  */
 
  def part (c: String) = lista partition (_ contains c)

}

object StopWordsObj {

  
  // VocРpode rodar seu cؤigo para verificar se ele funciona. 
  // Aqui ele imprimirǠquantas palavras com contra͋o est̯ na lista de stopwords (deve ser 47) e quantas sem contra͋o (deve ser 498).
  def main(args: Array[String]) {
    val spwords = new StopWords()
    val (contracao, semcontracao) = (spwords part "'")
    System.out.println("Palavras com contraco: " + contracao.size);
    System.out.println("Palavras sem contraco: " + semcontracao.size);

  }
}