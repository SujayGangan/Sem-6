import 'dart:io';

void main(List<String> args) {
  // 6. Write a function in Dart called isEven that takes a number as an argument and returns True if the number is even, and False otherwise.

  stdout.write("Enter a number : ");
  int? num = int.parse(stdin.readLineSync()!);
  stdout.write("${isEven(num)}");
}

bool isEven(int num) {
  if (num % 2 == 1) {
    return false;
  }

  return true;
}
