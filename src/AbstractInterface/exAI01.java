package AbstractInterface;

class Animal {
	String name;
	public void setName(String name) {this.name = name;}
}

interface Ground {}
interface Birds {public String getAction();}
interface Foodable {public void food();}
//인터페이스들을 하나로 합치기
//인터페이스는 extends를 통해서 여러 개의 인터페이스를 다중상속 받는 것이 가능 (클래스는 다중상속 받는 것이 불가능)
interface GroundFoodable extends Ground, Foodable {}

class Tiger extends Animal implements GroundFoodable{public void food() { System.out.println("닭");}}
class Monkey extends Animal implements Ground, Foodable{public void food() { System.out.println("바나나");}}
class Lion extends Animal implements Ground, Foodable{public void food() { System.out.println("소고기");}}
class Eagle extends Animal implements Birds, Foodable{
	public String getAction() {return "Fly";}
	public void food() { System.out.println("지렁이");}
	}
class Duck extends Animal implements Birds, Foodable{
	public String getAction() {return "Fly";}
	public void food() { System.out.println("물고기");}
	}
class Ostrich extends Animal implements Birds, Foodable{
	public String getAction() {return "Walk";}
	public void food() { System.out.println("사료");}
	}

class Zoo {
	public void action (Ground ground) {System.out.println("Walk");}
	public void action (Birds bird) {System.out.println(bird.getAction());}
//	public void food (Animal animal) { //동물에 따라서 음식을 다르게 표현
//		if (animal instanceof Tiger) System.out.println("닭");
//		else if (animal instanceof Monkey) System.out.println("바나나");
//		else if (animal instanceof Lion) System.out.println("소고기");
//		else if (animal instanceof Eagle) System.out.println("지렁이");
//	}
//	위 코드들을 아래 한 줄로 바꿀 수 있음
	public void food(Foodable animal) { animal.food(); }
}

public class exAI01 {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Tiger tiger = new Tiger();
		Monkey monkey = new Monkey();
		Lion lion = new Lion();
		Eagle eagle = new Eagle();
		Duck duck = new Duck();
		Ostrich ostrich = new Ostrich();
		zoo.action(tiger);
		zoo.action(monkey);
		zoo.action(lion);
		zoo.action(eagle);
		zoo.action(duck);
		zoo.action(ostrich);
		
		zoo.food(tiger);
		zoo.food(monkey);
		zoo.food(ostrich);
	}
}