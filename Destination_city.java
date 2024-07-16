class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> graph = new HashMap<>();
        
        for(List<String> path : paths){
            String source = path.get(0);
            String dest = path.get(1);
            graph.put(source, dest);
        }
        String destination = "";
        for(String source : graph.keySet()){
            //checking if the destination is a source for another city, if not we got our answer
            if(!graph.containsKey(graph.get(source))){
                destination = graph.get(source); 
                break;
            }
        }

        return destination; 
    }
}
