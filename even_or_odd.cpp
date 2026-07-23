#include <string>
#include <iostream>

std::string even_or_odd(int number) 
{
  return number % 2 == 0 ? "Even" : "Odd";
}

int main()
{
    std::cout << even_or_odd(2)  << "\n";  // Even
    std::cout << even_or_odd(7)  << "\n";  // Odd
    std::cout << even_or_odd(0)  << "\n";  // Even
    std::cout << even_or_odd(-3) << "\n";  // Odd
    return 0;
}