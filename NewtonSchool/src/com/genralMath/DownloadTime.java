package com.genralMath;

import org.w3c.dom.html.HTMLImageElement;

import java.util.Scanner;

public class DownloadTime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int fileSize = sc.nextInt();
        int speed    = sc.nextInt();
        int speedMB  = speed/8;
        int time     = fileSize/speedMB;

        System.out.println("Time in second is : "+time);
    }
}
