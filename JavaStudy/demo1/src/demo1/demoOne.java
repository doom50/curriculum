package demo1;

import java.util.Objects;

public class demoOne {
    private String firstName;

    public demoOne(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof demoOne)) {
            return false;
        }
        demoOne other = (demoOne) obj;
        return Objects.equals(firstName, other.firstName);
    }

    
}