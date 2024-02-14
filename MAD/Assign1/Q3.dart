import 'dart:io';

void main(List<String> args) {
  // 3. Write a program to print a square of a number using user input.
  print("Enter a number to square: ");
  int? num = int.parse(stdin.readLineSync()!);
  int? sqr = num*num;
  print(sqr);
}
