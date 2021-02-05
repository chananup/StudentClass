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
public class PartTimeStudent extends SoftwareDesignArray {
    private int numcourse;
    
    public PartTimeStudent(int numofc){
        numcourse=numofc;
    }
    
    public int getNumCourses(){
        return numcourse;
    }
    
    public void setNumCourses(int numCourses) {
this.numcourse = numcourse;
}
}
