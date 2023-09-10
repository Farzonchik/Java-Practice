class Cat extends Animal {
    protected Cat(String name, String soundOfAnimal, int age) {
        super(name, soundOfAnimal, age);
    }

    @Override
    protected String makeSound() {
        return super.makeSound();
    }
}