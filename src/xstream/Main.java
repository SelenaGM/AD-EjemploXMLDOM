package xstream;

import com.thoughtworks.xstream.XStream;
import modelos.Empleado;

public class Main {
    public static void main(String[] args) {
        //Con la libreria xstream thoughtworks 1.4.19 podemos crear el formato XML solo con esto
        Empleado empleado = new Empleado(1,"Garcia",20,2456.45f);

        XStream xStream = new XStream();
        //para que pueda tener acceso a los modelos
        xStream.allowTypesByWildcard(new String[]{
                "modelos.*"
        });


        String xml =xStream.toXML(empleado);
        System.out.println(xml);

        Empleado empleado2 = new Empleado();
        xStream.fromXML(xml,empleado2);
        System.out.println(empleado2); //para ver que nos ha creado el objeto



    }
}
