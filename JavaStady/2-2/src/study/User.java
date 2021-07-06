package study;

/**
 * User.java
 */
class User {

    // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public User(String userName, int id, String password) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」

    protected void printAccountInfo() {}
    
    	public void showName() {
    		System.out.println("ユーザー名は"+ this.userName +"です。");
    	}
    	public void showId() {
    		System.out.println("IDは"+ this.id);
    	}
    	public void showPassword() {
    		System.out.println("パスワードは"+ this.password);
    	}
    }


    
    	 