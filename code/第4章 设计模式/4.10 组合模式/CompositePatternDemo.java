public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CTO = new Employee("Terry", "CTO");

        Employee pm1 = new Employee("Henry", "Project Manager");
        Employee pm2 = new Employee("Bob", "Project Manager");

        Employee e1 = new Employee("Lily", "Java Engineer");
        Employee e2 = new Employee("Alice", "Python Engineer");
        Employee e3 = new Employee("Eric", "C Engineer");

        pm1.addSubordinate(e1);
        pm1.addSubordinate(e2);
        pm2.addSubordinate(e3);

        CTO.addSubordinate(pm1);
        CTO.addSubordinate(pm2);

        printEmployeeTree(CTO, 0);
    }

    public static void indent(int level) {
        for(int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }

    public static void printEmployeeTree(Employee root, int level) {
        System.out.println(root);
        for(Employee e : root.getSubordinates()) {
            indent(++level);
            if(!e.getSubordinates().isEmpty()) {
                printEmployeeTree(e, level);
            } else {
                System.out.println(e);
            }
            level--;
        }
    }
}
