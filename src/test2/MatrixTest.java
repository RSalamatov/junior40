package test2;

import junit.framework.TestCase;

public class MatrixTest extends TestCase {


    public void determinantTest1() {

        double[][] forMatrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        Matrix matrix = new Matrix(forMatrix);

        double resultFact = matrix.determinant();
        double resultWant = 0.0;

        assertEquals(resultFact, resultWant);

    }



    public void determinantTest2() {

        double[][] forMatrix = {{-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}};

        Matrix matrix = new Matrix(forMatrix);

        double resultFact = matrix.determinant();
        double resultWant = 0.0;

        assertEquals(resultFact, resultWant);

    }
}