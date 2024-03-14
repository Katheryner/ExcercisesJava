import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventario objInventario = new Inventario();

        Producto pro1 = new Producto(1, "lapiz", 2000);
        Producto pro2 = new Producto(2, "cuaderno", 7000);

        objInventario.agregarProducto(pro1);
        objInventario.agregarProducto(pro2);

        int option = 0;

        do {
            try {
                option = Integer.parseInt(JOptionPane.showInputDialog("MENU\n" +
                        "1. Agregar producto" +
                        "2. Eliminar producto" +
                        "3. Mostrar todos los productos" +
                        "4. Buscar producto" +
                        "5. Salir"));

                switch (option) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog("Ingrese el producto");
                        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el producto"));
                        Producto newProduct = new Producto(3,nombre,precio);
                        objInventario.agregarProducto(newProduct);

                        break;

                    case 2:
                        String deleteProducto = JOptionPane.showInputDialog("Ingrese el producto para eliminar");

                        objInventario.eliminarProducto(4);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Caracteres no válidos");
            }

        }while (option != 5) ;

    }
}