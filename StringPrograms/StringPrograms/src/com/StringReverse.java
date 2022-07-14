package com;
import java.io.*;
import java.util.*;

//Class of ReverseString
class StringReverse {
 public static void main(String[] args)
 {
     String input = "GeeksforGeeks";
System.out.println(new String(result));
     // getBytes() method to convert string
     // into bytes[].
     byte[] strAsByteArray = input.getBytes();

     byte[] result = new byte[strAsByteArray.length];
System.out.println(new String(result));
     // Store result in reverse order into the
     // result byte[]
     for (int i = 0; i < strAsByteArray.length; i++)
         result[i] = strAsByteArray[strAsByteArray.length - i - 1];

     System.out.println(new String(result));
  System.out.println(new String(result));
  System.out.println(new String(result));
  System.out.println(new String(result));
 }
}
