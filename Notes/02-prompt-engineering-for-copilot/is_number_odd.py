def is_prime(number):
    """Check if a number is prime."""
    if type(number) != int:
        raise ValueError("O número deve ser um inteiro.")
    
    if number <= 1:
        return False
    
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            return False
    return True