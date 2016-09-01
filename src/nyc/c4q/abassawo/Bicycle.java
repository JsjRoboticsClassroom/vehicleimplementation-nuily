package nyc.c4q.abassawo;

/**
 * Created by c4q-ac29 on 8/31/16.
 */
    public void applyBrake(){

        // brake pedal needs to be stepped on
        // speed will decrease (vastly if pedal is pressed fully at once)


        initialSpeed = 0;
        System.out.println("Your speed is " + initialSpeed);

    }

    public void speedUp(int delta) {

        // accelerator speed determined by delta

        initialSpeed += delta;
        System.out.println("Your speed is " + initialSpeed);

    }

    public void slowDown(int delta) {

        initialSpeed -= delta;
        System.out.println("Your speed is " + initialSpeed);

    }

    // @Override is an annotation letting us know the method came from somewhere else

// andres arango

    @Override
    public boolean popAWheelie(int duration) {
        while(duration != 0){
            System.out.println("I'm poppping a wheeeelieeee");
            duration--;
        }
        return true;
    }
}
