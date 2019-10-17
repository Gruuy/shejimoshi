package com.gruuy.shejimoshi.create.FactoryMethod;

import java.util.Scanner;

/**
 * @author: Gruuy
 * @remark:
 * @date: Create in 15:03 2019/10/12
 */
public class Main {
    public static void main(String[] args){
        double r;
        Scanner scanner=new Scanner(System.in);
        r=scanner.nextDouble();
        scanner.close();
        Circle circle=(Circle)new CircleFactory().getObject();
        circle.setR(r);
        System.out.println(circle.getArea() );
        Square square= (Square) new SquareFactory().getObject();
        square.setR(r);
        System.out.println(square.getArea() );
    }
}
