package pre_post_in_orden;

import java.util.Scanner;

public class Arbol {
    public Nodo raiz;
    
    public Arbol(){
        this.raiz=null;
    }
    
    public void insetar (int i, Object numN){
        
        Nodo n = new Nodo(i);
        n.valor=numN;
        
        if (raiz==null){
            raiz =n;
        }else{
            Nodo aux = raiz;
            while(aux != null){
                n.padre=aux;
                if(n.llave >= aux.llave){
                    aux=aux.derecha;
                }else{
                    aux=aux.izquierda;
                }
            }
            
            if(n.llave<n.padre.llave){
                n.padre.izquierda=n;
            }else{
                n.padre.derecha=n;
            }
        }
    }
    
    public void Preorden(Nodo n){
        
        if (n != null){
            System.out.println(""+n.llave+" "+n.valor);
            
            Preorden(n.izquierda);
            
            Preorden(n.derecha);
        }
    }
    public void InOrden(Nodo n){
        
            if (n == null)
                return;
            InOrden(n.izquierda);
            System.out.println(n.llave + " "+n.valor);
            InOrden(n.derecha);
        }
    public void PostOrden(Nodo n){
        
        if (n != null){
            
        
            
            PostOrden(n.izquierda);
            
            PostOrden(n.derecha);
            System.out.println(""+n.llave+" "+n.valor);
        }    
        
    }
    
    
}

