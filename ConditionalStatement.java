public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 28;
        if (age > 20) {
            System.out.println("Значит за пивом без паспорта");
        } 

        boolean isManSex = true;
        if (!isManSex) {
            System.out.println("Мужской пол");
        } else if (isManSex) {
            System.out.println("Не мужской пол");
        } 

        double height = 1.78;
        if (height < 1.80) {
            System.out.println("Коротышка-это судьба");
        } else {
            System.out.println("Ну ты и великан");          
        }

        char firstLetterOfName = 'M';
        if (firstLetterOfName == 'M') {
            System.out.println("Знакомьтесь, это-Миша");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Знакомьтесь, это-Игорь");
        } else {
            System.out.println("Без Игоря и Миши будут не интересно");
        }
    }
}
