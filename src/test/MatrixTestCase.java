package test;

import junit.framework.TestCase;
import org.junit.Test;

public class MatrixTestCase extends TestCase {

    public void testDeterminantTest1() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest2() {

        double[][] forMatrix = {{-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest3() {

        double[][] forMatrix = {{64564855, 3483832, 24565646},
                {89679636, 7896796, 67679678},
                {87678678, 45637988, 86486355}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 1.085088545630583778678654456456456454564870;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest4() {

        double[][] forMatrix = {{-6456485, -3483832, -2456564},
                {-8967963, -7896796, -6767967},
                {-8767868, -4563798, -86486355}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 108508850728346450000.0;
        assertEquals(resultFact, resultWant);

    }

    public void testDeterminantTest5() {

        double[][] forMatrix = {{-1, -2, -3},
                {4, 5, 6},
                {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testAddTest1() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    @Test(expected = NullPointerException.class)
    public void testAddTest2() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTest3() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {2, 5, 6}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testAddTest4() {

        double[][] forMatrixA = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixB = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixC = {{199999998, 199999998, 199999998},
                {199999998, 199999998, 199999998},
                {199999998, 199999998, 199999998}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testAddTest5() {

        double[][] forMatrixA = {{-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999}};
        double[][] forMatrixB = {{-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999}};
        double[][] forMatrixC = {{-19999998, -19999998, -19999998},
                {-19999998, -19999998, -19999998},
                {-19999998, -19999998, -19999998}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testAddTest6() {

        double[][] forMatrixA = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.add(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testSubTest1() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixC = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }

    @Test(expected = NullPointerException.class)
    public void testSubTest2() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSubTest3() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testSubTest4() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}};
        double[][] forMatrixC = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }

    public void testSubTest5() {
        double[][] forMatrixA = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixB = {{99999998, 99999998, 99999998},
                {99999998, 99999998, 99999998},
                {99999998, 99999998, 99999998}};
        double[][] forMatrixC = {{1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testSubTest6() {

        double[][] forMatrixA = {{-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}};
        double[][] forMatrixB = {{-2, -3, -4},
                {-5, -6, -7},
                {-8, -9, -10}};
        double[][] forMatrixC = {{3, 5, 7},
                {9, 11, 13},
                {15, 17, 19}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulTest1() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{-2, -3, -4},
                {-5, -6, -7},
                {-8, -9, -10}};
        double[][] forMatrixC = {{-36, -42, -48},
                {-81, -96, -111},
                {-126, -150, -174}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    @Test(expected = NullPointerException.class)
    public void testMulTest2() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] forMatrixC = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testMulTest3() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {2, 5, 6}};
        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulTest4() {
        double[][] forMatrixA = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixB = {{99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999},
                {99999999, 99999999, 99999999}};
        double[][] forMatrixC = {{299999994, 299999994, 299999994},
                {299999994, 299999994, 299999994},
                {299999994, 299999994, 299999994}};

        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.sub(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulTest5() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        double[][] forMatrixC = {{2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulTest6() {

        double[][] forMatrixA = {{-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999}};
        double[][] forMatrixB = {{-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999},
                {-9999999, -9999999, -9999999}};
        double[][] forMatrixC = {{29999994, 29999994, 29999994},
                {29999994, 29999994, 29999994},
                {29999994, 29999994, 29999994}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix matrixB = new Matrix(forMatrixB);
        Matrix resultWant = new Matrix(forMatrixC);
        IMatrix resultFact = matrixA.mul(matrixB);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest1() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = 1;
        double[][] forMatrixB = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest2() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = -1;
        double[][] forMatrixB = {{-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest3() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = 99999999;
        double[][] forMatrixB = {{99999999, 199999998, 299999997},
                {399999996, 499999995, 599999994},
                {699999993, 799999992, 899999991}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest4() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = -99999999;
        double[][] forMatrixB = {{-99999999, -199999998, -299999997},
                {-399999996, -499999995, -599999994},
                {-699999993, -799999992, -899999991}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testMulOnTheNumberTest5() {

        double[][] forMatrixA = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        double value = 0;
        double[][] forMatrixB = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrixA = new Matrix(forMatrixA);
        Matrix resultWant = new Matrix(forMatrixB);

        IMatrix resultFact = matrixA.mul(value);

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest1() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] MatrixResult = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest2() {

        double[][] forMatrix = {{-9999999, -9999999, -9999999},
                {9999999, 9999999, 9999999},
                {9999999, 9999999, 9999999}};
        double[][] MatrixResult = {{-9999999, 9999999, 9999999},
                {-9999999, 9999999, 9999999},
                {-9999999, 9999999, 9999999}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest3() {

        double[][] forMatrix = {{1, 2, 3},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] MatrixResult = {{1, 0, 0},
                {2, 0, 0},
                {3, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest4() {

        double[][] forMatrix = {{1, 0, 0},
                {2, 0, 0},
                {3, 0, 0}};
        double[][] MatrixResult = {{1, 2, 3},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }
    public void testTransposeTest5() {

        double[][] forMatrix = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        double[][] MatrixResult = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix resultWant = new Matrix(MatrixResult);
        IMatrix resultFact = matrix.transpose();

        assertEquals(resultFact, resultWant);
    }

}

