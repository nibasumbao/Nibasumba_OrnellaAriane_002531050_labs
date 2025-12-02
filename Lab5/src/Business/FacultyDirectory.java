/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Person.Person;
import Business.Profiles.FacultyProfile;
import java.util.ArrayList;
/**
 *
 * @author ornellabajou
 */
public class FacultyDirectory {
    private ArrayList<FacultyProfile> facultyList;

    public FacultyDirectory() {
        facultyList = new ArrayList<>();
    }

    public ArrayList<FacultyProfile> getFacultyList() {
        return facultyList;
    }

    public FacultyProfile newFacultyProfile(Person p) {
        FacultyProfile fp = new FacultyProfile(p);
        facultyList.add(fp);
        return fp;
    }
}
