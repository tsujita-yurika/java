
public class Hello {

	public static void main(String[] args) {

//		  演習問題
//		  int x = 5;
//		  int y = 10;
//		  String ans = "x+yは" + (x + y);
//		  System.out.println(ans);
		  
		  System.out.println("ようこそ占いの館へ");
		  System.out.println("あなたの名前を入力してください");
//		  入力を受け付け、Stringがたのnameへ格納
		  String name = new java.util.Scanner(System.in).nextLine();
		  System.out.println("あなたの年齢を入力してください");
//		  入力を受け付け、String型のageStringへ格納
		  String ageString = new java.util.Scanner(System.in).nextLine();
//		  ageStringをinteger型のageに格納
		  int age = Integer.parseInt(ageString);
//		  0..3までの乱数をfortuneに格納
		  int fortune = new java.util.Random().nextInt(3);
//		  fortuneの数字をインクリメント演算子で1増やし、1..4の乱数にする
		  fortune++;
		  System.out.println("占いの結果が出ました！");
		  System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		  System.out.println("1:大吉 2:中吉 3:吉 4:凶");
		  
		  }
			
	}


