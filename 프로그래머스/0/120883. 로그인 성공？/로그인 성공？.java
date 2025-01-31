class Solution {
    public String solution(String[] id_pw, String[][] db) {
        boolean idMatched = false;
        boolean pwMatched = false;
        
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                idMatched = true;
                pwMatched = true;
            } else if (id_pw[0].equals(db[i][0])) {
                idMatched = true;
            }
        }
        
        if (idMatched && pwMatched) {
            return "login";
        } else if (idMatched) {
            return "wrong pw";
        } else {
            return "fail";
        }
        
    }
}