package com.akis_yazilim.oracle.melih.product.utility;

public class Util
{
    private Util() {}



    private static String createGeneralException(Exception e)
    {

        return  e.getClass().getSimpleName() + "is occured. Error message." + e.getMessage();

    }
 public static void showExceptionMessage(Exception e)
 {
     System.err.println(createGeneralException(e));
 }

}
