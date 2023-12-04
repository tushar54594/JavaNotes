//package javatest;
//import java.util.*;
//class Pair implements Comparable<Pair>{
//    int a,b;
//    Pair(int a,int b){
//        this.a=a;this.b=b;
//    }
//    public int compareTo(Pair p){
//        if(this.b > p.b)return 1;
//        return -1;
////        return this.b-p.b;
//    }
//}
//class Solution {
//    public static void main(String[] args) {
////        ArrayList<Integer> li=new ArrayList<>();
////        li.add(1);li.add(2);
////        List<Integer>li2=new ArrayList<>();li1.addAll(li2);
////        List<Integer>li3=Arrays.asList(1,3,4,5);
////        li1.remove(0);
////        System.out.println(li1);
////            List li=new ArrayList<>();
////            li.add(1);li.add("pratham");
////            System.out.println(li);
////            Collections.sort(li);
////            Collections.reverse(li);
//            
////        String s1="abcdef";
////        String s=new String("abc");
////        String s2="abc";
////        System.out.println(s1==s2);
////        System.out.println(s1.equals(s2));
////        System.out.println(s1==s);
////        System.out.println(s1.equals(s));
////        System.out.println(s1.contains("cd"));
////        System.out.println(s1.substring(2));
////        System.out.println(s1.substring(1,5));  //(start,end+1)
////        int a=10;
////        System.out.println(Integer.toBinaryString(a));
////        String x="1234";
////        System.out.println(Integer.parseInt(x));
////        String aa=Integer.toString(a);
//
////          Map<Integer,Integer>map=new HashMap<>();
////          map.put(1,1);
////          map.put(2,3);
////          System.out.println(map);
////          int ar[]={1,1,2,2,1,2};
////          for(int a:ar){
////              map.put(a,map.getOrDefault(a,0)+1);
////          }
////          System.out.println(map);
////          for(int key:map.keySet()){
////              System.out.println(key+" "+map.get(key));
////          }
////          Map<Integer,Integer>map1=new TreeMap<>(); //sorted based on key.
//          
////            Set<Integer>set=new HashSet<>();
////            set.add(2);set.add(1);set.remove(1);
////            for(int x:set)System.out.println(x);
////              Set<Integer>set=new TreeSet<>();
//
////            Stack<Integer>s=new Stack<>();
////            s.push(1);
////            s.pop(); //return top element
////            s.peek();
////            while(!s.isEmpty())
//
////            Queue<Integer>q=new LinkedList<>();
//////            q.add(1);q.add(2);
////            q.offer(1);
////            q.poll();
////            q.peek();
//
////            PriorityQueue<Integer>pq=new PriorityQueue<>();//min heap -default
////            pq.offer(1);pq.offer(2);
////            System.out.println(pq);
////            pq.poll();
////            pq.peek();
////            PriorityQueue<Integer>pq1=new PriorityQueue<>(Collections.reverseOrder());
////            pq1.offer(1);pq1.offer(2);
////            System.out.println(pq1);
//
////            Deque<Integer>dq=new ArrayDeque<>();
////            dq.addFirst(1);dq.addLast(2);
////            dq.pollFirst();dq.pollLast();
////            dq.peekFirst();dq.peekLast();
//            
//
//            int ar[][]={{1,2},{2,1}};
//            ArrayList<Pair>li=new ArrayList<>();
//            for(int i=0;i<ar.length;i++){
//                li.add(new Pair(ar[i][0],ar[i][1]));
//            }
//            Collections.sort(li);
//            for(int i=0;i<li.size();i++){
//                System.out.println(li.get(i).a+" "+li.get(i).b);
//            }
//    }
//}
