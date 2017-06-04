abstract interface iMatrix{
    abstract int get(int i,int j);
    abstract void set(int i,int j,int k);
    abstract double[][] multiple(Matrix A, Matrix B);
    abstract void show();
}

class Matrix implements iMatrix{
    private int x[][] = new int[2][2];

    Matrix(int x11,int x12,int x21,int x22){
        x[0][0] = x11;
        x[0][1] = x12;
        x[1][0] = x21;
        x[1][1] = x22;
    }
    public void show(){
        System.out.println("|"+x[0][0]+"\t"+x[0][1]+"|");
        System.out.println("|"+x[1][0]+"\t"+x[1][1]+"|");
        System.out.println();
    }
    public int get(int i, int j) {
        return x[i][j];
    }
 
    public void set(int i, int j, int k) {
        x[i][j]=k;
    }
 
    public double[][] multiple(Matrix A, Matrix B) {
		double[][] C = new double[2][2]; // return用double配列
        int[][] intC = new int[2][2]; // メンバ変数用int配列
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
                double sum = 0;

				for (int k = 0; k < 2; k++) {
					sum += A.x[j][k] * B.x[k][i];
                    System.out.println(sum);
				}

				C[j][i] = sum;
                intC[j][i] = (int)sum;
			}
		}
        
    
        this.x = intC;
		return C;
	}
}

public class Sample1 {
 
    public static void main(String[] args) {
        Matrix a = new Matrix(1, 2, 3, 4);
        Matrix b = new Matrix(5, 6, 7, 8);
        Matrix c = new Matrix(0, 0, 0, 0);
        c.multiple(a,b);
        System.out.println();
        a.show();
        b.show();
        c.show();
 
    }
 
}