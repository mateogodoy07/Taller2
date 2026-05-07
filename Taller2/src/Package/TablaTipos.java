package Package;

public class TablaTipos {
    
    // Matriz de efectividad
    private static final double[][] EFECTIVIDAD = {
        // NOR  FUE  AGU  PLA  ELE  HIE  LUC  VEN  TIE  VOL  PSI  BIC  ROC  FAN  DRA  ACE  SIN  HAD
        {  1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 0.0, 1.0, 0.5, 1.0, 1.0 }, // NORMAL
        {  1.0, 0.5, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 1.0 }, // FUEGO
        {  1.0, 2.0, 0.5, 0.5, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0, 1.0 }, // AGUA
        {  1.0, 0.5, 2.0, 0.5, 1.0, 1.0, 1.0, 0.5, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 0.5, 0.5, 1.0, 1.0 }, // PLANTA
        {  1.0, 1.0, 2.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.0, 2.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0 }, // ELECTRICO
        {  1.0, 0.5, 0.5, 2.0, 1.0, 0.5, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0 }, // HIELO
        {  2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 0.5, 0.5, 0.5, 2.0, 0.0, 1.0, 2.0, 2.0, 0.5 }, // LUCHA
        {  1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.5, 0.5, 1.0, 0.0, 1.0, 2.0 }, // VENENO
        {  1.0, 2.0, 1.0, 0.5, 2.0, 1.0, 1.0, 2.0, 1.0, 0.0, 1.0, 0.5, 2.0, 1.0, 1.0, 2.0, 1.0, 1.0 }, // TIERRA
        {  1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 0.5, 1.0, 1.0 }, // VOLADOR
        {  1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 0.5, 0.0, 1.0 }, // PSIQUICO
        {  1.0, 0.5, 1.0, 2.0, 1.0, 1.0, 0.5, 0.5, 1.0, 0.5, 2.0, 1.0, 1.0, 0.5, 1.0, 0.5, 2.0, 0.5 }, // BICHO
        {  1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0 }, // ROCA
        {  0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 1.0, 0.5, 1.0 }, // FANTASMA
        {  1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.0 }, // DRAGON
        {  1.0, 0.5, 0.5, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 0.5, 1.0, 2.0 }, // ACERO
        {  1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 1.0, 0.5, 0.5 }, // SINIESTRO
        {  1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 2.0, 1.0 }  // HADA
    };
    public static double ObtenerEfectividad(String MiTipo,String TipoRival) {
		int IMT= 0; // IMT = Indice Mi Tipo
		int ITR = 0; // ITR = Indice Tipo Rival
		double TotalEfectividad = 0;
		if(MiTipo == "Normal") {
			IMT = 0;
		}
		if(MiTipo == "Fuego") {
			IMT = 1;
		}
		if(MiTipo == "Agua") {
			IMT = 2;
		}
		if(MiTipo == "Planta") {
			IMT = 3;
		}
		if(MiTipo == "Electrico") {
			IMT = 4;
		}
		if(MiTipo == "Hielo") {
			IMT = 5;
		}
		if(MiTipo == "Lucha") {
			IMT = 6;
		}
		if(MiTipo == "Veneno") {
			IMT = 7;
		}
		if(MiTipo == "Tierra") {
			IMT = 8;
		}
		if(MiTipo == "Volador") {
			IMT = 9;
		}
		if(MiTipo == "Psiquico") {
			IMT = 10;
		}
		if(MiTipo == "Bicho") {
			IMT = 11;
		}
		if(MiTipo == "Roca") {
			IMT = 12;
		}
		if(MiTipo == "Fantasma") {
			IMT = 13;
		}
		if(MiTipo == "Dragon") {
			IMT = 14;
		}
		if(MiTipo == "Acero") {
			IMT = 15;
		}
		if(MiTipo == "Siniestro") {
			IMT = 16;
		}
		if(MiTipo == "Hada") {
			IMT = 17;
		}
		if(TipoRival == "Normal") {
			ITR = 0;
		}
		if(TipoRival == "Fuego") {
			ITR = 1;
		}
		if(TipoRival == "Agua") {
			ITR = 2;
		}
		if(TipoRival == "Planta") {
			ITR = 3;
		}
		if(TipoRival == "Electrico") {
			ITR = 4;
		}
		if(TipoRival == "Hielo") {
			ITR = 5;
		}
		if(TipoRival == "Lucha") {
			ITR = 6;
		}
		if(TipoRival == "Veneno") {
			ITR = 7;
		}
		if(TipoRival == "Tierra") {
			ITR = 8;
		}
		if(TipoRival == "Volador") {
			ITR = 9;
		}
		if(TipoRival == "Psiquico") {
			ITR = 10;
		}
		if(TipoRival == "Bicho") {
			ITR = 11;
		}
		if(TipoRival == "Roca") {
			ITR = 12;
		}
		if(TipoRival == "Fantasma") {
			ITR = 13;
		}
		if(TipoRival == "Dragon") {
			ITR = 14;
		}
		if(TipoRival == "Acero") {
			ITR = 15;
		}
		if(TipoRival == "Siniestro") {
			ITR = 16;
		}
		if(TipoRival == "Hada") {
			ITR = 17;
		}
		
		for (int i = 0; i < EFECTIVIDAD.length; i++) {
			for(int j = 0;j < EFECTIVIDAD.length;j++) {
				if(EFECTIVIDAD[i][j]== EFECTIVIDAD[IMT][ITR]) {
					TotalEfectividad = EFECTIVIDAD[i][j];
					return TotalEfectividad;
					
				}
			}
			
		}return -1;
		
	}
}

