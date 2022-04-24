 package proyecto;
import javax.swing.JOptionPane;


public class Menu {
    private byte opcion;
    
    
    public void mostrarMenu(){
      Arreglos t=new Arreglos();
      while(opcion!=5){
         opcion=Byte.parseByte(JOptionPane.showInputDialog(null,"            ***MENÚ PRINCIPAL***\n\n"
                 + "1. Agregar Cantidad de Productos\n"
                 + "2. Mostrar Cantidad de productos\n"
                 + "3. Ingresar Ventas\n"
                 + "4. Diagnostico Inventario\n"
                 + "5. Salir\n\n"
                 + "Digite su opción:"));
         switch(opcion){
             case 1:{
                t.SolicitarDatos();
                break;
             }
             case 2:{
                t.MostrarDatos();
                break;
             }
             case 3:{
                t.Ventas1();
                break;
             }
             case 4:{
                 t.EvaluoInventario();
                 break;
             }case 5:{
                 JOptionPane.showMessageDialog(null,"Gracias por usar nuestro programa");
                 System.exit(0);
                 break;
             }
             default:{
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
   }
}
