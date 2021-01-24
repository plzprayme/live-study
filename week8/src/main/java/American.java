class American implements Human {

    @Override
    public void breath() {
        for (int i=0; i<breathInterval; i++) {
            System.out.println("I can breath!");
        }
    }

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
