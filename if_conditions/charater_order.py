def character():
    char = input("Enter a char: ")

    if char.isalpha():
        print("char is an alphabet")
    elif char.isdigit():
        print("char is a digit")
    else:
        print("special character")
