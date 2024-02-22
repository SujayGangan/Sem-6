import 'dart:io';

void main(List<String> args) {
  // 4. Write a function in Dart named add that takes two numbers as arguments and returns their sum.

  stdout.write("Enter First Number : ");
  double? num1 = double.parse(stdin.readLineSync()!);
  stdout.write("Enter Second Number : ");
  double? num2 = double.parse(stdin.readLineSync()!);

  stdout.write("Sum of two numbers is : ${add(num1, num2)}");
}

double add(double a, double b) {
  double? sum = a + b;
  return sum;
}
