package utfpr.ct.dainf.grader;

import utfpr.ct.dainf.if62c.pratica.Matriz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wilson
 */
public class TestUtils {
    public static MatrizTest getRandomMatriz(int n, int m) {
        MatrizTest mat = new MatrizTest(m, n);
        double[][] data = mat.getMatriz();
        for (double[] row: data) {
            for (double col: row) {
                col = Math.random()*10;
            }
        }
        return mat;
    }
    
    public static Matriz matrizCopy(MatrizTest mt) {
        Matriz mat = new Matriz(mt.getMatriz().length, mt.getMatriz()[0].length);
        for (int i = 0; i < mt.getMatriz().length; i++) {
            for (int j = 0; j < mat.getMatriz()[i].length; j++) {
                mat.getMatriz()[i][j] = mt.getMatriz()[i][j];
            }
        }
        return mat;
    }
    
    public static boolean somaMatrizTest(int n, int m) {
        MatrizTest matt1 = getRandomMatriz(n, m);
        MatrizTest matt2 = getRandomMatriz(n, m);
        Matriz mat1 = matrizCopy(matt1);
        Matriz mat2 = matrizCopy(matt2);
        MatrizTest mst = matt1.soma(matt2);
        Matriz ms = mat1.soma(mat2);
        return equalsMatriz(mst, ms);
    } 
    
    public static boolean prodMatrizTest(int n, int m) {
        MatrizTest matt1 = getRandomMatriz(n, m);
        MatrizTest matt2 = getRandomMatriz(m, n);
        Matriz mat1 = matrizCopy(matt1);
        Matriz mat2 = matrizCopy(matt2);
        MatrizTest mpt = matt1.prod(matt2);
        Matriz mp = mat1.prod(mat2);
        return equalsMatriz(mpt, mp);
    } 
    
    public static boolean equalsMatriz(MatrizTest mat1, Matriz mat2) {
        boolean eq = mat1.getMatriz().length == mat2.getMatriz().length;
        for (int i = 0; eq && i < mat1.getMatriz().length; i++) {
            eq = mat1.getMatriz()[i].length == mat2.getMatriz()[i].length; 
            for (int j = 0; eq && j < mat1.getMatriz()[i].length; j++) {
                eq = Math.abs(mat1.getMatriz()[i][j] - mat2.getMatriz()[i][j]) < 0.00001;
            }
        }
        return eq;
    }
}
