package context;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;

        //Menú
        while (opcion != 3) {

            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "MENU\n\n"
                            + "1. Suma\n"
                            + "2. Promedio\n"
                            + "3. Salir\n\n"
                            + "Elija una opción:"
                    )
            );

            switch (opcion) {

            case 1:
                int adicion = 0;
                int num = 1;

                while (num != 0) {
                    num = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Ingrese un número entero\n"
                                    + "(0 para salir):"
                            )
                    );
                    adicion += num;
                }
                JOptionPane.showMessageDialog(
                        null,
                        "Resultado: " + adicion
                );
                break;

            case 2:
                int n = 10;
                adicion = 0;

                for (int i = 1; i <= n; i++) {
                    num = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Ingrese el número " + i
                            )
                    );
                    adicion += num;
                }
                double prom = (double) adicion / n;
                JOptionPane.showMessageDialog(
                        null,
                        "Promedio: " + prom
                );
                break;

            case 3:
                JOptionPane.showMessageDialog(
                        null,
                        "Salir"
                );
                break;

            default:
                JOptionPane.showMessageDialog(
                        null,
                        "¡ERROR!\nNo existe dicha opción"
                );
                break;
            }
        }
    }
}