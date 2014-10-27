package utfpr.ct.dainf.grader;

import utfpr.ct.dainf.if62c.pratica.*;

/**
 * Representa uma matriz de valores {@code double}.
 * @author Wilson Horstmeyer Bogadao <wilson@utfpr.edu.br>
 */
public class MatrizTest {
    
    // a matriz representada por esta classe
    private final double[][] mat;
    
    /**
     * Construtor que aloca a matriz.
     * @param m O número de linhas da matriz.
     * @param n O número de colunas da matriz.
     */
    public MatrizTest(int m, int n) {
        mat = new double[m][n];
    }
    
    /**
     * Retorna a matriz representada por esta classe.
     * @return A matriz representada por esta classe
     */
    public double[][] getMatriz() {
        return mat;
    }
    
    /**
     * Retorna a matriz transposta.
     * @return A matriz transposta.
     */
    public MatrizTest getTransposta() {
        MatrizTest t = new MatrizTest(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }
    
    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser somada
     * @return A soma das matrizes
     */
    public MatrizTest soma(MatrizTest m) {
        MatrizTest ms = new MatrizTest(mat.length, mat[0].length);
        for (int i = 0; i < this.mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                ms.mat[i][j] = mat[i][j] + m.mat[i][j];
            }
        }
        return ms;
    }

    /**
     * Retorna o produto desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser multiplicada
     * @return O produto das matrizes
     */
    public MatrizTest prod(MatrizTest m) {
        MatrizTest mp = new MatrizTest(mat.length, m.mat[0].length);
        for (int i = 0; i < this.mat.length; i++) {
            for (int j = 0; j < m.mat[0].length; j++) {
                for (int k = 0; k < m.mat.length; k++) {
                    mp.mat[i][j] += mat[i][k] * m.mat[k][j];
                }
            }
        }
        return mp;
    }

    /**
     * Retorna uma representação textual da matriz.
     * Este método não deve ser usado com matrizes muito grandes
     * pois não gerencia adequadamente o tamanho do string e
     * poderia provocar um uso excessivo de recursos.
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: mat) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" ");
            }
            s.append("]");
        }
        return s.toString();
    }
    
}
