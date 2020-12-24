/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import matrices.utils.ImprimirArreglos;



/**
 *
 * @author ING. DE SISTEMAS
 */
public class MatricesTransformadas {
    
    public static void main(String[] args) {
        // TODO code application logic here
         MatricesTransformadas mt=new MatricesTransformadas(); 
         mt.ia.imprimirMatriz(mt.transformada33(5, 0));
    }
    
    ImprimirArreglos ia=new ImprimirArreglos();
    
    public int[][] transformada33(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    for(int v=0; v<dimen/2; v++){
        for(int ls=dimen-v-1;ls>v; ls--){
            matriz[v][ls]=numInit;
            numInit++;            
        }
        for(int ld=v;ld<dimen-1-v; ld++){
            matriz[ld][v]=numInit;
            numInit++;            
        }        
        for(int li=v;li<dimen-1-v; li++){
            matriz[dimen-1-v][li]=numInit;
            numInit++;            
        }  
        for(int liz=dimen-1-v;liz>v; liz--){
            matriz[liz][dimen-v-1]=numInit;
            numInit++;            
        }              
    }
    if(dimen%2!=0){
        matriz[dimen/2][dimen/2]=numInit;
    }

    return matriz;
}
}

