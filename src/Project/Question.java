package Project;

import java.util.ArrayList;
import java.util.List;

class Question {
    private String type;
    private String difficulty;
    private String category;
    private String question;
    private String correctAnswer;
    private List<String> incorrectAnswers;

    // Constructor
    public Question(String type, String difficulty, String category, String question, String correctAnswer, List<String> incorrectAnswers) {
        this.type = type;
        this.difficulty = difficulty;
        this.category = category;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.incorrectAnswers = incorrectAnswers;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(List<String> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "type='" + type + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", category='" + category + '\'' +
                ", question='" + question + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", incorrectAnswers=" + incorrectAnswers +
                '}';
    }
}

  class Quiz {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "In aerodynamics, which force pushes an object upwards?",
                "Lift",
                List.of("Drag", "Weight", "Thrust")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "Which American-owned brewery led the country in sales by volume in 2015?",
                "D. G. Yuengling and Son, Inc",
                List.of("Anheuser Busch", "Boston Beer Company", "Miller Coors")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "Which country has the union jack in its flag?",
                "New Zealand",
                List.of("South Africa", "Canada", "Hong Kong")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "How many furlongs are there in a mile?",
                "Eight",
                List.of("Two", "Four", "Six")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "What is the Spanish word for \"donkey\"?",
                "Burro",
                List.of("Caballo", "Toro", "Perro")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "What is the shape of the toy invented by Hungarian professor Ernő Rubik?",
                "Cube",
                List.of("Sphere", "Cylinder", "Pyramid")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "When someone is inexperienced they are said to be what color?",
                "Green",
                List.of("Red", "Blue", "Yellow")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "Area 51 is located in which US state?",
                "Nevada",
                List.of("Arizona", "New Mexico", "Utah")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "Virgin Trains, Virgin Atlantic and Virgin Racing, are all companies owned by which famous entrepreneur?",
                "Richard Branson",
                List.of("Alan Sugar", "Donald Trump", "Bill Gates")
        ));
        questions.add(new Question(
                "multiple",
                "easy",
                "General Knowledge",
                "What is \"dabbing\"?",
                "A dance",
                List.of("A medical procedure", "A sport", "A language")
        ));

        // Printing all questions
        for (Question q : questions) {
            System.out.println(q);
        }
    }
}

