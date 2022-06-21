package mini_proyecto;
import javax.swing.*;

public class swich {
    static String res = "default";
    
    public String paises(int option) {
        
        switch(option) {
            case 1:
                res = "Colombia es un país soberano situado en la región noroccidental de América del Sur. El  cual Se constituye en un estado unitario, social y democrático de derecho cuya forma de gobierno es presidencialista. Es una república organizada políticamente en 32 departamentos descentralizados y el Distrito Capital de Bogotá, sede del Gobierno Nacional. \r\n\r\nSuperficie: 1 141 748 km² \r\nIdioma oficial: Español \r\nContinente: America del Sur.";
                return res;
            case 2:
                res = "República del Perú, es un país soberano ubicado en el oeste de América del Sur. El océano Pacífico bordea su costa y limita con Ecuador y Colombia al norte, Brasil al este, y Bolivia y Chile al sureste. Su territorio se compone de diversos paisajes: los valles, las mesetas y las altas cumbres de los Andes se despliegan al oeste hacia la costa desértica y el este hacia la Amazonia. Es uno de los países con mayor diversidad biológica y mayores recursos minerales del mundo. \r\n\r\nSuperficie: 1 285 216,20 km² \r\nIdioma: Español \r\nContinente: America del Sur";
                return res;
            case 3:
                res = "Brasil, oficialmente República Federativa de Brasil (en portugués, República Federativa do Brasil) es un país soberano de América del Sur que comprende la mitad oriental del continente y algunos grupos de pequeñas islas en el océano Atlántico. Es el país más grande de América Latina. \r\n\r\nSuperficie: 8 515 770 km². \r\nIdioma: Portugués \r\nContinente: America del Sur";
                return res;
            case 4:
                res = "Italia es un país soberano transcontinental, miembro y fundador de la Unión Europea, constituido en una república parlamentaria compuesta por veinte regiones, integradas estas, a su vez, por 110 provincias. \r\n\r\nSuperficie: 301 340 km² \r\nIdioma: Italiano \r\nContinente: Europa Central";
                return res;
            case 5:
                res = "Polonia es un país de Europa Central, uno de los veintisiete estados soberanos que forman la Unión Europea, constituido en Estado democrático de derecho y cuya forma de gobierno es la república parlamentaria. \r\n\r\nSuperficie: 312 696 km² \r\nIdioma: Polaco \r\nContinente: Europa central";
                return res;
            case 6:
                res = "Reino unido es un país soberano e insular ubicado al noroeste de la Europa continental. Su territorio está formado geográficamente por la isla de Gran Bretaña, el noreste de la isla de Irlanda y pequeñas islas adyacentes. \r\n\r\nSuperficie: 243 610[1]​ km² \r\nIdioma: Inglés (de facto) \r\nContinente: Europa central";
                return res;
            case 7:
                res = "Oficialmente el Estado del Japón, es un país insular de Asia Oriental ubicado en el noroeste del océano Pacífico el cual limita con el mar de Japón al oeste y se extiende desde el mar de Ojotsk en el norte hasta el mar de China Oriental y Taiwán en el sur. \r\n\r\nSuperficie: 6852 islas que cubren 377 975 kilómetros cuadrados \r\nIdioma: Japonés \r\nContinente: Asia del Este";
                return res;
            case 8:
                res = "China (chino: 中国; pinyin: Zhōngguó), oficialmente la República Popular China (RPC; chino: 中华人民共和国; pinyin: Zhōnghuá Rénmín Gònghéguó), es un país del este de Asia. Es el país más poblado del mundo, con una población de más de 1.400 millones de habitantes. China abarca cinco zonas horarias geográficas y limita con 14 países, la segunda mayor cantidad de cualquier país del mundo después de Rusia. \r\n\r\nSuperficie: 9.562.910 km \r\nIdioma: Chino mandarín \r\nContinente: Asia del Este";
                return res;
        }
        return null;
    
    }
    
}
