public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 28;
        boolean isManSex = true;
        double height = 1.78;
        char firstLetterOfName = 'M';

        if (age > 20) {
            System.out.println("Значит за пивом без паспорта");
        } 

        if (!isManSex) {
            System.out.println("Мужской пол");
        } 
        if (isManSex) {
            System.out.println("Не мужской пол");
        } 
        
        if (height < 1.80) {
            System.out.println("Коротышка-это судьба");
        } else if {
            System.out.println("Ну ты и великан");          
        }
        
        if (firstLetterOfName == 'M') {
            System.out.println("Знакомьтесь-это Миша");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Знакомьтесь-это Игорек");
        } else {
            System.out.println("Без Игоря и Миши будут не интересно");
        }
    }
}
