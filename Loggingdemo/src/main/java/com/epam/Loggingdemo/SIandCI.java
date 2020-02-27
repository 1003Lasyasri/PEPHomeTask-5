package com.epam.Loggingdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
class Interest
{
    int principal;
    int rate;
    int time;
    double simpleInterest;
    double compoundInterest;
    Interest(int principal,int rate,int time)
    {
        this.principal=principal;
        this.rate=rate;
        this.time=time;
    }
    public double SimpleInterest()
    {
        simpleInterest=(principal*rate*time)/100;
        return simpleInterest;
    }
    public double CompoundInterest()
    {
    	compoundInterest=principal * Math.pow(1.0+rate/100.0,time) - principal;
        return compoundInterest;
    }
}
public class SIandCI
{
    private static final Logger LOGGER= LogManager.getLogger(SIandCI.class);
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int principal=s.nextInt();
        int rate=s.nextInt();
        int time=s.nextInt();
        Interest it=new Interest(principal,rate,time);
        double si=it.SimpleInterest();
        double ci=it.CompoundInterest();
        String compound=String.format("%.2f", ci);
        LOGGER.debug("Simple Interest: "+si);
        LOGGER.debug("Compound Interest: "+compound);
    }}