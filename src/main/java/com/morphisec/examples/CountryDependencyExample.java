package com.morphisec.examples;

import com.morphisec.enums.Country;
import com.morphisec.model.User;

public class CountryDependencyExample {
    public static void main(String[] args) {
        User user = new User("Benny", "Regev", Country.ISRAEL);
        System.out.println("-------------------------------------------------");
        System.out.println("* print user object instance using method toString(): ");
        System.out.println(user);
        System.out.println("-------------------------------------------------");
        System.out.println("* print user object instance using method toJson(): ");
        System.out.println("User: \n" + user.toJson());
    }
}
