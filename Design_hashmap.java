class MyHashMap {

   int[] hashmap;
    public MyHashMap() {
       hashmap=new int[1000001];
        Arrays.fill(hashmap,-1);
    }
    
    public void put(int key, int value) {
        hashmap[key]=value;
    }
    
    public int get(int key) {
       return hashmap[key];
    }
    
    public void remove(int key) {
        hashmap[key]=-1;
    }
}
