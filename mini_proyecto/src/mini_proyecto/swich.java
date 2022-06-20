package mini_proyecto;
import javax.swing.*;

public class swich {
    static String res = "default";
    static POO jop = new POO();
    
    public String paises(int option) {
        
        switch(option) {
            case 1:
                res = "Colombia es un país soberano situado en la región noroccidental de América del Sur. El  cual Se constituye en un estado unitario, social y democrático de derecho cuya forma de gobierno es presidencialista. Es una república organizada políticamente en 32 departamentos descentralizados y el Distrito Capital de Bogotá, sede del Gobierno Nacional. \r\n\r\nSuperficie: 1 141 748 km² \r\nIdioma oficial: Español \r\nContinente: America del Sur.";
                return res;
            case 2:
                res = "República del Perú, es un país soberano ubicado en el oeste de América del Sur. El océano Pacífico bordea su costa y limita con Ecuador y Colombia al norte, Brasil al este, y Bolivia y Chile al sureste. Su territorio se compone de diversos paisajes: los valles, las mesetas y las altas cumbres de los Andes se despliegan al oeste hacia la costa desértica y el este hacia la Amazonia. Es uno de los países con mayor diversidad biológica y mayores recursos minerales del mundo. \r\n\r\nSuperficie: 1 285 216,20 km² \r\nIdioma: Español \r\nContinente: America del Sur";
                return res;
            case 3:
                res = "Brasil god";
                return res;
            case 4:
                res = "Italia es un país soberano transcontinental, miembro y fundador de la Unión Europea, constituido en una república parlamentaria compuesta por veinte regiones, integradas estas, a su vez, por 110 provincias. \r\n\r\nSuperficie: 301 340 km² \r\nIdioma: Italiano \r\nContinente: Europa Central";
                return res;
            case 5:
                res = "Polonia es un país de Europa Central, uno de los veintisiete estados soberanos que forman la Unión Europea, constituido en Estado democrático de derecho y cuya forma de gobierno es la república parlamentaria. \r\n\r\nSuperficie: 312 696 km² \r\nIdioma: Polaco \r\nContinente: Europa central";
                return res;
            case 6:
                res = "Reino Unido god";
                return res;
            case 7:
                res = "Oficialmente el Estado del Japón, es un país insular de Asia Oriental ubicado en el noroeste del océano Pacífico el cual limita con el mar de Japón al oeste y se extiende desde el mar de Ojotsk en el norte hasta el mar de China Oriental y Taiwán en el sur. \r\n\r\nSuperficie: 6852 islas que cubren 377 975 kilómetros cuadrados \r\nIdioma: Japonés \r\nContinente: Asia del Este";
                return res;
            case 8:
                res = "China god";
                return res;
        }
        return null;
    
    }
    
}
