class Come_Occurence_of_a_Character {
    static int count(String str, char c){
        int count = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str = "banana";
        char c = 'a';
        int result = count(str, c);
        System.out.println("The character '" + c + "' occurs " + result + " times");
    }
}
