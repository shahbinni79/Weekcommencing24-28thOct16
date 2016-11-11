/**
 * Created by sreenivas on 31/10/2016.
 */
public class No15_GetterSetter {
        private String name;
        private int score;
        public String getName() {
            return name;  // here name is instance variable
        }
        public void setName(String name) {
            this.name = name;  // ("this.name" refers to the instance variable)
        }
        public int getScore() {
            return score;
        }
        public void setScore(int score) {

            this.score = score;
        }
    }
