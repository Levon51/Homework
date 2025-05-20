package collections;

import java.util.*;

public class Exercise {
    public static ArrayList<Integer> copyArrayList(ArrayList<Integer> a1){
        return new ArrayList<>(a1);
    }

    public static void reverseList(ArrayList<Integer> b1){
        Collections.reverse(b1);//կարանք for ցիկլով էլ գրենք
    }

    public static void swapping(ArrayList<Integer> c1){
       Collections.swap(c1,4,5);
    }

    public static void printList(ArrayList<Integer> print){
        System.out.println(print);
    }

    public static void listSort(ArrayList<Integer> sortList){
        Collections.sort(sortList);
    }

    public static void remove(ArrayList<Integer> remove){
       for (int i = 0; i < remove.size();i++){
           for(int j = 0; j < remove.size();j++){
               if(remove.get(i).equals(remove.get(j))){
                   remove.remove(j);
                    j--;
               }
           }
       }
    }

    public static List<Integer> findElements(ArrayList<Integer> a1, ArrayList<Integer> a2){
        List<Integer> find = new ArrayList<>(a1);
        find.retainAll(a2);
        return find;
    }

    public static int bigNumber(ArrayList<Integer> big){
       return Collections.max(big);
    }

    public static List<Integer> combine(List<Integer> ai,List<Integer> al){
        List<Integer> l = new ArrayList<>(ai);
        l.addAll(al);
        return l;
    }

    public static int findSecondBigNumber(ArrayList<Integer> secondNumber){
        Integer number = null;
        Integer secondNumber1 = null;
        for (Integer num : secondNumber) {
            if (number == null || num > number) {
                if (number != null && !num.equals(number)) {
                    secondNumber1 = number;
                }
                number = num;
            } else if (!num.equals(number)) {
                if (secondNumber1 == null || num > secondNumber1) {
                    secondNumber1 = num;
                }
            }
        }
        return secondNumber1;
    }

    public static LinkedList<String> reversing(LinkedList<String> list){
        Collections.reverse(list);
        return list;
    }

    public static String findMiddle(LinkedList<String> list){
        int a = 0;
        int b = 0;

        while(b < list.size() - 1){
            a++;
            b += 2;
        }
        return list.get(a);
    }

    public static void removeDuplicate(LinkedList<String> list){
        for(int i = 0; i < list.size(); i++){
            for(int k = 0; k < list.size(); k++){
                if(list.get(i).equals(list.get(k))){
                    list.remove(k);
                    k--;
                }
            }
        }
    }

    public static boolean palindrome(LinkedList<Integer> list){
        LinkedList<Integer> reversed = new LinkedList<>(list);
        Collections.reverse(reversed);
        return list.equals(reversed);
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static String reverseText(Stack<Character> hj) {
        StringBuilder sb = new StringBuilder();
        while(!hj.isEmpty()){
        sb.append(hj.pop());}
        return sb.toString();
    }
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1,5,58,0,58,75));
        copyArrayList(b);
        reverseList(b);
        swapping(b);
        printList(b);
        listSort(b);
        remove(b);
        ArrayList<Integer> st = new ArrayList<>(Arrays.asList(1,90,42,75,5));
        findElements(b,st);
        bigNumber(st);
        combine(b,st);
        findSecondBigNumber(st);
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Anna","Lisa","Robert","Xavier"));
        reversing(linkedList);
        findMiddle(linkedList);
        removeDuplicate(linkedList);
        LinkedList<Integer> palindrome = new LinkedList<>();
        Collections.addAll(palindrome,1,2,3,4,4,3,2,1);
        isBalanced("([{}])");
        Stack<Character> name = new Stack<>();
        name.push('p');
        name.push('o');
        name.push('t');
        name.push('a');
        name.push('t');
        name.push('o');
        reverseText(name);
    }
}