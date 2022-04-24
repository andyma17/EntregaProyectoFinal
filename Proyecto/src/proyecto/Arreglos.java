package proyecto;

import javax.swing.JOptionPane;

public class Arreglos {
 
    private Sucursal Datos[] = new Sucursal[2];
    private byte sucursal;
    public void SolicitarDatos() {

        int x;
        for (x = 0; x < Datos.length; x++) {
            Sucursal p = new Sucursal(); //Creación del objeto debe ir siempre dentro del ciclo   //Solicitar los datos
            p.setNombreSucu(JOptionPane.showInputDialog(null, "Nombre de la sucursal:"));
            p.setUbicacion(JOptionPane.showInputDialog(null, "Digite la ubicacion de la Sucursal"));
            p.setCantPanHam(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la Cantidad de Pan de Hamburguesas")));
            p.setCantCarneHam(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la Cantidad de Carne de Hamburguesas")));
            p.setQueso(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la Cantidad de Queso")));
            p.setCantSalsa(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la Cantidad de Bolsitas de salsa")));
            p.setCantPanHot(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la Cantidad de Pan de Hot Dog")));
            p.setCantSalchicha(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la Cantidad de Salchichas")));
            p.setBolsaPapas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la Cantidad de Bolsas de papas")));

            Datos[x] = p;
        }
    }

    public void MostrarDatos() {
        int x;
        String s = "";
        for (x = 0; x < Datos.length; x++) {
            s = s + Datos[x].getNombreSucu() + "     " + Datos[x].getUbicacion() + "            " + Datos[x].getCantPanHam() + "                      "
                    + Datos[x].getCantCarneHam() + "                " + Datos[x].getQueso() + "             " + Datos[x].getCantSalsa() + "                "
                    + " " + Datos[x].getCantPanHot() + "                "
                    + Datos[x].getCantSalchicha() + "                    " + Datos[x].getBolsaPapas() + "\n";

        }
        JOptionPane.showMessageDialog(null, " EL INVENTARIO DE LAS SUCURSALES \n\n"
                + "Sucursal     Ubicacion        Pan Ham         Carne        Queso     Salsa    Pan HotDog     Salchicha      Papas\n"
                + s);
    }

    public void Ventas1() {
              
            do {
            sucursal = Byte.parseByte(JOptionPane.showInputDialog(null, "Ventas\n\n"
                    + "1. Agregar Ventas Sucursal "+Datos[0].getNombreSucu()+"\n"
                    + "2. Agregar Ventas Sucursar "+Datos[1].getNombreSucu()+"\n"
                    + "3. Regresar al Menu principal\n\n"
                    + "Digite su opción:"));
            switch (sucursal) {
                case 1: {
                    int HamburguesaVend1 = 0;
                    int HotVendido1 = 0;
                    int PapasVendido1 = 0;
                    String s="";
                    HamburguesaVend1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de hamburguesas vendidas de la sucursal 1"));
                    HotVendido1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de hot Dog vendidas vendidas de la sucursal 1"));
                    PapasVendido1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de papas vendidas vendidas de la sucursal 1"));
                       
                    Sucursal l=new Sucursal();
                    l.setNombreSucu(Datos[0].getNombreSucu());
                    l.setUbicacion(Datos[0].getUbicacion());
                    l.setCantCarneHam(Datos[0].getCantCarneHam()-HamburguesaVend1);
                    l.setCantPanHam(Datos[0].getCantPanHam()-HamburguesaVend1);
                    l.setQueso(Datos[0].getQueso()-HamburguesaVend1);
                    l.setCantSalsa(Datos[0].getCantSalsa()-HamburguesaVend1);
                    
                    l.setCantPanHot(Datos[0].getCantPanHot()-HotVendido1);
                    l.setCantSalchicha(Datos[0].getCantSalchicha()-HotVendido1);
                    
                    l.setBolsaPapas(Datos[0].getBolsaPapas()-PapasVendido1);
                    Datos[0]=l;
                    s=s+"Carne     Pan Hamb   Queso    Salsa\n";
                    s=s+Datos[0].getCantCarneHam()+"                "+Datos[0].getCantPanHam()+"                   "+Datos[0].getQueso()+"          "+Datos[0].getCantSalsa()+"\n";
                    s=s+"Pan HotDog      salchicha \n"+Datos[0].getCantPanHot()+"                               "+Datos[0].getCantSalchicha()+"\n";
                    s=s+"Papas\n"+Datos[0].getBolsaPapas();
                    JOptionPane.showMessageDialog(null,"Inventario Actual\n"+s); 
                    
                    break;
                }
                case 2: {
                    int HamburguesaVend2 = 0;
                    int HotVendido2 = 0;
                    int PapasVendido2 = 0;

                    String s="";
                    HamburguesaVend2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de hamburguesas vendidas de la sucursal 2"));
                    HotVendido2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de hot Dog vendidas vendidas de la sucursal 2"));
                    PapasVendido2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de papas vendidas vendidas de la sucursal 2"));
                       
                    Sucursal l=new Sucursal();
                    l.setNombreSucu(Datos[1].getNombreSucu());
                    l.setUbicacion(Datos[1].getUbicacion());
                    l.setCantCarneHam(Datos[1].getCantCarneHam()-HamburguesaVend2);
                    l.setCantPanHam(Datos[1].getCantPanHam()-HamburguesaVend2);
                    l.setQueso(Datos[1].getQueso()-HamburguesaVend2);
                    l.setCantSalsa(Datos[1].getCantSalsa()-HamburguesaVend2);
                    
                    l.setCantPanHot(Datos[1].getCantPanHot()-HotVendido2);
                    l.setCantSalchicha(Datos[1].getCantSalchicha()-HotVendido2);
                    
                    l.setBolsaPapas(Datos[1].getBolsaPapas()-PapasVendido2);
                    Datos[1]=l;
                    s=s+"Carne     Pan Hamb   Queso    Salsa\n";
                    s=s+Datos[1].getCantCarneHam()+"                "+Datos[1].getCantPanHam()+"                   "+Datos[1].getQueso()+"          "+Datos[1].getCantSalsa()+"\n";
                    s=s+"Pan HotDog      salchicha \n"+Datos[1].getCantPanHot()+"                               "+Datos[1].getCantSalchicha()+"\n";
                    s=s+"Papas\n"+Datos[1].getBolsaPapas();
                    JOptionPane.showMessageDialog(null,"Inventario Actual\n"+s);       
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null,"Gracias");
                    break;
                }
            }
             
        }while (sucursal!= 3);

    }
    public void EvaluoInventario(){
        int CantHam;
        int CantHot;
        int CantPapas;
        int x;
        
        for(x=0;x<2;x++){
            
            CantHam=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de Hamburguesas que espera vender el dia de mañana en sucursal "+Datos[x].getNombreSucu()));
            if (CantHam<=Datos[x].getCantCarneHam()&& CantHam<=Datos[x].getCantPanHam()&& CantHam<=Datos[x].getQueso()&& CantHam<=Datos[x].getCantSalsa()){
                JOptionPane.showMessageDialog(null,"Tiene el inventario completo para poder vender las Hamburguesas");
            }else{
                JOptionPane.showMessageDialog(null,"El inventario de productos no esta completo, debe llamar al proveedor");
            }
            
           CantHot=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de Hot Dog que espera vender el dia de mañana en sucursal "+Datos[x].getNombreSucu())); 
           if (CantHot<=Datos[x].getCantPanHot()&& CantHot<=Datos[x].getCantSalchicha()){
                JOptionPane.showMessageDialog(null,"Tiene el inventario completo para poder vender Hot Dog");
            }else{
                JOptionPane.showMessageDialog(null,"El inventario de productos no esta completo, debe llamar al proveedor");
            }
           
           CantPapas=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de Papas que espera vender el dia de mañana en sucursal "+Datos[x].getNombreSucu()));
            if (CantPapas<=Datos[x].getBolsaPapas()){
                JOptionPane.showMessageDialog(null,"Tiene el inventario completo para poder vender Hot Dog");
            }else{
                JOptionPane.showMessageDialog(null,"El inventario de productos no esta completo, debe llamar al proveedor");
            }
        }
    }
       
        
        
    
}
