package app.Service;

import app.list.ContactList;


import java.util.List;
import java.util.Scanner;

public class DataList {
Scanner scanner = new Scanner(System.in);

    List<ContactList> getData(String name, String phone){
        System.out.println("Ведіть ім'я");
         name = scanner.nextLine();
        System.out.println("Ведіть номер телефону");
        phone = scanner.nextLine();
        return List.of(new ContactList(name, phone));

    }

}
