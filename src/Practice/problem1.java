package Practice;

import java.util.*;

public class problem1 {
    public static void main(String[] arr) {
        //String a = "GOKARNA";
        String a = "KARNATAKA";
      /*A,AK
A
0
*/
        char[] ch = a.toCharArray();
        boolean flag = false;
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {

                if (ch[i] == ch[j]) {//ch1[i] = ch[i];
                    //chlist.add(ch[i]);
                    flag = true;
                    System.out.println(ch[i]);
                    break;
                }
            }
        }
        if(!flag)
        {
            System.out.println("0");
        }


//        System.out.println(sol(a));
//        System.out.println(sol(b));
//
//
//    }
//
//    public static Set sol(String x)
//    {
//        char[] ch = x.toCharArray();
//        char[] ch1 = new char[x.length()];
//        List chlist = new ArrayList();
//        Set s = new HashSet<>();
//
//        for(int i =0; i<x.length(); i++)
//        {
////          if(map.containsKey(ch[i]))
////          {
////              map.put(ch[i], map.get(ch[i])+1);
////          }
////          else
////          {
////              map.put(ch[i], 1);
////          }
////          if(map.get(ch[i])>1)
////          {
////              System.out.println(map.get(ch[i]));
////          }
//
//            for(int j = i+1; j<x.length();j++)
//            {
//
//                if(ch[i]==ch[j])
//                {
//                    ch1[i] = ch[i];
//                    chlist.add(ch[i]);
//                    break;
//                }
//            }
//        }
//        s.add(chlist);
//        return s;
//    }


    }
}





