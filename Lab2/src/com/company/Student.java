package com.company;

import java.text.SimpleDateFormat;

public class  Student {
    private String Surname;
    private String Name;
    private String BirthDate;
    private String Telephone;
    private String HomeAddress;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy") {{ setLenient(false); }};

    public int[] Input(String Surname, String Name, String BirthDate, String Telephone, String HomeAddress) {
        int[] ErrorInput = new int[2];
        this.Surname = Surname;
        this.Name = Name;
        if(isValidDate(BirthDate)) {
            this.BirthDate = BirthDate;
        } else {
            ErrorInput[0] = 1;
        }

        if(Telephone.length() < 16 || Telephone.length() > 16) {
            ErrorInput[1] = 1;
        } else {
            if (Telephone.charAt(0) != '+' || Telephone.charAt(3) != '(' || Telephone.charAt(7) != ')' || Telephone.charAt(11) != '-') {
                ErrorInput[1] = 1;
            } else {
                this.Telephone = Telephone;
                ErrorInput[1] = 0;
            }
        }

        this.HomeAddress = HomeAddress;

        return ErrorInput;
    }

    public static boolean isValidDate(String date) {
        try {
            return sdf.format(sdf.parse(date)).equals(date);
        }catch (Exception ex){
            return false;
        }
    }

    public String getSurname() {
        return this.Surname;
    }

    public String getName() {
        return this.Name;
    }

    public String getBirthDate() {
        return this.BirthDate;
    }

    public String getTelephone() {
        return this.Telephone;
    }

    public String getHomeAddress() {
        return this.HomeAddress;
    }

}
