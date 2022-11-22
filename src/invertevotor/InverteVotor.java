package invertevotor;

import java.util.Arrays;

public class InverteVotor {
public static void main(String[] args) {
int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13};

    System.out.println(Arrays.toString(invertVetor(vetor,0)));
    
    
}
static int[]invertVetor(int[]x,int P1){
    
    if(P1 == (x.length/2)){
        return x;
    }
    else{
        
        int aux = x[P1];
        x[P1] = x[x.length-1-P1];
        x[x.length-1-P1] = aux;
    }
    return invertVetor(x,P1+1);
}    
}
