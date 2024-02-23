import 'dart:io';

void main(List<String> args) {
  // 2. Create a set of fruits and print all fruits using loop.

  Set<String> fruits = {"Mango", "Berry", "Apple", "Grapes"};

  fruits.forEach((fruit) { 
    stdout.write("Fruit: $fruit \n");
  });
}
