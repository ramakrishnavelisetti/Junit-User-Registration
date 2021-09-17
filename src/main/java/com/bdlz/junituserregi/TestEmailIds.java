package com.bdlz.junituserregi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.bdlz.junituserregi.JunitUserRegistration.regex;

public class TestEmailIds {
    public static String regex;

//     "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
//            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
//            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"

//     "abc", "abc@.com.my","abc123@gmail.a", "abc123@.com",
//            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
//            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
//            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"

    public boolean testForValidEmails(String validEmails) {
        regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(validEmails);
        return matcher.matches();
    }
    public boolean testForNonValidEmails(String nonValidEmails) {
        regex = "^[a-zA-Z-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nonValidEmails);
        return matcher.matches();
    }
}
