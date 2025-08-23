package Day4_Ans;


class Hospitals {
    void name(String n) {
        System.out.println("name of Hospital : " + n);
    }
}

class Doctor extends Hospitals {
    void no(int n) {
        System.out.println("doctors: " + n);
    } 
}

class Gynac extends Doctor {
    void no(int n) {
        System.out.println("gynac doctors : " + n);
    }
}

class Endo extends Doctor {
    void no1(int n) {
        System.out.println("endo doctors : " + n);
    }
}

class Cardio extends Doctor {
    void no2(int n) {
        System.out.println("cardio doctors : " + n);
    }
}

class Nurse extends Hospitals {
    void nf(int n1) {
        System.out.println("nurses : " + n1);
    }
}


class Accountant extends Hospitals {
    void nf3(int n2) {
        System.out.println("accountants available : " + n2);
    }
}

class Payments extends Accountant {
    void nf4(String types) {
        System.out.println("type of Payments : " + types);
    }
}

class Documentation extends Accountant {
    void nf5(String types) {
        System.out.println("type of Documentation : " + types);
    }
}

public class HospitalDemo1 {
    public static void main(String[] args) {
        Doctor e1 = new Doctor();
        e1.name("my hospitals");
        e1.no(9);

        Gynac g1 = new Gynac();
        g1.no(6);

        Endo j1 = new Endo();
        j1.no1(3);

        Cardio c1 = new Cardio();
        c1.no2(4);

        Nurse p1 = new Nurse();
        p1.nf(54);

        Accountant a1 = new Accountant();
        a1.nf3(6);

        Payments pay1 = new Payments();
        pay1.nf4("all types");

        Documentation doc1 = new Documentation();
        doc1.nf5("medical reports, etc");
    }
}
