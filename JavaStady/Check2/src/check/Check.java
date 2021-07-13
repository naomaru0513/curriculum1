package check;

import constants.Constants;

public class Check {

	private String firstName;
	private String lastName;

	public Check() {
		this.firstName="Koyama";
		this.lastName="Naoaki";
	}

	private void printName(String LAST_NAME,String FIRST_NAME) {
		System.out.println(LAST_NAME + FIRST_NAME);
	}

	public static void main(String[] args) {

	 Check check = new Check();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);


		System.out.print("printNameメソッド→");
		check.printName(check.lastName, check.firstName);
		pet.introduce();
		robotPet.introduce();

}
}
//【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
//firstName →　自分の名字　lastName →　自分の名前で初期化しなさい
//なお、変数のアクセス修飾子は「private」とする。
//【Check.java】にてfirstNameとlastNameを引数で受け取って、
//連結して表示させるメソッド「printName」を作成しなさい。
//作成した関数のアクセス修飾子は「private」とする