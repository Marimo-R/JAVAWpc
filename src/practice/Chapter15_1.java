package practice;

public class Chapter15_1 {
    public static void main(String[] args) {
        int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
    }

    // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
    	if (b == 0) {
    		return a;
    	}
    	return gcd(b, a % b);
    }
}
// ポイントはgcdメソッドは必ずint型の戻り値を返す必要があること
/* 
return gcd(b, a % b);の記述について、gcd(b, a % b)はint型なの??という疑問が湧くが、
b == 0がfalseで「return gcd(b, a % b)」が処理されるとき、整数を返すというよりは再度gcdメソッドを実行していると思われる
この繰り返しはb == 0がtrueになるまで繰り返される
そして、b==0になった時、始めてaがint型の戻り値として返される
この戻り値aはb == 0になる前に実行されたgcd(b, a % b)に返されており、更にその一回前に実行されたgcd(b, a % b）に返され...と繰り返される
最終的にはgcd(int a, int b)の戻り値となると解釈した
*/