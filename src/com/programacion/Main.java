package com.programacion;

import com.principal.FactoryIn;
import com.principal.FactoryOut;
import com.principal.InterfaceComun;

public class Main {

    public static void main(String[] args) {
        InterfaceComun miSalida,misalida2,misalida3,miEntrada1,miEntrada2;
        miSalida=FactoryOut.getProductoSalida(1);
        miSalida.visualizar("Hola");
        misalida2= FactoryOut.getProductoSalida(2);
        misalida2.visualizar("Adios");
        misalida3=FactoryOut.getProductoSalida(3);
        misalida3.visualizar("Imprimiendo por impresora");
        miEntrada1= FactoryIn.getProductoEntrada(1);
        miEntrada1.introducirDatos();
        miEntrada2=FactoryIn.getProductoEntrada(2);
        miEntrada2.introducirDatos();
    }
}
