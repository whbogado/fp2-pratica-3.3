import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        Matriz transp = orig.getTransposta();
        System.out.println("Matriz original: " + orig);
        System.out.println("Matriz transposta: " + transp);
        
        Matriz A = new Matriz(3, 2);
        double a[][] = A.getMatriz();
        a[0][0] = 0.0;
        a[0][1] = 0.1;
        a[1][0] = 1.0;
        a[1][1] = 1.1;
        a[2][0] = 2.0;
        a[2][1] = 2.1;
        System.out.println("Matriz A: " + A);

        Matriz B = new Matriz(2, 4);
        double[][] b = B.getMatriz();
        b[0][0] = 0.0;
        b[0][1] = 0.1;
        b[0][2] = 0.2;
        b[0][3] = 0.3;
        b[1][0] = 1.0;
        b[1][1] = 1.1;
        b[1][2] = 1.2;
        b[1][3] = 1.3;       
        System.out.println("Matriz B: " + B);
        
        Matriz C;
        C = orig.soma(A);
        System.out.println("Matriz original + B: " + C);
        
        C = A.prod(B);
        System.out.println("A x B: " + C);
    }
}
