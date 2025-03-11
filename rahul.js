```json
{
  "Omen.py": "from math import sqrt\n\n# n is the number to be checked whether it is prime or not\nn = 1\n# this flag maintains status whether the n is prime or not\nprime_flag = 0\nif n > 1:\n    for i in range(2, int(sqrt(n)) + 1):\n        if n % i == 0:\n            prime_flag = 1\n            break\n    if prime_flag == 0:\n        print(\"True\")\n    else:\n        print(\"False\")\nelse:\n    print(\"False\")"
}
```
