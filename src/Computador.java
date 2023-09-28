public class Computador {

    /**
     * Atributos:
     */
    String marca;
  String modelo;
  String procesador;
  String grafica;
  String almacenamiento;
  int ram;

    /**
     *
     * @param marca Marca computador
     * @param modelo Modelo computador
     * @param procesador Procesador del computador
     * @param grafica Grafica del computador
     * @param almacenamiento Almacenamiennto del computador
     * @param ram Ram del computador
     */

  Computador(String marca,
    String modelo,
    String procesador,
    String grafica,
    String almacenamiento,
    int ram){
      this.marca = marca;
      this.modelo=modelo;
      this.procesador=procesador;
      this.grafica = grafica;
      this.almacenamiento= almacenamiento;
      this.ram = ram;
  }
    /**
     * Método de imprime las caracteristicas del computador
     * Complejidad temporal: O(1) Complejidad Constante
     */
  void  caracteristicasComputador(){
      System.out.println( "la marca " + marca + " presento el " + modelo + " con los componentes: " + "procesador " + procesador + ", grafica " + grafica + ", almacenamiento " + almacenamiento +", ram " + ram+ "GB" );
  }





}
