package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("������");
		Cat cat = new Cat("�ٴ�");
		
		dog.cry();
		cat.cry();
		dog.eat();
		cat.eat();
		
		dog.fishtail();
		cat.grooming();
		
		// ��ĳ����
		Animal animal = (Animal) new Dog("�˵���");
		animal.cry();
		// animal.fishtail();
		
		Animal animal2 = (Animal) new Cat("�ٴ�");
		animal2.cry();
		
		cryAnimal(animal);
		cryAnimal(animal2);
		
		// ���� �迭�� ���� ���� ������ �����Ѵ�.
		Dog[] dogs = new Dog[2];
		Animal[] animals = new Animal[2];
		animals[0] = dog;
		animals[1] = cat;
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].cry();
			animals[i].eat();
			
			// ������ ����ġ��
			// �ٿ� ĳ����
			if (animals[i] instanceof Dog) {
				Dog nu = (Dog)animals[i];
				nu.fishtail();
			}
			
			// ����� �׷��
			if (animals[i] instanceof Cat) {
				Cat bada = (Cat)animals[i];
				bada.grooming();
			}
		}
		
	}
	
	//�Ķ���ͷ� ���� ������ ��� �Ѵ�
	public static void cryAnimal(Animal animal) {
		animal.cry();
	}

}
