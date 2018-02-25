package br.com.designpatterns.behavioral.templatemethod;

public abstract class Gun {

    private boolean gunLoaded;

    public abstract String getTarget();

    public void load() {
        System.out.println("the gun is loaded...");
        gunLoaded = true;
    }

    public boolean isGunLoaded() {
        return gunLoaded;
    }

    private void pullTrigger() {
        System.out.println("the target " + getTarget() + " was hit");
    }

    public final void shot() {
        if (isGunLoaded()) {
            pullTrigger();
        } else {
            System.out.println("to hit " + getTarget() + ", the gun needs to be loaded first");
        }
        gunLoaded = false;
    }
}
