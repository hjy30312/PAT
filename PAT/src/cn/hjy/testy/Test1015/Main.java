package cn.hjy.testy.Test1015;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int h = sc.nextInt();

        Set<Student> setOne = new TreeSet<>();
        Set<Student> setTwo = new TreeSet<>();
        Set<Student> setThree = new TreeSet<>();
        Set<Student> setFour = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int morality = sc.nextInt();
            int talent = sc.nextInt();

            if (morality >= l && talent >= l) {
                Student temp = new Student(id,morality,talent,h);
                switch (temp.classType) {
                    case 1:
                        setOne.add(temp);
                        break;
                    case 2:
                        setTwo.add(temp);
                        break;
                    case 3:
                        setThree.add(temp);
                        break;
                    case 4:
                        setFour.add(temp);
                        break;
                    default:
                }
            }
        }
        sc.close();

        System.out.println(setOne.size() + setTwo.size() +
                            setThree.size() + setFour.size());
        for (Student s:
                setOne) {
            System.out.printf("%08d %d %d %d\n", s.id, s.morality, s.talent);
        }
        for (Student s:
                setTwo) {
            System.out.printf("%08d %d %d %d\n", s.id, s.morality, s.talent);
        }
        for (Student s:
                setThree) {
            System.out.printf("%08d %d %d %d\n", s.id, s.morality, s.talent);
        }
        for (Student s:
                setFour) {
            System.out.printf("%08d %d %d %d\n", s.id, s.morality, s.talent);
        }

    }
}

class Student implements Comparable<Student> {
    int id;
    int morality;   //品德
    int talent;     //天资
    int score;      //分数
    int classType;

    /**
     * 构造器，得到相对应的第几类考生
     * @param id
     * @param morality
     * @param talent
     * @param h
     */
    public Student(int id, int morality, int talent, int h) {
        this.id = id;
        this.morality = morality;
        this.talent = talent;
        this.score = talent + morality;

        if (morality >= h && talent >= h) {
            classType = 1;
        } else if (morality >= h && talent < h) {
            classType = 2;
        } else if (morality < h && talent > h) {
            classType = 3;
        } else {
            classType = 4;
        }
    }

    /**
     * 返回正数，当前对象要排在比较对象后面，
     * 返回负数放在前面。
     * 分别按德才分数、品德分、id好进行比较
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student o) {

        if (this.score < o.score) {
            return 1;
        } else if (this.score > o.score) {
            return  -1;
        } else {
            if (this.morality < o.morality) {
                return 1;
            } else if (this.morality > o.morality) {
                return -1;
            } else {
                if (this.id > o.id) {
                    return 1;
                } else if (this.id > o.id) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

    }
}