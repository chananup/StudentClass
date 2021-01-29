/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredesignarray;

/**
 *
 * @author chand
 */
public class StudentList {
    
    public static void main(String[]args){
        
        SudentClass [] studentArray = new SudentClass[2];
        SudentClass s1 = new SudentClass();
        s1.setName("anu");
        SudentClass s2 = new SudentClass();
        s2.setName("chandran");
        
        studentArray[0]=s1;
        studentArray[1]=s2;
        
//        for(SudentClass s: studentArray){
//            System.out.println(s.getName());
//        }
        
         for(int i=0; i<studentArray.length;i++){
            System.out.println(studentArray[i].getName());
        }
        
    }
}
