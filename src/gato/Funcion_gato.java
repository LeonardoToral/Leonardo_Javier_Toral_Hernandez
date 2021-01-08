package gato;


public class Funcion_gato {
    private static String playera1, playera2, turno;
    private static final char matriz[][] = new char[3][3];
    private static int tirada;
    
    public void inicio(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Funcion_gato.matriz[i][j] = 'A';
            }
        }
        Funcion_gato.tirada = 0;
        turno = "X";
    }
    public void player1 (String name){
        Funcion_gato.playera1 = name;
    }
    
    public String obtener_jugador1(){
        return playera1;
    }
    
    public void player2 (String name2){
        Funcion_gato.playera2 = name2;
    }
    
    public boolean vacia(int fila1, int columna1){
        boolean bandera = false;
        if(matriz[fila1][columna1]=='A'){
            bandera = true;
        }
        return bandera;
    }
    
    public String tirada (int fila , int columna){
        String devolver = "";
        Funcion_gato.tirada = tirada+1;
        if(turno.equals("X")){
            matriz[fila][columna]='X';
            Funcion_gato.turno = "0";
            devolver = "X";
        }
        else{
            matriz[fila][columna] = 'O';
            Funcion_gato.turno = "X";
            devolver = "O";
        }
        return devolver;
    }
    
    public String comprobar(){
        String comprobar1 = "";
        if(tirada>=5){
            for(int i=0;i<3;i++){
                if((matriz[i][0]=='X' && matriz[i][1]=='X'&&matriz[i][2]=='X')||(matriz[0][i]=='X'&&matriz[1][i]=='X'&&matriz[2][i]=='X')){
                    comprobar1 = playera1;
                }
                if((matriz[i][0]=='O' && matriz[i][1]=='O' && matriz[i][2]=='O')||(matriz[0][i]=='O' && matriz[1][i]=='O'&&matriz[2][i]=='O')){
                    comprobar1 = playera2;
                }
            }
            if(comprobar1.equals("")){
                if((matriz[0][0]=='X'&&matriz[1][1]=='X'&&matriz[2][2]=='X')||(matriz[0][2]=='X'&&matriz[1][1]=='X'&&matriz[2][0]=='X')){
                    comprobar1 = playera1;
                }
                if((matriz[0][0]=='O'&&matriz[1][1]=='O'&&matriz[2][2]=='O')||(matriz[0][2]=='O'&&matriz[1][1]=='O'&&matriz[2][0]=='O')){
                    comprobar1 = playera2;
                }
                if(comprobar1.equals("")&&tirada==9){
                    comprobar1 = "EMPATE";
                }
            }
        }
        return comprobar1;
    }
    
    public int puntos(){
        return tirada;
    }
}
