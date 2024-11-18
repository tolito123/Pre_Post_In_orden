package pre_post_in_orden;

public class Pre_Post_In_Orden {

    public static void main(String[] args) {
        Arbol obj = new Arbol();
        obj.insetar( 24, "  ");
        obj.insetar( 12, " ");
        obj.insetar( 5, "  ");
        obj.insetar( 16, " ");
        obj.insetar( 20, " ");
        obj.insetar( 30, "  ");
        
        System.out.println("El PreOrden es: ");
        obj.Preorden(obj.raiz);
        
        System.out.println("El InOrden es: ");
        obj.InOrden(obj.raiz);
        
        System.out.println("El PostOrden es: ");
        obj.PostOrden(obj.raiz);
    }
    
}
