//package com.newton.array;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
//
//public class Sorting {
//
//
//    public static void main(String[] args) {
//        Map<Integer,Student> map = new HashMap<>();
//        map.put(123, new Student("Ashwini","Ashwini@gmail.com","12121212121",123));
//        map.put(124, new Student("Nicky","Nicky@gmail.com","12121212121",123));
//
//
//
//        System.out.println(map.getOrDefault(123, new Student("admin","admin@gmail.com","12121212121",123)));
//
//
//        //one format
//        Set<Map.Entry<Integer, Student>> entry = map.entrySet();
//        for(Map.Entry<Integer, Student> entries: entry) {
//            System.out.println("key : "+entries.getKey()+"| value : "+entries.getValue());
//        }
//
//        //2nd format
//        Set<Integer> keySets=map.keySet();
//        for(Integer key: keySets) {
//            System.out.println("key : "+key+"| value : "+map.get(key));
//
//        }
//
//        //3rd format
//        Collection<Student> student = map.values();
//        Iterator<Student> itr = student.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//    }
//
//}
//
//class Student{
//    private String name;
//    private String mailId;
//    private String phoneNo;
//    private int rollNo;
//
//
//    public Student(String name, String mailId, String phoneNo, int rollNo) {
//        super();
//        this.name = name;
//        this.mailId = mailId;
//        this.phoneNo = phoneNo;
//        this.rollNo = rollNo;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getMailId() {
//        return mailId;
//    }
//    public void setMailId(String mailId) {
//        this.mailId = mailId;
//    }
//    public String getPhoneNo() {
//        return phoneNo;
//    }
//    public void setPhoneNo(String phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//    public int getRollNo() {
//        return rollNo;
//    }
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//    @Override
//    public String toString() {
//        return "Student [name=" + name + ", mailId=" + mailId + ", phoneNo=" + phoneNo + ", rollNo=" + rollNo + "]";
//    }
//
//}
