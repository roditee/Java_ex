package AbstractInterface;

class Animal {
	String name;
	public void setName(String name) {this.name = name;}
}

interface Ground {}
interface Birds {public String getAction();}
interface Foodable {public void food();}
//�������̽����� �ϳ��� ��ġ��
//�������̽��� extends�� ���ؼ� ���� ���� �������̽��� ���߻�� �޴� ���� ���� (Ŭ������ ���߻�� �޴� ���� �Ұ���)
interface GroundFoodable extends Ground, Foodable {}

class Tiger extends Animal implements GroundFoodable{public void food() { System.out.println("��");}}
class Monkey extends Animal implements Ground, Foodable{public void food() { System.out.println("�ٳ���");}}
class Lion extends Animal implements Ground, Foodable{public void food() { System.out.println("�Ұ��");}}
class Eagle extends Animal implements Birds, Foodable{
	public String getAction() {return "Fly";}
	public void food() { System.out.println("������");}
	}
class Duck extends Animal implements Birds, Foodable{
	public String getAction() {return "Fly";}
	public void food() { System.out.println("�����");}
	}
class Ostrich extends Animal implements Birds, Foodable{
	public String getAction() {return "Walk";}
	public void food() { System.out.println("���");}
	}

class Zoo {
	public void action (Ground ground) {System.out.println("Walk");}
	public void action (Birds bird) {System.out.println(bird.getAction());}
//	public void food (Animal animal) { //������ ���� ������ �ٸ��� ǥ��
//		if (animal instanceof Tiger) System.out.println("��");
//		else if (animal instanceof Monkey) System.out.println("�ٳ���");
//		else if (animal instanceof Lion) System.out.println("�Ұ��");
//		else if (animal instanceof Eagle) System.out.println("������");
//	}
//	�� �ڵ���� �Ʒ� �� �ٷ� �ٲ� �� ����
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