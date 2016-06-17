import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by ANDREY on 16.06.2016.
 */
public class main {
    public static void main (String[] args) {
        collectSet();


        LinkedList <String> groups = new LinkedList();
        groups.add("Test Group");
        groups.add("Dev Group");
        groups.add("Dev Group");
        groups.add("PM Group");
        groups.add("HR Group");

        for (String mainGroup: groups) {
            System.out.print("My " + mainGroup);
            System.out.println("Your " + mainGroup);
        }
        listSet(groups);
        HashSet result;
        result = listSet(groups);
        System.out.println(result);
    }
    private static void collectSet () {
        HashSet <Integer> roles = new HashSet<>();
        roles.add(1);
        roles.add(2);
        roles.add(3);
        roles.add(8);

        System.out.println(roles);

    }

    private static HashSet listSet (LinkedList groupList)  {
        HashSet <String> all = new HashSet<>();
        all.addAll(groupList);
        return all;


    }


}
