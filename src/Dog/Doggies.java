package Dog;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;

public class Doggies {

    private Dog[] pups;

    public Doggies(int size) {
	pups = new Dog[size];
    }

    public void set(int spot, int age, String name) {
        pups[spot]=new Dog(age,name);
    }

    public String getNameOfOldest() {
        Dog ans=new Dog(0,"No Valid Dogs");
        for(Dog i: pups)
            if(i.getAge()>ans.getAge())
                ans=i;
        return ans.getName();
    }

    public String getNameOfYoungest() {
        Dog ans=new Dog(1000,"No Valid Dogs");
        for(Dog i: pups)
            if(i.getAge()<ans.getAge())
                ans=i;
        return ans.getName();
    }

    public String toString() {
        return "" + Arrays.toString(pups);
    }
}
