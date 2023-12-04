/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionshop;

/**
 *
 * @author thara
 */
public class OrderUtils {
    public static double getAmountBySize(String size) {
        double amount = 0;
        if (size.equalsIgnoreCase("XS")) {
            amount = 600;
        } else if (size.equalsIgnoreCase("S")) {
            amount = 800;
        } else if (size.equalsIgnoreCase("M")) {
            amount = 900;
        } else if (size.equalsIgnoreCase("L")) {
            amount = 1000;
        } else if (size.equalsIgnoreCase("XL")) {
            amount = 1100;
        } else if (size.equalsIgnoreCase("XXL")) {
            amount = 1200;
        }
        return amount;
    }

    public static boolean validSize(String size) {
        String[] allowedSizes = {"XS", "S", "M", "L", "XL", "XXL"};
        for (String allowedSize : allowedSizes) {
            if (size.equals(allowedSize)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10 || phoneNumber.charAt(0) != '0') {
            return false;
        }
        return true;
    }

    public static boolean validQuantity(int qty) {
        if (qty < 0) {
            return false;
        } else {
            return true;
        }
    }
    
}
