package com.ug14.rumahsakit;

public class Pasien {
    String nama, alamat, penyakit, status;
    int usia, level_penyakit;
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("nama:-");
        nama = input.nextline();
        System.out.print("alamat:-");
        alamat = input.nextLine();
        System.out.print("penyakit:-");
        penyakit = input.nextLine();
        System.out.print("status:-");
        status = input.nextLine();
        System.out.print("usia:-");
        usia = input.nextLine();
        System.out.print("level_penyakit:-");
        usia = input.nextLine();
    }
    void patient_info()
    {
        System.out.println(nama + "\t" + alamat + " \t" + penyakit + "     \t" + status + "      \t" + usia + "\t" + level_penyakit);
    }
}
}
