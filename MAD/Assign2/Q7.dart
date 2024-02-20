import 'dart:io';

void main(List<String> args) {
// 7. Write a dart program to create a simple calculator that performs addition, subtraction, multiplication, and division.

  print("Enter any two number:");
  int? p=int.parse(stdin.readLineSync()!);
  int? o=int.parse(stdin.readLineSync()!);

  int e=p+o;
  int f=p-o;
  int g=p*o;
  double h=p/o;

  print("Addition of $p and $o is: $e");
  print("Subtraction of $p and $o is: $f");
  print("Multiplication of $p and $o is: $g");
  print("Division of $p and $o is: $h");

}
