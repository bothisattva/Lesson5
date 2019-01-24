package Woker;

import java.sql.SQLOutput;

public class woker {
    private String FollName;
    private String  Post;
    private String Mail;
    private String phone;
    private String salary;
    private int ege;
    public woker (String _FollName,String  _Post,String _Mail,String _Phone,String _Salary, int _Ege ){
    FollName = _FollName ;
    Post = _Post;
    Mail = _Mail;
    phone = _Phone;
    salary = _Salary;
    ege = _Ege;

        
    }


    public  void EmployeeInformation(){
        System.out.println( FollName + Post + Mail + phone + salary +  ege);
    }
        
    }


