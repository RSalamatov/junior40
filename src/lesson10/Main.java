package lesson10;

public class Main {
    public static void main(String[] args) {
        double[][] forA = {{2, 3, 5, 7},
                           {3, 7, 5, 2},
                           {1, 3, 4, 6}};

        double[][] forB = {{1, 2, 4, 8},
                           {2, 5, 5, 1},
                           {2, 5, 2, 1}};



        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);


//        IMatrix resultAdd = a.add(b);
//        resultAdd.printToConsole();
    }
}
