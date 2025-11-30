/* ==========================
   JavaScript Quiz Game
   ========================== */

// 1. Quiz Questions Array
const quizQuestions = [
    {
        question: "What is the capital of India?",
        answer: "new delhi"
    },
    {
        question: "Which planet is called the Red Planet?",
        answer: "mars"
    },
    {
        question: "Who is known as the Father of Computer?",
        answer: "charles babbage"
    },
    {
        question: "Which language is used for web styling?",
        answer: "css"
    },
    {
        question: "What is the largest mammal on Earth?",
        answer: "blue whale"
    }
];

// 2. Function to Run the Quiz
function runQuiz() {
    // 3. Score Initialization
    let score = 0;

    // 4. Loop Through Questions
    for (let i = 0; i < quizQuestions.length; i++) {

        // 5. Prompt for User Input
        let userAnswer = prompt(quizQuestions[i].question);

        // 6. Normalize Input
        userAnswer = userAnswer.toLowerCase().trim();

        // 7. Check Answer
        if (userAnswer === quizQuestions[i].answer) {
            // 8. Correct Feedback
            alert("Correct! 🎉");
            score++;
        } else {
            // 8. Wrong Feedback
            alert("Wrong ❌ The correct answer is: " + quizQuestions[i].answer);
        }
    }

    // 9. Final Score Display
    alert("Quiz Completed! 🎯 Your Score: " + score + "/" + quizQuestions.length);
}

// 10. Run the Quiz Automatically
runQuiz();