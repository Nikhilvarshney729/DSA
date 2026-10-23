public class Leetcode_551_Student_Attendance_Record_I {
    public boolean checkrecord(String s) {
        int A = 0;
        int L = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 'A'){
                A++;
            }
            if(s.charAt(i) == 'L'){
                L++;
            }else{
                L=0;
            }
            if(A >= 2 || L >= 3){
                return false;
            }
        }
        return true;

        
//       input -> s = "PPALLL"
//         output -> false
    }
}
