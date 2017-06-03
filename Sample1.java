abstract interface iMatrix{
    abstract int get(int i,int j);
    abstract void set(int i,int j,int k);
    abstract iMatrix multiple(iMatrix B);
    abstract void show();
}
class Matrix implements iMatrix{
    private int x[][];
    Matrix(int x11,int x12,int x21,int x22){
        x[0][0] = x11;
        x[0][1] = x12;
        x[1][0] = x21;
        x[1][1] = x22;
    }
    public void show(){
        System.out.println(x[0][1]+"\t"+x[0][1]);
        System.out.println(x[1][0]+"\t"+x[1][1]);
    }
    public int get(int i, int j) {
        return x[i][j];
    }
 
    public void set(int i, int j, int k) {
        x[i][j]=k;
    }
 
    double[][] multiple(Matrix[][] A, double[][] B) {
		double[][] C = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				double sum = 0;
				for (int k = 0; k < 3; k++) {
					sum += A[i][k] * B[k][j];
				}
				C[i][j] = sum;
			}
		}
		return C;
	}
}
public class Sample1 {
 
    public static void main(String[] args) {
        Matrix a = new Matrix(1,2,3,4);
        Matrix b = new Matrix(5,6,7,8);
        iMatrix c =new Matrix();
        c.multiple(a,b);
        a.show();
        b.show();
        c.show();
 
    }
 
}