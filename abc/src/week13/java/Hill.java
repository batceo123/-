package week13.java;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import java.util.Scanner;

public class Hill {
    public static char[] zimubiao = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static String[] zhihuanbiao = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"
            , "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
            "26"};
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要加密的序列(4位)");
            String a = scanner.next();
            if (a.length()==4) {
                char[] chars = new char[a.length()];
                for (int i = 0; i < a.length(); i++) {
                    chars[i] = a.charAt(i);
                }
                double[][] b = new double[1][a.length()];
                for (int i = 0; i < a.length(); i++) {
                    for (int j = 0; j < zimubiao.length; j++) {
                        if (zimubiao[j] == chars[i]) {
                            b[0][i] = Integer.parseInt(zhihuanbiao[j]);
                        }
                    }
                }
                System.out.println("明文序列对应的数字矩阵是：");
                printArray(b);
                System.out.println();
                double[][] key = {
                        {8, 6, 9, 5},
                        {6, 9, 5, 10},
                        {5, 8, 4, 9},
                        {10, 6, 11, 4}
                };
                System.out.println("选择的密钥矩阵是：");
                printArray(key);
                double[][] miwen = encrypt(b, key);
                System.out.println("密文矩阵序列为：");
                printArray(miwen);
                System.out.println();
                System.out.println("解密后，明文矩阵序列为：");
                double[][] mingwen = decrypt(miwen, key);
                printArray(mingwen);
                System.out.println();
            }else {
                System.out.println("长度不正确请重新输入");
            }
        }
    }

    /**
     * @return double[][]
     * @author Fever1
     * @Description 解密运算
     * @Date 12:33 2019/1/7
     * @Param [miwen, key]
     **/
    private static double[][] decrypt(double[][] miwen, double[][] key) {
        RealMatrix key_1 = inverseMatrix(key);
        RealMatrix matrixmiwen = new Array2DRowRealMatrix(miwen);
        double[][] mingwen = matrixmiwen.multiply(key_1).getData();
        floodMod(mingwen);
        return mingwen;
    }

    /**
     * @return double[][]
     * @author Fever1
     * @Description 加密运算
     * @Date 12:34 2019/1/7
     * @Param [b, key]
     **/
    private static double[][] encrypt(double[][] b, double[][] key) {
        RealMatrix matrixb = new Array2DRowRealMatrix(b);
        RealMatrix matrixkey = new Array2DRowRealMatrix(key);
        double[][] matrixtoarray = matrixb.multiply(matrixkey).getData();
        floodMod(matrixtoarray);
        return matrixtoarray;
    }

    /**
     * @return void
     * @author Fever1
     * @Description 求包括负数与正数的Mod运算
     * @Date 12:33 2019/1/7
     * @Param [matrixtoarray1]
     **/
    private static void floodMod(double[][] matrixtoarray1) {
        for (int i = 0; i < matrixtoarray1.length; i++) {
            for (int j = 0; j < matrixtoarray1[i].length; j++) {

                if (matrixtoarray1[i][j] > 0) {
                    while (matrixtoarray1[i][j] >= 26) {
                        matrixtoarray1[i][j] = Math.round(matrixtoarray1[i][j] - 26);
                    }
                } else {
                    while (matrixtoarray1[i][j] < 0) {
                        matrixtoarray1[i][j] = Math.round(matrixtoarray1[i][j] + 26);
                    }
                }
            }
        }
    }

    /**
     * @return void
     * @author Fever1
     * @Description 遍历打印数组
     * @Date 22:47 2019/1/6
     * @Param [array]
     **/
    private static void printArray(double[][] array) {
        for (int t = 0; t < array.length; t++) {
            for (int y = 0; y < array[t].length; y++) {
                System.out.print((int) array[t][y] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * @return org.apache.commons.math3.linear.RealMatrix
     * @author Fever1
     * @Description 矩阵求逆
     * @Date 13:46 2018/12/26
     * @Param [A]
     **/
    public static RealMatrix inverseMatrix(double[][] a) {
        RealMatrix matrix = new Array2DRowRealMatrix(a);
        RealMatrix result = new LUDecomposition(matrix).getSolver().getInverse();
        return result;
    }
}

