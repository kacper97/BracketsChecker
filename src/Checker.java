Algorithm checkBalance (expression)
    // Returns true if the parentheses, brackets, and braces in an expression are paired correctly.
    isBalanced = true
    while ((isBalanced == true) and not at end of expression)
{
    nextCharacter = next character in expression
        switch (nextCharacter)
    {
        case '(':
        case '[':
        case '{':
            Push nextCharacter onto stack
            break
            
            case ')':
            case ']':
            case '}':
                if (stack is empty)
                    isBalanced = false
                 else
                {
                    openDelimiter = top entry of stack
                    Pop stack
                    isBalanced = true or false according to whether openDelimiter and
                    nextCharacter are a pair of delimiters
                }
                break
    }
}
if (stack is not empty)
    isBalanced = false
        return isBalanced