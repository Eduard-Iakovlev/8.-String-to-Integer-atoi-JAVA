# 8. String to Integer (atoi)

Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.

Example 1:

Input: s = "42"

Output: 42

Explanation:

The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
^
Step 3: "42" ("42" is read in)
^
Example 2:

Input: s = " -042"

Output: -42

Explanation:

Step 1: "   -042" (leading whitespace is read and ignored)
^
Step 2: "   -042" ('-' is read, so the result should be negative)
^
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
^
Example 3:

Input: s = "1337c0d3"

Output: 1337

Explanation:

Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
^
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
^
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
^
Example 4:

Input: s = "0-1"

Output: 0

Explanation:

Step 1: "0-1" (no characters read because there is no leading whitespace)
^
Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
^
Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
^
Example 5:

Input: s = "words and 987"

Output: 0

Explanation:

Reading stops at the first non-digit character 'w'.

Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.

# 8. Преобразование строки в целое число (atoi)

Реализуйте функцию myAtoi(string s), которая преобразует строку в 32-битное целое число со знаком.

Алгоритм для myAtoi(string s) заключается в следующем:

Пробел: игнорируйте все начальные пробелы (" ").
Знак: определите знак, проверив, является ли следующий символ '-' или '+', и предположив, что он положительный, если ни того, ни другого нет.
Преобразование: считайте целое число, пропуская ведущие нули, пока не встретите нецифровой символ или не достигнете конца строки. Если не было считано ни одной цифры, то результатом будет 0.
Округление: если целое число выходит за пределы 32-битного диапазона целых чисел со знаком [-231, 231 - 1], то округлите его так, чтобы оно оставалось в этом диапазоне. В частности, целые числа меньше -231 должны быть округлены до -231, а целые числа больше 231 - 1 должны быть округлены до 231 - 1.
Верните целое число в качестве конечного результата.

Пример 1:

Ввод: s = "42"

Результат: 42

Объяснение:

Подчёркнутые символы — это то, что считывается, а курсор — это текущая позиция считывающего устройства.
Шаг 1: "42" (символы не считываются, потому что нет начальных пробелов)
^
Шаг 2: "42" (символы не считываются, потому что нет ни '-', ни '+')
^
Шаг 3: "42" ("42" считывается)
Пример 2:

Ввод: s = «-042»

Результат: -42

Объяснение:

Шаг 1: "   -042" (пробелы в начале считываются и игнорируются)
^
Шаг 2: " -042" (считывается '-', поэтому результат должен быть отрицательным)
^
Шаг 3: " -042" ("042" считывается, ведущие нули в результате игнорируются)
Пример 3:

Ввод: s = "1337c0d3"

Результат: 1337

Объяснение:

Шаг 1: "1337c0d3" (не считывается ни одного символа, так как нет начальных пробелов)
^
Шаг 2: "1337c0d3" (не считывается ни одного символа, так как нет ни '-', ни '+')
^
Шаг 3: "1337c0d3" ("1337" считывается; чтение останавливается, потому что следующий символ не является цифрой)
Пример 4:

Ввод: s = "0-1"

Результат: 0

Объяснение:

Шаг 1: «0-1» (не считывается ни одного символа, так как нет начальных пробелов)
^
Шаг 2: «0-1» (не считывается ни одного символа, так как нет ни «-», ни «+»)
^
Шаг 3: «0-1» («0» считывается; чтение останавливается, потому что следующий символ не является цифрой)
Пример 5:

Ввод: s = «слова и 987»

Результат: 0

Объяснение:

Чтение останавливается на первом нецифровом символе «w».

Ограничения:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'