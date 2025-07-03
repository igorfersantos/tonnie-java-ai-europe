import unittest
from unittest.mock import patch
import threading
import quiz

class TestQuizFunctions(unittest.TestCase):

    def test_check_answer_correct(self):
        options = ["A", "B", "C", "D", "E"]
        correct_answer = "C"
        self.assertEqual(quiz.check_answer(options, correct_answer, "3"), 1)

    def test_check_answer_incorrect(self):
        options = ["A", "B", "C", "D", "E"]
        correct_answer = "C"
        self.assertEqual(quiz.check_answer(options, correct_answer, "2"), 0)

    def test_check_answer_invalid_input(self):
        options = ["A", "B", "C", "D", "E"]
        correct_answer = "C"
        self.assertEqual(quiz.check_answer(options, correct_answer, "abc"), 0)
        self.assertEqual(quiz.check_answer(options, correct_answer, "10"), 0)

    @patch('builtins.input', return_value='1')
    def test_get_user_answer(self, mock_input):
        self.assertEqual(quiz.get_user_answer(), '1')

    def test_display_question_text(self):
        question = {"question": "Test?", "options": [], "correct_answer": ""}
        # Should not raise
        quiz.display_question_text(question)

    def test_display_options(self):
        options = ["A", "B", "C"]
        # Should not raise
        quiz.display_options(options)

    def test_threading_timeout(self):
        # Simulate user not answering in time
        question = {
            "question": "Test?",
            "options": ["A", "B", "C", "D", "E"],
            "correct_answer": "A"
        }
        # Patch input to block forever (simulate no input)
        with patch('builtins.input', side_effect=lambda *a, **k: threading.Event().wait()):
            result = quiz.show_question(question)
            self.assertEqual(result, 0)

    @patch('builtins.input', side_effect=['10', '2'])
    def test_show_question_invalid_then_valid(self, mock_input):
        question = {
            "question": "Test?",
            "options": ["A", "B", "C", "D", "E"],
            "correct_answer": "B"
        }
        # Should prompt again after invalid input, then accept valid
        result = quiz.show_question(question)
        self.assertEqual(result, 1)

    @patch('builtins.input', side_effect=['abc', '1'])
    def test_show_question_non_numeric_then_valid(self, mock_input):
        question = {
            "question": "Test?",
            "options": ["A", "B", "C", "D", "E"],
            "correct_answer": "A"
        }
        result = quiz.show_question(question)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()