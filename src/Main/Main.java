package Main;


import Model.Developer.*;
import Model.HavuzAlanı.Cuboid;
import Model.HavuzAlanı.Rectangle;
import Model.Silindir.Circle;
import Model.Silindir.Cylinder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("DEVELOPER.............................");

        Employee developer1 = new Employee(1,"Enes",260000);

        System.out.println(developer1);

        // Junior Developer'ı test etme
        JuniorDeveloper juniorDev = new JuniorDeveloper(1, "John Doe", 0);
        juniorDev.Work();
        System.out.println(juniorDev);

        // Middle Developer'ı test etme
        MidDeveloper midDev = new MidDeveloper(2, "Jane Smith", 0);
        midDev.Work();
        System.out.println(midDev);

        // Senior Developer'ı test etme
        SeniorDeveloper seniorDev = new SeniorDeveloper(3, "Alice Johnson", 0);
        seniorDev.Work();
        System.out.println(seniorDev);

        // HRManager'ı test etme
        JuniorDeveloper[] juniors = new JuniorDeveloper[3];
        MidDeveloper[] mids = new MidDeveloper[2];
        SeniorDeveloper[] seniors = new SeniorDeveloper[1];

        HRManager hrManager = new HRManager(4, "HR Manager", 0, juniors, mids, seniors);
        hrManager.addEmploye(0, juniorDev);
        hrManager.addEmploye(0, midDev);
        hrManager.addEmploye(0, seniorDev);

        hrManager.words();
        System.out.println("HR Manager: " + hrManager);
        System.out.println("Junior Developers: " + Arrays.toString(juniors));
        System.out.println("Middle Developers: " + Arrays.toString(mids));
        System.out.println("Senior Developers: " + Arrays.toString(seniors));
    }




    }


