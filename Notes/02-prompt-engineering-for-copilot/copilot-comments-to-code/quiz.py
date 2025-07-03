import threading

"""
Crie uma lista de questões com 5 perguntas e possíveis respostas cada uma.
cada questão deve ter uma resposta correta e quatro incorretas.
cada resposta correta deve valer 1 ponto e cada resposta incorreta deve valer 0 pontos.
O quiz será sobre as várias capitais do mundo.
"""

questions = [
    {
        "question": "Qual é a capital da França?",
        "options": [
            "Paris",  # Correct answer
            "Londres",
            "Berlim",
            "Madri",
            "Roma"
        ],
        "correct_answer": "Paris"
    },
    {
        "question": "Qual é a capital do Japão?",
        "options": [
            "Tóquio",  # Correct answer
            "Seul",
            "Pequim",
            "Bangkok",
            "Hanoi"
        ],
        "correct_answer": "Tóquio"
    },
    {
        "question": "Qual é a capital do Brasil?",
        "options": [
            "Brasília",  # Correct answer
            "Rio de Janeiro",
            "São Paulo",
            "Salvador",
            "Fortaleza"
        ],
        "correct_answer": "Brasília"
    },
    {
        "question": "Qual é a capital da Austrália?",
        "options": [
            "Canberra",  # Correct answer
            "Sydney",
            "Melbourne",
            "Brisbane",
            "Perth"
        ],
        "correct_answer": "Canberra"
    },
    {
        "question": "Qual é a capital da Rússia?",
        "options": [
            "Moscovo",  # Correct answer
            "São Petersburgo",
            "Kazan",
            "Novosibirsk",
            "Yekaterinburg"
        ],
        "correct_answer": "Moscovo"
    }
]

# Escreva uma função que recebe a questão e as exibe uma a uma para o usuário.
# Ela retorna a resposta do usuário e verifica se está correta.

def display_question_text(question):
    print(question["question"])

def display_options(options):
    for i, option in enumerate(options, start=1):
        print(f"{i}. {option}")

def get_user_answer():
    return input("Escolha a opção correta (1-5): ")

def check_answer(options, correct_answer, user_input):
    try:
        answer_index = int(user_input) - 1
        if options[answer_index] == correct_answer:
            print("Resposta correta!")
            return 1
        else:
            print("Resposta incorreta. A resposta correta é:", correct_answer)
            return 0
    except (ValueError, IndexError):
        print("Opção inválida. Por favor, escolha um número entre 1 e 5.")
        return 0

def show_question(question):
    """
    Displays a multiple-choice question, prompts the user for an answer with a 10-second timeout, and checks if the answer is correct.
    If the input is invalid, the user will be prompted again until a valid answer is given or time runs out.
    Returns:
        int: 1 if the user's answer is correct, 0 otherwise (including invalid input or timeout).
    """
    display_question_text(question)
    display_options(question["options"])
    user_input = None

    def get_input():
        nonlocal user_input
        user_input = get_user_answer()

    print("Você tem 10 segundos para responder...")
    input_thread = threading.Thread(target=get_input)
    input_thread.daemon = True  # Allow thread to exit when main program exits
    input_thread.start()
    input_thread.join(timeout=10)

    if input_thread.is_alive():
        print("\nTempo esgotado! Nenhuma resposta foi registrada.")
        return 0

    try:
        user_input = int(user_input)
        if user_input < 1 or user_input > 5:
            print("Número fora do intervalo permitido.")
            return show_question(question)
    except ValueError:
        print("Entrada inválida. Por favor, insira um número entre 1 e 5.")
        return show_question(question)

    return check_answer(question["options"], question["correct_answer"], user_input)

def main():
    score = 0
    for question in questions:
        score += show_question(question)
    
    print(f"Sua pontuação final é: {score} de {len(questions)}")

if __name__ == "__main__":
    main()