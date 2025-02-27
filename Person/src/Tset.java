
public class Tset {

	public static void main(String[] args) {
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="090-0000-0000";
		taro.address="taro@gmail.com";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="090-0000-0001";
		jiro.address="jiro@gmail.com";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="090-0000-0002";
		hanako.address="hanako@gmail.com";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person kein=new Person();
		kein.name="工藤慶胤";
		kein.age=23;
		kein.phoneNumber="090-0000-0003";
		kein.address="kein@gmail.com";

		System.out.println(kein.name);
		System.out.println(kein.age);
		System.out.println(kein.phoneNumber);
		System.out.println(kein.address);
	}

}
