
public class Hello {

	public static void main(String[] args) {
//		String age = "31";
////		文字列を数値に変換する
//		int n = Integer.parseInt(age); 
//		System.out.println
//			("あなたは来年、" + (n + 1) + "歳になりますね。");
//		
////		乱数を発生させる（上限つき）
//		int r = new java.util.Random() .nextInt(90);
//		System.out.println("あなたはたぶん" + r + "歳ですね？");
//		
//		キーボードから入力を受け付ける命令
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in) .nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in) .nextInt();
		System.out.println
			("ようこそ" + age + "歳の" + name + "さん");
		
		
		
		  }
			
	}


