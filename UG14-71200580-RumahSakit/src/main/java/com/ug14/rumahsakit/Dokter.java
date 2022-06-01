package com.ug14.rumahsakit;

import java.util.Scanner;

public class Dokter {
    String nama, spesialis, ruangan;
    void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("nama:-");
        spesialis = input.nextLine();
        System.out.print("spesialis:-");
        ruangan = input.nextLine();
        System.out.print("ruangan:-");
    }
    void doctor_info()
    {
        System.out.println(nama + "\t" + spesialis + "  \t" + ruangan);
    }
}
