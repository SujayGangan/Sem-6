import 'dart:io';

void main(List<String> args) {
  // 5. Write a function in Dart called maxNumber that takes three numbers as arguments and returns the largest number.

  stdout.write("Enter 3 numbers : \n");

  stdout.write("Enter First Number : ");
  double? num1 = double.parse(stdin.readLineSync()!);

  stdout.write("Enter Second Number : ");
  double? num2 = double.parse(stdin.readLineSync()!);

  stdout.write("Enter Third Number : ");
  double? num3 = double.parse(stdin.readLineSync()!);

  stdout.write(
      "Maximum number out of above 3 numbers is : ${maxNumber(num1, num2, num3)}");
}

double maxNumber(double a, double b, double c) {
  if (a > b && a > c) {
    return a;
  } else if (b > a && b > c) {
    return b;
  } else {
    return c;
  }
}
