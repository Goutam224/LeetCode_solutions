class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result=new ArrayList<>();
        for(String word:words){
            String[] str=word.split("\\"+separator);
            for(String splitword:str){
                if(!splitword.isEmpty()){
                    result.add(splitword);
                }
            }
        }
        return result;
    }
}
