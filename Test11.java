/**
 * Author : Zhang Zhe
 */
public class Test11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRecord(0, "alex", 100);
        float score = s.getRecord(0);
        System.out.println(score);
    }
}
    class Student {
        private int ID;
        private String name;
        private float score ;

        public void setRecord(int ID, String name, float score) {
            this.ID = ID;
            this.name = name;
            this.score = score;
        }

        public float getRecord(int ID) {
            if (ID == this.ID) {
                return this.score;
            } else {
                return -1;
            }
        }
    }

