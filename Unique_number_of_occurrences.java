class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer,Integer> m=new HashMap<>();
    HashSet<Integer> set=new HashSet<>();
    for(int n:arr){
        m.put(n,m.getOrDefault(n,0)+1);
    }

    for(Map.Entry<Integer,Integer> entry:m.entrySet()){
        int v=entry.getValue();
        if(set.contains(v)){
            return false;
        }else{
            set.add(v);
        }
    }
    return true;
    }
}
