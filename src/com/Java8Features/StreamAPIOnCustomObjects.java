package com.Java8Features;



public class StreamAPIOnCustomObjects {

  /*🟢 BASIC LEVEL (Filtering, Mapping)
    1. Find all employees with salary greater than 50,000
        List<Employee> employees = List.of(
                new Employee(1, "A", 45000),
                new Employee(2, "B", 60000),
                new Employee(3, "C", 75000)
        );
    2. Find all employees belonging to the "IT" department

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT"),
                new Employee(2, "B", "HR"),
                new Employee(3, "C", "IT")
        );
    3. Get a list of employee names using Streams

        List<Employee> employees = List.of(
                new Employee(1, "Alex"),
                new Employee(2, "Brian"),
                new Employee(3, "Charles")
        );
    4. Count the number of employees

        List<Employee> employees = List.of(
                new Employee(1, "A"),
                new Employee(2, "B"),
                new Employee(3, "C"),
                new Employee(4, "D")
        );
    5. Check if any employee has salary less than 30,000

        List<Employee> employees = List.of(
                new Employee(1, "A", 40000),
                new Employee(2, "B", 25000),
                new Employee(3, "C", 55000)
        );

    🟡 INTERMEDIATE LEVEL (Sorting, Finding)
    6. Find the employee with the highest salary

        List<Employee> employees = List.of(
                new Employee(1, "A", 45000),
                new Employee(2, "B", 85000),
                new Employee(3, "C", 65000)
        );
    7. Find the employee with the lowest salary

        List<Employee> employees = List.of(
                new Employee(1, "A", 30000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 50000)
        );
    8. Sort employees by salary in ascending order

        List<Employee> employees = List.of(
                new Employee(1, "A", 70000),
                new Employee(2, "B", 40000),
                new Employee(3, "C", 60000)
        );
    9. Sort employees by name alphabetically

        List<Employee> employees = List.of(
                new Employee(1, "Charlie"),
                new Employee(2, "Alice"),
                new Employee(3, "Bob")
        );
    10. Find the second highest paid employee

        List<Employee> employees = List.of(
                new Employee(1, "A", 90000),
                new Employee(2, "B", 75000),
                new Employee(3, "C", 60000),
                new Employee(4, "D", 90000)
        );

    🔵 ADVANCED LEVEL (Grouping, Partitioning)
    11. Group employees by department

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT"),
                new Employee(2, "B", "HR"),
                new Employee(3, "C", "IT")
        );
    12. Count employees in each department

        List<Employee> employees = List.of(
                new Employee(1, "A", "Finance"),
                new Employee(2, "B", "Finance"),
                new Employee(3, "C", "IT")
        );
    13. Group employees by salary range (<50k, 50k–80k, >80k)

        List<Employee> employees = List.of(
                new Employee(1, "A", 45000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 90000)
        );
    14. Partition employees into salary > 60,000 and ≤ 60,000

        List<Employee> employees = List.of(
                new Employee(1, "A", 55000),
                new Employee(2, "B", 65000),
                new Employee(3, "C", 45000)
        );
    15. Find the highest paid employee in each department

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT", 70000),
                new Employee(2, "B", "IT", 90000),
                new Employee(3, "C", "HR", 60000)
        );

    🔴 TRICKY / REAL INTERVIEW QUESTIONS
    16. Find employees whose names start with letter 'A'

        List<Employee> employees = List.of(
                new Employee(1, "Alex"),
                new Employee(2, "Brian"),
                new Employee(3, "Andrew")
        );
    17. Find duplicate employees based on employee name

        List<Employee> employees = List.of(
                new Employee(1, "A"),
                new Employee(2, "B"),
                new Employee(3, "A")
        );
    18. Remove duplicate employees based on employee ID

        List<Employee> employees = List.of(
                new Employee(1, "A"),
                new Employee(1, "A"),
                new Employee(2, "B")
        );
    19. Convert employee list into Map<id, name>

        List<Employee> employees = List.of(
                new Employee(1, "A"),
                new Employee(2, "B")
        );
    20. Convert employee list into Map<department, List<Employee>>

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT"),
                new Employee(2, "B", "HR"),
                new Employee(3, "C", "IT")
        );

    ⭐ EXPERT / EDGE CASES
    21. Find employees whose salary is null-safe greater than 50,000

        List<Employee> employees = List.of(
                new Employee(1, "A", null),
                new Employee(2, "B", 60000)
        );
    22. Sort employees by salary, then by name

        List<Employee> employees = List.of(
                new Employee(1, "A", 60000),
                new Employee(2, "B", 60000),
                new Employee(3, "C", 50000)
        );
    23. Find the average salary of employees

        List<Employee> employees = List.of(
                new Employee(1, "A", 40000),
                new Employee(2, "B", 60000),
                new Employee(3, "C", 80000)
        );
    24. Check if all employees belong to the same department

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT"),
                new Employee(2, "B", "IT")
        );
    25. Find the first employee whose salary is greater than 70,000

        List<Employee> employees = List.of(
                new Employee(1, "A", 65000),
                new Employee(2, "B", 75000),
                new Employee(3, "C", 85000)
        );
    */

    public static void main(String[] args){

    }
}
