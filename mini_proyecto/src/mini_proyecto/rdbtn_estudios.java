package mini_proyecto;

public class rdbtn_estudios {
    static String estudio_res = "default";
    
    public String liceo(int option) {
        
        switch(option) {
            case 1:
                estudio_res = "Basica";
                return estudio_res;
            case 2:
                estudio_res = "Secundaria";
                return estudio_res;
            case 3:
                estudio_res = "Superior";
                return estudio_res;
            case 4:
                estudio_res = "Maestria";
                return estudio_res;
        }
        return null;
    
    }
}
