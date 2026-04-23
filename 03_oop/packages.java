public class packages {

}
// It's like a folde or directory that groups related classes together.
// Each file contains one class
// Without package, name conflicts occur.

// Types of Packages:
//-- 1] In-Built Packages:
//  java.lang → basic classes (String, Math)
//  java.util → collections, date, etc.
//  java.io → file handling
// We import them at the start of any JAVA file using: import java.util.ArrayList;

//-- 2]User-defined Packages:
//  package com.myapp.models;
// public class User{

// }


// Ideal File Structure:
//  java.lang → basic classes (String, Math)
//  package com.mycompany.app;
// Folder structure: 
//  com/
//  └── mycompany/
//       └── app/
//            └── Main.java

// Important Rule: Folder names must match package name exactly

// Methods to create a Package in JAVA:
// 1] Directly in Code:
//  Eg: package com.mycompany.app;
//      
//      public class Main {
//          public static void main(String[] args) {
//          System.out.println("Hello");
//          }
//  javac -d . Main.java {👉 -d . creates folder structure automatically}
//  -d tells the compiler **where to place output AND to respect package structure while doing so`
//  The -d keyword specifies the destination for where to save the class file. 
//  to run the above package, run it as follows:-> java com.mycompany.app.Main
//      
// 2] Manually create folders
//  -- com/mycompany/app/
//  -- Place file inside the above folder
//  -- Add package line at the top of the .java file as follows: package com.mycompany.app;

//------------- How to use Package(Import):----------------------
// import com.mycompany.app.Main; OR import com.mycompany.app.*;
//---------------------------------------------------------------

//Benefits of Package:
// 1.Avoid name conflicts:- Two classes with same name can exist safely
// 2.Better organization:- Large projects become manageable
// 3.Access Control- protected, default
// 4.Reusability - Can use package across projects
// 5.Easier Maintenance- You know exactly where things belong


//-------------------- Difference b/w Package and Library -------------------------------
// | Feature | Package                  | Library                           |
// |---------|--------------------------|-----------------------------------|
// | Meaning | Group of related classes | Collection of packages/classes    |
// | Scope   | Small (within project)   | Large (external or reusable code) |
// | Example | `com.myapp.utils`        | Apache Commons                    |
// | Usage   | Organize code            | Add functionality                 |
// --------------------------------------------------------------------------------------
