package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {

        Prefix pre = new Prefix();
        FirstName first = new FirstName();
        LastName last = new LastName();

        System.out.println(pre.getPre() + first.getFirst() + last.getLast());
    }
}
